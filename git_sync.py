import os
import subprocess
import sys
from pathlib import Path

KEY_NAME = "silicon"
SSH_DIR = "~\.ssh"
KEY_PATH = SSH_DIR +"\\"+ KEY_NAME


def run(cmd, check=True):
    print(f"> {cmd}")
    result = subprocess.run(cmd, shell=True)
    if check and result.returncode != 0:
        print("❌ Command failed")
        sys.exit(1)


def ssh_key_exists():
    return KEY_PATH.exists()


def create_ssh_key():
    # print("🔐 Creating SSH key...")
    # SSH_DIR.mkdir(exist_ok=True)
    # run(f'ssh-keygen -t ed25519 -f "{KEY_PATH}" -C "{KEY_NAME}" -N ""')
    pass


def start_ssh_agent():
    print("🚀 Starting SSH agent...")
    run("powershell -Command Start-Service ssh-agent", check=False)
    run(f'ssh-add "{KEY_PATH}"')


def git_has_changes():
    result = subprocess.check_output(
        "git status --porcelain", shell=True, text=True
    )
    return bool(result.strip())


def main():
    print("🔍 Checking SSH key...")
    if not ssh_key_exists():
        create_ssh_key()
    else:
        print("SSH key already exists.")

    start_ssh_agent()

    print("⬇ Pulling latest changes...")
    run("git pull origin main")

    if not git_has_changes():
        print("No changes to commit.")
        return

    commit_msg = input("📝 Enter commit message: ").strip()
    if not commit_msg:
        print("Commit message cannot be empty.")
        return

    run("git add .")
    run(f'git commit -m "{commit_msg}"')

    print("⬆ Pushing to main...")
    run("git push origin main")

    print("✅ Done successfully!")


if __name__ == "__main__":
    main()
