Modeling of Embedded Systems (UML) – Graded
Introduction Test
Question 12:
Class diagram Implement a C++ or Java program and specify a class diagram for the following description. A house may have any number of pets living in it. 
The two possible types of pets that can live in a house are dogs and cats. Each dog or cat has a name.
An animal’s house is its one and only home. You can tell an animal to make noise and it will do its thing. create readme file for this

🏠 House and Pets – Java OOPS Concept
📘 Problem Description

This project demonstrates Object-Oriented Programming (OOP) concepts in Java such as inheritance, abstraction, and association through a simple model of a house and its pets.

A house can have any number of pets (dogs and cats).
Each pet has a name and lives in exactly one house.
You can command any pet to make noise, and it will respond appropriately.

🧩 Features

Models real-world relationships between House, Pet, Dog, and Cat.

Uses abstract classes and method overriding.

Demonstrates one-to-many associations (a house has many pets).

Implements polymorphism through the makeNoise() method.

🏗️ Class Structure
Class Diagram
+------------------+
|      House       |
+------------------+
| - address: String|
| - pets: List<Pet>|
+------------------+
| + addPet(p: Pet) |
| + listPets()     |
| + makeAllNoises()|
+------------------+
          1
          |
          | contains
          | *
+------------------+
|       Pet        | <<abstract>>
+------------------+
| - name: String   |
| - home: House    |
+------------------+
| + getName()      |
| + getHome()      |
| + makeNoise()    |
+------------------+
          ^
          |
   +--------------+       +--------------+
   |     Dog      |       |     Cat      |
   +--------------+       +--------------+
   | +makeNoise() |       | +makeNoise() |
   +--------------+       +--------------+

💻 Source Code Files
File Name	Description
House.java	Represents a house that contains multiple pets.
Pet.java	Abstract class defining common attributes and methods for pets.
Dog.java	Subclass of Pet that implements makeNoise() as “Woof!”.
Cat.java	Subclass of Pet that implements makeNoise() as “Meow!”.
Main.java	Main driver class that creates objects and runs the program.
