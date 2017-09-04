# robotframeworkjavalib

This project shows how do develop libraries(keywords) for robot framework using java
    
After cloning the repository run the following commands to execute the test Case specified in Test1.txt
    
mvn clean install
unzip target/javaextension-0.0.1-SNAPSHOT-bin.zip
cp Test1.txt target/javaextension-0.0.1-SNAPSHOT/TestCases/
cd target/javaextension-0.0.1-SNAPSHOT/
$JAVA_HOME/bin/java -cp "lib/*:lib" org.robotframework.RobotFramework TestCases
    
