#!/bin/bash
mvn clean compile
mvn exec:java -Dexec.executable="edu.bu.met.cs665.Main"