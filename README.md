# 📘 Console Calculator - Java

## ✅ Description
This is a simple **console-based calculator** written in Java. It allows users to perform **basic arithmetic and scientific operations** by entering numbers and choosing operations from a menu-driven interface.

---

## 💡 Features
The calculator supports the following operations:

1. ➕ **Addition** - Sum of two numbers
2. ➖ **Subtraction** - Difference between two numbers
3. ✖️ **Multiplication** - Product of two numbers
4. ➗ **Division** - Quotient of two numbers
5. 🧮 **Modulus** - Remainder of division between two numbers
6. ⚡ **Power** - First number raised to the power of the second
7. √ **Square Root** - Square root of a single number
8. ❌ **Exit** - Closes the calculator

---

## 🧠 How It Works
- When the program starts, a **menu** is displayed prompting the user to select an operation.
- For most operations (1–6), the user enters **two numbers**.
- For **square root**, the user enters **one number**.
- Based on the selected option, the calculator performs the calculation and displays the result.
- If the user chooses **"Exit"**, the program ends gracefully.
- The calculator handles:
    - Division and modulus by **zero**
    - **Negative inputs** for square root

---

## 🔧 Technical Details
- Uses Java's `Scanner` class to take input from the user.
- Each operation is implemented in a separate **static method**.
- Uses Java’s built-in `Math` class for **power and square root** functions.
- Runs in a **loop** until the user selects Exit (`option 8`).

---

## 🖥️ Sample Run

```text
======================================
      Welcome to Console Calculator   
======================================

Select Operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus
6. Power
7. Square Root
8. Exit
Enter your choice (1-8): 1
Enter Number 1: 10
Enter Number 2: 20
Result: 30.0
