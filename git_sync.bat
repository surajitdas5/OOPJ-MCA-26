@echo off
setlocal
Title Git Sync Utility - Silicon
color 0A

:: ----------------------------------------------------------
:: CONFIGURATION: Direct Key Mode (Syntax Fixed)
:: ----------------------------------------------------------
:: We use forward slashes (/) for the key path. 
:: We removed the outer quotes that were causing the crash.
set GIT_SSH_COMMAND=ssh -i "%USERPROFILE%/.ssh/silicon" -o IdentitiesOnly=yes

echo ========================================================
echo   Git Sync Utility: Direct Key Mode
echo ========================================================
echo.

:: ----------------------------------------------------------
:: STEP 1: Pull latest changes
:: ----------------------------------------------------------
echo [Step 1] Pulling updates from origin/main...

:: Check if git is actually installed/recognized in CMD
where git >nul 2>nul
if %ERRORLEVEL% NEQ 0 (
    echo.
    echo [CRITICAL ERROR] Git is not found in your Windows PATH.
    echo Since you use Git Bash, you might not have added Git to the Windows Command Prompt.
    echo.
    echo Please re-install Git for Windows and select "Add Git to PATH"
    echo OR run this script via Git Bash instead.
    pause
    exit /b
)

git pull origin main

:: ----------------------------------------------------------
:: STEP 2: Add changes and ask for commit message
:: ----------------------------------------------------------
echo.
echo [Step 2] Staging changes...
git add .

echo.
set /p "CommitMessage=Enter commit message: "

if "%CommitMessage%"=="" (
    echo.
    echo [ERROR] Commit message cannot be empty. Aborting push.
    pause
    exit /b
)

git commit -m "%CommitMessage%"

:: ----------------------------------------------------------
:: STEP 3: Push to main
:: ----------------------------------------------------------
echo.
echo [Step 3] Pushing to origin/main...
git push origin main

echo.
echo ========================================================
echo                  SYNC COMPLETE
echo ========================================================
pause