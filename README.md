
focus on OOP: Inheritance, Composition and Polymorphism
Problem : Toy Robot

## Getting Started
This project is a `Java` project using `maven` as build tool.

The structure is as follow:
* `src/main/java` - the main code is here 
* `src/test/java` - in here are unit tests code 


### IntelliJ
To open it in `IntelliJ` IDE:
1. _File_ -> _New_ -> _Project from Existing Sources..._
1. Select the directory where this code has been checked out
1. Choose _External Model_ as *Maven*

## Build, Test & Run
You may use IntelliJ to run the code and tests, but alternatively you can use the Maven build tool:
* First ensure you are in the root directory of the project
* To compile your code, run: `mvn compile` 
* To run the tests: `mvn test`
* To run your application: `mvn compile exec:java`

## How to run games
The game is run in the world directory and the main method is in the Play class.
* Configure the game by editing the configuration of the play method
  * valid configurations are:
  * turtle
  * turtle designedmaze - cool to see
  * turtle emptymaze
  * turtle simplemaze
  * turtle randommaze
*An empty configuration will play the text only version of the game

#Valid commands
* Type "Help" once you have entered the name of your robot to see commands
* mazerun, mazerun top, mazerun left, mazerun right, mazerun top moves robot 
* to the respective exit points 

