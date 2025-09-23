# Java Developer Internship – Task 2 Interview Questions

This document contains **common interview questions** related to Task 2 (**Student Record Management System**) for the **Java Developer Internship**.  
It is meant for **self-study and reference**.

**Task Objective:**  
Create a **CLI-based CRUD system** for managing student records.

**Tools:** Java, VS Code/IntelliJ CE.  
**Deliverables:** Java program with classes and menu options.

---

## 1. What is encapsulation?

**Answer:**  
Encapsulation is the process of **wrapping data (variables) and methods** that operate on that data into a **single unit (class)**.  
It helps to **protect the data** from outside access and ensures better **modularity**.

**Example:**

```java
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

---

## 2. How are ArrayLists different from arrays?

| Feature     | Array                    | ArrayList                                                |
| ----------- | ------------------------ | -------------------------------------------------------- |
| Size        | Fixed size               | Dynamic (can grow/shrink)                                |
| Type        | Can hold primitives      | Only objects (use wrapper classes for primitives)        |
| Methods     | Limited (manual logic)   | Built-in methods: `add()`, `remove()`, `get()`, `size()` |
| Performance | Faster for simple access | Slightly slower due to dynamic resizing                  |

---

## 3. How to sort an ArrayList?

**Answer:**

- Use `Collections.sort()` for natural ordering.
- Use `Comparator` for custom ordering.

**Example:**

```java
import java.util.ArrayList;
import java.util.Collections;

ArrayList<Integer> marks = new ArrayList<>();
marks.add(50);
marks.add(70);
marks.add(60);

Collections.sort(marks); // Ascending order
System.out.println(marks);
```

---

## 4. What is constructor overloading?

**Answer:**  
Constructor overloading occurs when a class has **multiple constructors** with **different parameters**.  
It allows objects to be created in **different ways**.

**Example:**

```java
class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## 5. How does garbage collection work in Java?

**Answer:**

- Java automatically **removes objects** that are **no longer referenced** to free memory.
- Managed by **JVM** using **garbage collectors** like Serial, Parallel, CMS, G1.
- **Example scenario:** When a student object is removed from the ArrayList and no other references exist, it becomes eligible for garbage collection.

---

## 6. Why do we use getters and setters?

**Answer:**

- To **access private fields safely**.
- To **control modification** of data.
- Helps in **data validation** before setting values.

**Example:**

```java
class Student {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }
}
```

---

## 7. What is a static variable?

**Answer:**  
A static variable belongs to the **class** rather than an instance of the class.

- Shared across all objects of the class.
- Useful for **counters or constants**.

**Example:**

```java
class Student {
    static int studentCount = 0;

    Student() {
        studentCount++;
    }
}
```

---

## 8. What is the use of `final` keyword?

| Usage        | Description             |
| ------------ | ----------------------- |
| final var    | Value cannot be changed |
| final method | Cannot be overridden    |
| final class  | Cannot be inherited     |

**Example:**

```java
final class Constants {
    final double PI = 3.14;
}
```

---

## 9. Difference between compile-time and runtime errors

| Type               | Description                               | Example                          |
| ------------------ | ----------------------------------------- | -------------------------------- |
| Compile-time error | Error detected **before program runs**    | Syntax errors, missing semicolon |
| Runtime error      | Error occurs **during program execution** | Division by zero, null pointer   |

---

## 10. What are access modifiers?

**Answer:**  
Access modifiers control the **visibility of classes, variables, and methods**.

| Modifier    | Access Level                           |
| ----------- | -------------------------------------- |
| `private`   | Accessible only within the class       |
| `default`   | Accessible within the same package     |
| `protected` | Accessible within package + subclasses |
| `public`    | Accessible from anywhere               |

---
