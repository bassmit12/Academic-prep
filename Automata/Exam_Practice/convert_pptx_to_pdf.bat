@echo off
echo Starting PowerPoint to PDF conversion...
echo.

REM Check if PowerShell is available
powershell -Command "Write-Host 'PowerShell is available'" >nul 2>&1
if errorlevel 1 (
    echo Error: PowerShell is not available on this system.
    pause
    exit /b 1
)

REM Run the PowerShell script
echo Running PowerPoint to PDF converter...
powershell -ExecutionPolicy Bypass -File "%~dp0convert_pptx_to_pdf.ps1"

echo.
echo Conversion process completed.
pause
