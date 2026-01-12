# -------------------------------
# Git Utility Script for Windows
# -------------------------------

$KeyName = "silicon"
$SshDir = "~\.ssh"
$KeyPath = "$SshDir\$KeyName"

Write-Host "🔐 Checking SSH key..."

# # Create SSH directory if not exists
# if (!(Test-Path $SshDir)) {
#     New-Item -ItemType Directory -Path $SshDir | Out-Null
# }

# # Generate SSH key if it doesn't exist
# if (!(Test-Path $KeyPath)) {
#     Write-Host "Creating SSH key: $KeyName"
#     ssh-keygen -t ed25519 -f $KeyPath -C "$KeyName" -N ""
# } else {
#     Write-Host "SSH key already exists."
# }

# Start SSH agent
Write-Host "Starting SSH agent..."
Start-Service ssh-agent -ErrorAction SilentlyContinue
ssh-add $KeyPath

# Pull latest changes
Write-Host "⬇ Pulling latest changes..."
git pull origin main

# Ask for commit message
$commitMessage = Read-Host "📝 Enter commit message"

# Check if there are changes
if ((git status --porcelain).Length -eq 0) {
    Write-Host "No changes to commit."
    exit
}

# Commit changes
git add .
git commit -m "$commitMessage"

# Push to main branch
Write-Host "⬆ Pushing to main..."
git push origin main

Write-Host "✅ Done successfully!"
