🏏 Cricket Finance Application
This project is a small Java console application designed to calculate the total income and performance-based bonuses for professional cricket players. It effectively demonstrates foundational Object-Oriented Programming (OOP) concepts, including Abstraction, Inheritance, and Polymorphism.

✨ Features
Player Data Input: Accepts player details (Name, Age, Gender, and Grade A/B) via console input.

Polymorphic Calculations: Dynamically calculates income and bonuses based on the specific match type played (TestMatch or WorldCup).

Grade-Based Bonuses: Bonus amounts are adjusted based on the player's performance level (Best, Good, Average) and their official Grade (A or B).

Financial Breakdown: Displays a clear output of the player's total income and bonus earnings.

🛠️ Technology Stack
Language: Java

Concepts:

Abstraction (using the Game abstract class)

Inheritance (using TestMatch and WorldCup extending Game)

Polymorphism

Standard Input/Output (java.util.Scanner)

📂 Project Structure and OOP Overview
The application is organized into the cricketfinanceapplication package, following strong OOP principles:

File

Type

Description

Game.java

Abstract Class

Defines the contract for all match types. It requires all subclasses to implement calculateIncome() and calculateBonus().

TestMatch.java

Concrete Class

Extends Game. Implements the financial logic specific to Test Matches (e.g., lower per-match pay, specific bonus structure).

WorldCup.java

Concrete Class

Extends Game. Implements the financial logic specific to World Cup matches (e.g., higher per-match pay, specific bonus structure).

Player.java

Model Class

Holds the player's personal details. The displayDetails() method uses polymorphism to instantiate the correct match object (TestMatch or WorldCup) based on user input, and then calls the abstract methods on it.

PlayerTest.java

Driver Class

Contains the main method. Handles all console input from the user and initializes the Player object to start the calculation process.

🚀 How to Run Locally
Prerequisites
Java Development Kit (JDK) installed (version 8 or newer recommended).

A Java IDE (like IntelliJ IDEA or Eclipse) or a command-line environment configured for Java development.

Steps
Clone the Repository:

git clone [YOUR_REPOSITORY_URL]
cd cricket-finance-application

Compile the Classes:
Navigate to the project's source directory (where the cricketfinanceapplication folder is located) and compile all Java files.

# You might need to adjust the path based on your IDE setup
javac cricketfinanceapplication/*.java

Run the Main Class:
Execute the PlayerTest class, which contains the main method.

java cricketfinanceapplication.PlayerTest

Follow Prompts: The application will prompt you to enter the player's details, match type, number of games, and performance level.

🤝 Contribution
We welcome contributions! If you have ideas for improvement, such as adding more match types (T20, ODI), incorporating more sophisticated financial calculations, or adding input validation, please follow these steps:

Fork the repository.

Create a new feature branch (git checkout -b feature/new-match-type).

Commit your changes (git commit -m 'Feat: Added T20 match type logic').

Push to the branch (git push origin feature/new-match-type).

Open a Pull Request.
