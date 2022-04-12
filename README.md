# drivescan
Scans a drive for things

# To run on Windows

Download and extract openjdk:
https://jdk.java.net/18/
(Windows / x64 zip)

Open cmd prompt in administator mode (run as administrator)

cd to where you unzipped openjdk.
cd into bin
for simplicity, copy DriveScan_deploy.jar to this directory.
Do this command:

    mkdir results
    java -jar DriveScan_deploy.jar \\\\.\\c: snow:.... results

(substituate in the address you are looking for)

The funky amount of blackslashes has to do with weird windows way of referencing an actual block device
combined with java and windows weird way of escaping backslashes.

# What this does

This searches the drive in raw mode searching for the given string.  Any 1mb blocks it finds
that contain that string will be written to results directory.

In theory, the valid snowblossom proto files can be extracted from those 1mb blocks.






