Sure, Loki! I’ll create a **complete, beginner-to-advanced explanation** for each interview question, plus your **Bank Account Simulation task**, all in **Markdown format** so you can submit or use directly. I’ll include **examples** wherever relevant and explain from scratch.

---

# Java Interview Questions & Bank Account Simulation

---

## 1. What is inheritance in Java?

**Definition:**
Inheritance is a mechanism in Java by which one class (child/subclass) can acquire the properties and behaviors (fields and methods) of another class (parent/superclass).

**Purpose:**

- Code reusability
- Method overriding
- Establishing relationships (IS-A)

**Syntax Example:**

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car honks");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.start(); // inherited method
        c.honk();  // child class method
    }
}
```

**Output:**

```
Vehicle started
Car honks
```

---

## 2. Why use `this` keyword?

**Definition:**
`this` is a reference variable in Java that refers to the **current object**.

**Uses:**

1. Distinguish class fields from method/constructor parameters.
2. Invoke another constructor of the same class.
3. Pass the current object as a parameter.

**Example:**

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name; // distinguishes field from parameter
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class TestThis {
    public static void main(String[] args) {
        Student s = new Student("Loki", 25);
        s.printInfo();
    }
}
```

**Output:**

```
Name: Loki, Age: 25
```

---

## 3. Method Overriding vs Method Overloading

| Feature               | Overloading                                | Overriding                                     |
| --------------------- | ------------------------------------------ | ---------------------------------------------- |
| Definition            | Same method name, **different parameters** | Same method name and signature in **subclass** |
| Runtime/Compile-time  | Compile-time                               | Runtime                                        |
| Return type           | Can be same or different (Java 5+ rules)   | Must be same or covariant                      |
| Inheritance required? | No                                         | Yes                                            |

**Example:**

**Overloading:**

```java
class MathOperation {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
```

**Overriding:**

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}
```

---

## 4. What is object instantiation?

**Definition:**
Creating an **object of a class** in memory is called instantiation.

**Syntax Example:**

```java
class Car {
    String color;
}

public class Test {
    public static void main(String[] args) {
        Car myCar = new Car(); // object instantiation
        myCar.color = "Red";
        System.out.println(myCar.color);
    }
}
```

**Output:**

```
Red
```

---

## 5. Single vs Multiple Inheritance

**Single inheritance:** One subclass inherits from **one superclass**.
**Multiple inheritance:** One class inherits from **multiple classes** (not allowed in Java via classes, but allowed via interfaces).

**Example (Single Inheritance):**

```java
class Parent {}
class Child extends Parent {}
```

**Multiple Inheritance (using interfaces):**

```java
interface A { void methodA(); }
interface B { void methodB(); }

class C implements A, B {
    public void methodA() { System.out.println("A"); }
    public void methodB() { System.out.println("B"); }
}
```

---

## 6. What is encapsulation?

**Definition:**
Encapsulation is the process of **wrapping data (variables) and methods** together in a class, and **restricting direct access** to the fields.

**Key point:** Use **private fields + public getters/setters**.

**Example:**

```java
class Student {
    private String name;
    private int age;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }
}
```

---

## 7. Constructor overloading

**Definition:**
Multiple constructors in a class with **different parameters**.

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

public class TestConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Loki", 25);
    }
}
```

---

## 8. Can we override static methods?

**Answer:**

- **No**, static methods belong to the class, not the object.
- You can **hide** them in subclass, but it’s not true overriding.

**Example:**

```java
class Parent {
    static void greet() { System.out.println("Hello from Parent"); }
}

class Child extends Parent {
    static void greet() { System.out.println("Hello from Child"); }
}

public class TestStatic {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet(); // calls Parent's static method
    }
}
```

**Output:**

```
Hello from Parent
```

---

## 9. What is runtime polymorphism?

**Definition:**
**Runtime polymorphism** occurs when the method to be executed is determined **at runtime**, usually via **method overriding**.

**Example:**

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Dog's method called at runtime
    }
}
```

**Output:**

```
Dog barks
```

---

## 10. Difference between class and object

| Feature    | Class                         | Object                         |
| ---------- | ----------------------------- | ------------------------------ |
| Definition | Blueprint/template of objects | Instance of a class            |
| Memory     | No memory allocation          | Memory allocated at runtime    |
| Behavior   | Defines methods and fields    | Executes behavior, holds state |
| Example    | `class Car {}`                | `Car myCar = new Car();`       |

---
