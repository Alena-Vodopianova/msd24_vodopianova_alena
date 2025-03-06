Simple Calculator
Description
A simple calculator for basic mathematical operations. This project serves as an exercise for test automation and a demonstration of Java interfaces and implementations.

Installation
Requirements

Java Development Kit (JDK) 8 or higher
Git (to manage the project repository)
Set Up the Project

Ensure Git is installed on your system.
Open a terminal and navigate to your desired directory.
Initialize a new Git repository:
 git init Abgabe1-Alena-Vodopianova
Add project files to Git:
 git add .
Commit the initial version:
git commit -m "Initial commit"
Usage
The program can also be started using these commands:

javac -d bin src/at/fhj/iit/*.java

java -cp bin at.fhj.iit.CalculatorImpl

Features
The CalculatorImpl class has the ICalculator interface and provides the following methods:

Addition: add(double number1, double number2)
Subtraction: minus(double number1, double number2)
Multiplication: multiply(double number1, double number2)
Division: divide(double number1, double number2) (with error handling for invalid values)
The ICalculator interface defines these methods as abstract, ensuring that CalculatorImpl provides concrete implementations.

Example usage
ICalculator calculator = new CalculatorImpl();
double result = calculator.add(5, 3);
System.out.println("Result: " + result);
File Structure
Abgabe1-Alena-Vodopianova
├── Calculator-Example/
│   ├── pom.xml
│   └── src/ 
│       └── main
│           ├── java/at/fhj/iit/CalculatorImpl.java
│           └── java/at/fhj/iit/ICalculator.java
├── README-Vodopianova-Alena.md
├── exercise1.md
└── resources/
    └── images
         └── ex1_1.jpg
Exercises
Exercise 1

Description: Create a basic README file and practice Markdown syntax (headings, links, images).

Exercise 2

Description: Create core Git commands (init, add, commit, push) and GitHub workflows.

Exercise 3 (to be added)

Exercise 4 (to be added)

Exercise 5 (to be added)

Exercise 6 (to be added)

Author
Alena Vodopianova

GitHub Profile: Alena Vodopianova
University: FH Joanneum
