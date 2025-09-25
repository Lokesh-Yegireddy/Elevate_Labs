# Library Management System – Interview Questions

This document contains detailed explanations and examples for common Object-Oriented Programming (OOP) interview questions relevant to a Library Management System project.

---

## 1. What is Abstraction?

**Definition:**  
Abstraction is the process of hiding implementation details and showing only the functionality to the user. It allows focusing on what an object does instead of how it does it.

**Example in Java:**

```java
abstract class Book {
    String title;
    String author;

    // Abstract method
    abstract void displayDetails();
}

class Novel extends Book {
    Novel(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Book myBook = new Novel("1984", "George Orwell");
        myBook.displayDetails(); // Output: Title: 1984, Author: George Orwell
    }
}
```

---

## 2. Difference between Interface and Abstract Class

| Feature              | Abstract Class               | Interface                                      |
| -------------------- | ---------------------------- | ---------------------------------------------- |
| Methods              | Can have abstract & concrete | Only abstract (Java 7+) default/static allowed |
| Multiple Inheritance | No                           | Yes                                            |
| Variables            | Can have instance variables  | Only static final constants                    |
| Constructor          | Yes                          | No                                             |

**Example:**

```java
interface LibraryOperations {
    void issueBook();
    void returnBook();
}

abstract class User {
    String name;
    abstract void displayUserInfo();
}
```

---

## 3. Explain Polymorphism with Example

**Definition:**  
Polymorphism allows objects to take multiple forms.

- **Compile-time (Method Overloading)**
- **Run-time (Method Overriding)**

**Example (Run-time Polymorphism):**

```java
class Book {
    void display() {
        System.out.println("General Book");
    }
}

class Novel extends Book {
    @Override
    void display() {
        System.out.println("Novel Book");
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Novel();
        b.display(); // Output: Novel Book
    }
}
```

---

## 4. What is Method Overriding?

**Definition:**  
Providing a new implementation for a method in a subclass that already exists in the superclass.

**Example:**

```java
class User {
    void showRole() {
        System.out.println("I am a general user");
    }
}

class Librarian extends User {
    @Override
    void showRole() {
        System.out.println("I am a librarian");
    }
}

public class Main {
    public static void main(String[] args) {
        User u = new Librarian();
        u.showRole(); // Output: I am a librarian
    }
}
```

---

## 5. Explain “IS-A” vs “HAS-A” Relationships

- **IS-A:** Inheritance relationship. Example: `Librarian IS-A User`
- **HAS-A:** Composition relationship. Example: `Library HAS-A List<Book>`

```java
class Library {
    private List<Book> books; // HAS-A relationship
}
```

---

## 6. Why Use Inheritance?

**Reasons:**

- Code reusability
- Method overriding for polymorphism
- Logical hierarchy representation

---

## 7. What is Dynamic Binding?

**Definition:**  
Decision about which method to call is made at runtime based on the object type, not reference type.

```java
Book b = new Novel();
b.displayDetails(); // Method in Novel class is called
```

---

## 8. What is Constructor Chaining?

**Definition:**  
Calling one constructor from another constructor in the same class or parent class using `this()` or `super()`.

```java
class Book {
    Book() {
        System.out.println("Book created");
    }
}

class Novel extends Book {
    Novel() {
        super(); // Calls Book constructor
        System.out.println("Novel created");
    }
}
```

---

## 9. How to Implement Encapsulation?

**Definition:**  
Encapsulation hides data using private variables and provides public getter/setter methods.

```java
class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

---

## 10. Explain `super` Keyword

- Refers to the parent class object
- Used to call parent class constructor or methods

```java
class Book {
    void info() {
        System.out.println("Book info");
    }
}

class Novel extends Book {
    void info() {
        super.info(); // Calls Book's info method
        System.out.println("Novel info");
    }
}
```

---
