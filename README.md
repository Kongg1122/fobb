# Payroll System Using Java (Inheritance & Polymorphism)

## Project Overview

This project demonstrates the use of **object-oriented programming (OOP)** concepts in Java, specifically **inheritance**, **polymorphism**, **abstract classes**, and **method overriding**. The system models a simple payroll application that calculates salaries for different types of employees.

## Objectives

* Understand and apply Java inheritance
* Use abstract classes and methods
* Implement polymorphism using a base class reference
* Practice object creation and method overriding
* Use `ArrayList<Employee>` to process data polymorphically


## System Description

### Base Class

**Employee (abstract)**

* Represents a general employee
* Contains common attributes and methods
* Declares an abstract method `calculateSalary()` that must be implemented by subclasses

### Subclasses

1. **FullTimeEmployee**
   * Calculates salary using monthly salary and bonus
     
2. **PartTimeEmployee**
   * Calculates salary based on hourly rate and hours worked
     
3. **Contractor**
   * Calculates salary based on a fixed contract amount

Each subclass provides its own implementation of the `calculateSalary()` method.

## Key Java Concepts Used

* Classes and Objects
* Inheritance (`extends`)
* Abstract Classes and Methods
* Method Overriding
* Polymorphism
* Constructors
* `ArrayList`


## How Polymorphism Is Implemented

* An `ArrayList<Employee>` is used to store different employee objects
* The program calls `calculateSalary()` using the `Employee` reference
* Java automatically executes the correct subclass method at runtime

## Project Structure

Employee.java
FullTimeEmployee.java
PartTimeEmployee.java
Contractor.java
PayrollSystem.java
README.md

## How to Run the Program

1. Compile all Java files:
   javac *.java
  
2. Run the main class:
   java PayrollSystem

## Sample Output

ID: 1, Name: Alice, Department: HR
Salary: $4500.0
----------------------------
ID: 2, Name: Bob, Department: IT
Salary: $1200.0
----------------------------
ID: 3, Name: Charlie, Department: Finance
Salary: $6000.0
----------------------------


## Conclusion

This project successfully meets all assignment requirements and demonstrates how Java polymorphism allows different employee types to be processed uniformly using a common base class.

## Author
Kong Yee Fei
