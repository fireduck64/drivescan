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



