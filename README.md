# ATM Interface – Java

A simple, console-based ATM Interface application developed using Java as part of the CodSoft Java Programming Internship.

## Features

- Check account balance
- Deposit money
- Withdraw money
- Validate transaction amounts
- Prevent withdrawals when the balance is insufficient
- Handle invalid menu inputs
- Display transaction status messages

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Scanner class
- Git and GitHub

## Project Structure

```text
CodSoft_ATMInterface/
├── src/
│   └── main/
│       └── java/
│           ├── ATM.java
│           ├── BankAccount.java
│           └── Main.java
├── .gitignore
└── README.md
```

## How to Run

Make sure Java JDK is installed.

Navigate to the project directory and compile the Java files:

```bash
javac src/main/java/BankAccount.java src/main/java/ATM.java src/main/java/Main.java
```

Run the application:

```bash
java -cp src/main/java Main
```

## Default Account Balance

The application starts with a sample balance of ₹5,000.

## Sample Operations

- Check Balance: Displays the current account balance.
- Deposit: Adds a valid amount to the balance.
- Withdraw: Deducts money if sufficient funds are available.
- Exit: Ends the application.

## Learning Outcomes

This project demonstrates Java classes and objects, methods, conditional statements, loops, switch statements, input validation, and interaction between classes.

## Internship

Developed as Task 3 – ATM Interface for the CodSoft Java Programming Internship.

## Author

Safiyah Shaik

GitHub: [Safiyah-Shaik](https://github.com/Safiyah-Shaik)
