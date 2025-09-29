# Bank Account Simulation

## Project Overview

**Bank Account Simulation** is a simple Java console-based program that simulates basic banking operations.  
It allows users to deposit money, withdraw money, check balance, and view transaction history, including timestamps.

This project demonstrates the use of **Object-Oriented Programming (OOP)** concepts in Java such as **classes, objects, methods, encapsulation, and ArrayList usage**.

---

## Features

1. **Deposit Money**

   - Add money to the account.
   - Records the deposit in the transaction history with a timestamp.

2. **Withdraw Money**

   - Withdraw money from the account if sufficient balance exists.
   - Records the withdrawal in the transaction history with a timestamp.

3. **Check Balance**

   - Displays the current account balance.

4. **Transaction History**

   - Shows all deposits and withdrawals with timestamps and updated balance.

5. **Interactive Menu**
   - Users can perform multiple operations until they choose to exit.

---

## Tools & Technologies

- Java SE
- VS Code or any IDE for Java
- Terminal / Command Prompt to run the program

---

## How to Run

1. Ensure **Java JDK** is installed on your system.
2. Save the two files in the same folder:
   - `Main.java`
   - `Account.java`
3. Open terminal / command prompt in that folder.
4. Compile the program:
   ```bash
   javac Main.java Account.java
   ```
5. Run The Program  
   java Main

```

├── Task-5/
│ ├── Main.java # Main program with menu and user interaction
│ ├── Account.java # Account class handling balance and transactions
│ └── README.md # README for Bank Account Simulation
│
└── InterviewQuestions/
└── InterviewQuestion.md # All Java interview questions with explanations and examples

```

```
==================================================
Welcome TO Bank Account Simulator
==================================================
What would you like to do today?

1.  Deposit Money
2.  Withdraw Money
3.  Check Balance
4.  Show Transaction History
5.  Exit
    Choose Your Option (1,2,3,4,5): 1
    Enter amount to deposit: 500
    Deposited 500.0. Current Balance: 500.0

Choose Your Option (1,2,3,4,5): 2
Enter amount to withdraw: 200
Withdrew 200.0. Current Balance: 300.0

Choose Your Option (1,2,3,4,5): 3
Current Balance: 300.0

Choose Your Option (1,2,3,4,5): 4
----- Transaction History -----
Deposit: 500.0 | Balance: 500.0 | Time: 2025-09-29 18:45:12
Withdraw: 200.0 | Balance: 300.0 | Time: 2025-09-29 18:46:05

---

```
cd..