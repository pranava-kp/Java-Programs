#!/bin/sh

# Set Java 8 as default
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH

# Get user input
read -p "Enter the Java class file name: " CLASS_NAME

# Compile the Java Applet
javac "$CLASS_NAME.java"
if [ $? -ne 0 ]; then
    echo "Compilation failed. Exiting."
    exit 1
fi

echo "Compilation successful."

# Run the Applet using appletviewer
appletviewer "$CLASS_NAME.java"
