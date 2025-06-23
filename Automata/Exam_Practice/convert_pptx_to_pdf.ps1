# PowerPoint to PDF Converter Script
# This script converts all PowerPoint files in the CheatSheet folder to PDF format

param(
    [string]$SourceFolder = "CheatSheet",
    [string]$OutputFolder = "CheatSheet\PDFs"
)

# Get the current script directory
$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Definition

# Set up paths
$SourcePath = Join-Path $ScriptDir $SourceFolder
$OutputPath = Join-Path $ScriptDir $OutputFolder

Write-Host "PowerPoint to PDF Converter" -ForegroundColor Green
Write-Host "Source folder: $SourcePath" -ForegroundColor Yellow
Write-Host "Output folder: $OutputPath" -ForegroundColor Yellow

# Check if source folder exists
if (-not (Test-Path $SourcePath)) {
    Write-Error "Source folder '$SourcePath' does not exist!"
    exit 1
}

# Create output folder if it doesn't exist
if (-not (Test-Path $OutputPath)) {
    New-Item -ItemType Directory -Path $OutputPath -Force | Out-Null
    Write-Host "Created output folder: $OutputPath" -ForegroundColor Cyan
}

# Get all PowerPoint files
$PowerPointFiles = Get-ChildItem -Path $SourcePath -Filter "*.pptx" | Sort-Object Name

if ($PowerPointFiles.Count -eq 0) {
    Write-Warning "No PowerPoint files (.pptx) found in '$SourcePath'"
    exit 0
}

Write-Host "Found $($PowerPointFiles.Count) PowerPoint file(s) to convert:" -ForegroundColor Cyan
foreach ($file in $PowerPointFiles) {
    Write-Host "  - $($file.Name)" -ForegroundColor White
}

# Initialize PowerPoint application
try {
    Write-Host "`nInitializing PowerPoint application..." -ForegroundColor Yellow
    $PowerPoint = New-Object -ComObject PowerPoint.Application
    $PowerPoint.Visible = $false
    $PowerPoint.DisplayAlerts = [Microsoft.Office.Interop.PowerPoint.PpAlertLevel]::ppAlertsNone
    
    Write-Host "PowerPoint application initialized successfully." -ForegroundColor Green
} catch {
    Write-Error "Failed to initialize PowerPoint application. Make sure Microsoft PowerPoint is installed."
    Write-Error $_.Exception.Message
    exit 1
}

# Convert each file
$ConvertedCount = 0
$FailedCount = 0

foreach ($file in $PowerPointFiles) {
    try {
        $InputFile = $file.FullName
        $OutputFile = Join-Path $OutputPath ($file.BaseName + ".pdf")
        
        Write-Host "`nConverting: $($file.Name)..." -ForegroundColor Yellow
        
        # Open the presentation
        $Presentation = $PowerPoint.Presentations.Open($InputFile)
        
        # Export as PDF
        $Presentation.ExportAsFixedFormat($OutputFile, 2) # 2 = ppFixedFormatTypePDF
        
        # Close the presentation
        $Presentation.Close()
        
        Write-Host "✓ Successfully converted: $($file.Name) -> $($file.BaseName).pdf" -ForegroundColor Green
        $ConvertedCount++
        
    } catch {
        Write-Error "✗ Failed to convert: $($file.Name)"
        Write-Error "Error: $($_.Exception.Message)"
        $FailedCount++
        
        # Try to close presentation if it's still open
        try {
            if ($Presentation) {
                $Presentation.Close()
            }
        } catch {
            # Ignore errors when trying to close
        }
    }
}

# Clean up
try {
    $PowerPoint.Quit()
    [System.Runtime.Interopservices.Marshal]::ReleaseComObject($PowerPoint) | Out-Null
    Write-Host "`nPowerPoint application closed." -ForegroundColor Yellow
} catch {
    Write-Warning "Warning: Could not properly close PowerPoint application."
}

# Summary
Write-Host "`n" + "="*50 -ForegroundColor Cyan
Write-Host "CONVERSION SUMMARY" -ForegroundColor Cyan
Write-Host "="*50 -ForegroundColor Cyan
Write-Host "Total files processed: $($PowerPointFiles.Count)" -ForegroundColor White
Write-Host "Successfully converted: $ConvertedCount" -ForegroundColor Green
Write-Host "Failed conversions: $FailedCount" -ForegroundColor Red
Write-Host "Output folder: $OutputPath" -ForegroundColor Yellow

if ($ConvertedCount -gt 0) {
    Write-Host "`n✓ Conversion completed! Check the PDFs folder for your converted files." -ForegroundColor Green
} else {
    Write-Host "`n✗ No files were successfully converted." -ForegroundColor Red
}

# Optional: Open output folder
$OpenFolder = Read-Host "`nWould you like to open the output folder? (y/n)"
if ($OpenFolder -eq "y" -or $OpenFolder -eq "Y") {
    Start-Process explorer.exe $OutputPath
}
