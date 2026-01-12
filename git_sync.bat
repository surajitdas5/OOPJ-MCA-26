@echo off
Title Git Sync Utility - Silicon
color 0A

:: ----------------------------------------------------------
:: STEP 0: Debug Pause (To stop immediate closing if errors occur)
:: ----------------------------------------------------------
echo Starting Git Sync Utility...

:: ----------------------------------------------------------
:: STEP 1: Ensure SSH Agent is running
:: ----------------------------------------------------------
echo [Step 1] Checking SSH Agent...

:: Try to start the agent quietly.
:: Note: This command (net start) often fails if not run as Admin, 
:: but we try anyway just in case it's only stopped.
net start ssh-agent >nul 2>&1

:: Add the key
echo Adding SSH Key "silicon"...
call ssh-add "%USERPROFILE%\.ssh\silicon"

if %ERRORLEVEL% NEQ 0 (
    color 0C
    echo.
    echo [ERROR] Could not add SSH key.
    echo.
    echo SOLUTION:
    echo 1. Right-click this file and select 'Run as Administrator' once.
    echo 2. OR Open Services [Win+R, type services.msc].
    echo 3. Find 'OpenSSH Authentication Agent', set to Automatic and Start it.
    echo.
    pause
    exit /b
)

:: ----------------------------------------------------------
:: STEP 2: Pull latest changes
:: ----------------------------------------------------------
echo.
echo [Step 2] Pulling updates from origin/main...
git pull origin main

:: ----------------------------------------------------------
:: STEP 3: Add changes and ask for commit message
:: ----------------------------------------------------------
echo.
echo [Step 3] Staging changes...
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
:: STEP 4: Push to main
:: ----------------------------------------------------------
echo.
echo [Step 4] Pushing to origin/main...
git push origin main

echo.
echo ========================================================
echo                  SYNC COMPLETE
echo ========================================================
pause