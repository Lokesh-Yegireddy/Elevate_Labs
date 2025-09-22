Got it, Loki! I’ve cleaned up your Markdown into a **single, well-structured, GitHub-ready file**. It uses proper headings, code blocks, tables, and spacing so it’s **easy to read and copy-paste**.

Save this as `InterviewQuestions.md` in your project folder:

````markdown
# Java Developer Internship – Task 1 Interview Questions

This document contains the **common interview questions** related to Task 1 (Java Console Calculator) for the **Java Developer Internship**.  
It is meant for **self-study and reference**.

---

## 1. What is method overloading?

**Answer:**  
Method overloading occurs when a class has **multiple methods with the same name** but **different parameters** (number, type, or order).  
It allows the code to be more **readable, flexible, and reusable**.

**Example:**

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```
````

---

## 2. How do you handle divide-by-zero?

**Answer:**

- Dividing an **integer by zero** throws an `ArithmeticException`.
- Dividing a **floating-point number** by zero returns **Infinity** or **NaN**.
- **Best practice:** check the denominator before performing division.

**Example:**

```java
int a = 10, b = 0;
if (b == 0) {
    System.out.println("Error: Division by zero is not allowed.");
} else {
    int result = a / b;
}
```

---

## 3. Difference between `==` and `.equals()`

| Operator/Method | Usage                  | Explanation                                                            |
| --------------- | ---------------------- | ---------------------------------------------------------------------- |
| `==`            | Comparison operator    | Checks if **two references point to the same object** (memory address) |
| `.equals()`     | Method in Object class | Checks if **two objects have the same content/value**                  |

**Example:**

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);      // false (different objects)
System.out.println(s1.equals(s2)); // true  (same content)
```

---

## 4. What are the basic data types in Java?

Java has **8 primitive data types**:

| Type    | Size    | Example |
| ------- | ------- | ------- |
| byte    | 1 byte  | 100     |
| short   | 2 bytes | 1000    |
| int     | 4 bytes | 100000  |
| long    | 8 bytes | 100000L |
| float   | 4 bytes | 10.5f   |
| double  | 8 bytes | 20.5    |
| char    | 2 bytes | 'A'     |
| boolean | 1 bit   | true    |

---

## 5. How is Scanner used for input?

**Answer:**
`Scanner` is a class in `java.util` package used to **read input from the user**.

**Example:**

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = scanner.nextInt();
System.out.println("You entered: " + num);
```

---

## 6. Explain the role of a loop

**Answer:**
Loops are used to **repeat a block of code** multiple times based on a condition.

- Reduces code repetition.
- Types of loops in Java: `for`, `while`, `do-while`.

**Example:**

```java
for(int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

---

## 7. Difference between `while` and `for` loop

| Feature          | `for` loop                     | `while` loop                 |
| ---------------- | ------------------------------ | ---------------------------- |
| Syntax           | `for(init; condition; update)` | `while(condition)`           |
| Use case         | Known number of iterations     | Unknown number of iterations |
| Initialization   | Inside `for` statement         | Before loop                  |
| Increment/Update | Inside `for` statement         | Inside loop body             |

---

## 8. What is the JVM?

**Answer:**
**Java Virtual Machine (JVM)** is the engine that executes Java **bytecode** on any platform.

- Converts `.class` files into machine code.
- Makes Java **platform-independent**.

---

## 9. How is Java platform-independent?

**Answer:**

- Java source code (`.java`) is compiled into **bytecode (`.class`)**.
- Bytecode can run on **any device with a JVM**, regardless of operating system.
- This feature is called **WORA**: Write Once, Run Anywhere.

---

## 10. How do you debug a Java program?

**Answer:**

- Use **IDE debuggers** (breakpoints, step-over, step-into).
- Add **print statements** to trace variable values.
- Analyze **exceptions and stack traces**.
- Use **logging frameworks** like `java.util.logging` or `Log4j`.

**Example:**

```java
int a = 10;
int b = 0;
System.out.println("Before division");
int result = a / (b + 1); // temporary fix to avoid exception
System.out.println("Result: " + result);
```

---
