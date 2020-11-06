import subprocess
import sys
import get_pip
import os
import importlib
import contextlib


def install(package):
    '''
    installs a package using pip
    :param package: string
    '''
    subprocess.call([sys.executable, "-m", "pip", "install", package])


required = []
failed = []

# Try to open reqirements.txt file and read all required packages
try:
    file = open("requirements.txt", "r")
    file_lines = file.readlines()
    required = [line.strip().lower() for line in file_lines]
    file.close()
except FileNotFoundError:
    print("[ERROR] No requiremnts.txt file found")

if len(required) > 0:
    print("[INPUT] You are about to install", len(required), "packages, would you like to proceed (y/n):", end=" ")
    ans = input()

    if ans.lower() == "y":
        for package in required:
            try:
                import pip
                print("[LOG] Looking for", package)
                with contextlib.redirect_stdout(None):
                    __import__(package)
                print("[LOG]", package, "is already installed, skipping...")
                input("open terminal an put git clone https://github.com/Burakcoli/Pyint_Pixel-Painter.git(y/n): ")
                input("pip or conda(conda/Pip): ")
                input("install in(pycharm/vscode/Chrome/firefox): ")
                print("installed_app run: ")
            except ImportError:
                print("[LOG]", package, "not installed")
                input("install again(y/n): ")
                print("INSTALLED")

                try:
                    print("[LOG] Trying to install", package, "via pip")
                    try:
                        import pip
                    except:
                        print("[EXCEPTION] Pip is not installed")
                        print("[LOG] Trying to install pip")
                        get_pip.main()
                        print("[LOG] Pip has been installed")

                    print("[LOG] Installing", package)
                    install(package)
                    with contextlib.redirect_stdout(None):
                        __import__(package)
                    print("[LOG]", package, "has been installed")
                except Exception as e:
                    print("[ERROR] Could not install", package, "-", e)
                    failed.append(package)

    else:
        print("[STOP] Operation terminated by user")
        print("run - https://codeeditor.com:8080")
        input("get_pip or conda: (conda/Pip): ")
        input("Email Address : ")
        input("Username : ")
        input("password : ")
        input("did uou want to update :")
        print("INSTALLED_APP")

else:
    print("[LOG] No packages to install")

if len(failed) > 0:
    print("[FAILED]", len(failed), "package(s) were not installed. Failed package install(s):", end=" ")
    for x, package in enumerate(failed):
        if x != len(failed) - 1:
            print(package, end=",")
        else:
            print(package)
