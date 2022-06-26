# :bell: Notification System

![Custom badge](https://img.shields.io/badge/build-passing-brightgreen)
![Custom badge](https://img.shields.io/badge/build%20tool-maven-brightgreen)
![Custom badge](https://img.shields.io/badge/code%20analysis%20tools-spotbugs,%20checkstyle-orange)
![Custom badge](https://img.shields.io/badge/test%20framework-JUnit-blue)

This application implements a notification system to send notifications about delivery
requests to van and taxi drivers.
When a shop receives a product delivery, it creates orders and broadcasts a delivery request to all drivers.

## Contents

- [Technologies](#technologies)
- [Implementation details](#implementation-details)
- [Installation](#pinstallation)

## Technologies

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Maven](	https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

## Implementation Details



### Observer Pattern
This project uses the observer pattern, which defines a one-to-many dependency between 
objects so that when one object changes state, all of its dependents are notified and updated automatically.

In this case, observers (**drivers**) delegate the responsibility for monitoring for an event (**new delivery
requests**) to a central object named the **Subject** or Observable. Here, Shop implements Subject, making it 
the ConcreteSubject. Similarly, Driver implements Observer, making it the ConcreteObserver. 

### Software Design Principles 
This application has a loosely coupled design pattern. 
Drivers can be modified without changing the shop or other drivers. 
This application also does a good job in regard to information hiding. 
Subjects do not know what kind of observer it is communicating with. 

## Installation

### How to compile the project

We use Apache Maven to compile and run this project.

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

### How to create a binary runnable package

```bash
mvn clean compile assembly:single
```

### How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" 
```

### Run all the unit test classes.

```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

### Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using

```bash
mvn spotbugs:gui 
```

or

```bash
mvn spotbugs:spotbugs
```

```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.

### Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format

```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```





