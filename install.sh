
#!/bin/sh

./gradlew build
adb shell mkdir /sdcard/tmp
adb push build/outputs/apk/android-ringer-mode-release.apk /sdcard/tmp/android-ringer-mode-release.apk
adb shell pm install -r /sdcard/tmp/android-ringer-mode-release.apk
adb shell rm /sdcard/tmp/android-ringer-mode-release.apk

