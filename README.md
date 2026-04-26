🐾 Pet Shelter Management System (Java)

A console-based Java application that simulates a pet shelter system. This project demonstrates core Object-Oriented Programming (OOP) concepts by creating, managing, and interacting with multiple animal objects through a user-driven menu.

🚀 Features

View all animals in the shelter
Make all animals “speak” using polymorphic behavior
Display total number of animals using a static counter
Search for an animal by name (case-insensitive)
Menu-driven user interaction loop
🧠 Concepts Used

Classes and Objects
Constructors
Inheritance (extends)
Method Overriding (@Override)
super keyword
toString() method
Static variables
Arrays of Objects
Loops (for-each, do-while)
Conditionals (if, else if)
User input with Scanner

⚙️ How It Works

A base Animal class defines shared attributes such as name, breed, and age
Child classes (Dog, Cat) extend Animal and override behavior like speak()
Each animal is instantiated and stored in an array of objects
A menu system allows the user to interact with the program
The system uses loops and conditionals to process user input and perform actions
A static variable tracks how many animals have been created

🛠️ How to Run

Compile the program:
javac Main.java
Run the program:
java Main

📁 Project Structure

Main.java     → Handles user interaction and program flow  
Animal.java   → Base class with shared attributes and methods  
Dog.java      → Child class with overridden behavior  
Cat.java      → Child class with overridden behavior  

📈 Future Improvements

Add ability to add/remove animals dynamically
Implement search by additional attributes (breed, age)
Replace arrays with ArrayList for scalability
Improve UI formatting and user experience
Add validation for user input

💡 Key Takeaway

This project reinforces how to structure programs using OOP by combining data and behavior into objects. It also demonstrates how multiple concepts—such as inheritance, loops, and conditionals—work together to build a functional system.
