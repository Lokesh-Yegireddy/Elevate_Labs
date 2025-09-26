---

# 📘 Expanded InterviewQuestions.md

````markdown
# Java File I/O and Exception Handling – Interview Q&A (Detailed)

---

## 1. Difference between FileReader and BufferedReader?

### Explanation:

- **FileReader**:

  - A basic class to read characters from a file.
  - Reads one character at a time → inefficient for large files.
  - Example: reading a 1MB file will involve 1 million read operations.

- **BufferedReader**:
  - Wraps around a `Reader` class like `FileReader`.
  - Maintains an internal buffer (default 8KB).
  - Reads chunks of characters at once, reducing disk I/O operations.
  - Provides `readLine()` method to read full lines conveniently.

### Code Example:

```java
// FileReader - inefficient for large files
FileReader fr = new FileReader("notes.txt");
int i;
while ((i = fr.read()) != -1) {
    System.out.print((char) i);
}
fr.close();

// BufferedReader - efficient
BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
String line;
while ((line = br.readLine()) != null) {
    System.out.println(line);
}
br.close();
```

````

### Related Questions:

- Why is BufferedReader faster than FileReader?
- Can we use BufferedReader without FileReader?
  → Yes, it can wrap any Reader, e.g., `InputStreamReader`.

---

## 2. What is try-with-resources?

### Explanation:

- Introduced in **Java 7**.
- Used to **automatically close resources** (files, sockets, streams, DB connections).
- Any class implementing `AutoCloseable` can be used.
- Saves us from writing `finally { resource.close(); }`.

### Code Example:

```java
// Traditional way
FileReader fr = null;
try {
    fr = new FileReader("notes.txt");
    // read file
} catch (IOException e) {
    e.printStackTrace();
} finally {
    if (fr != null) fr.close();
}

// Try-with-resources
try (FileReader fr2 = new FileReader("notes.txt")) {
    // read file
} catch (IOException e) {
    e.printStackTrace();
}
```

### Related Questions:

- What happens if multiple resources are declared?
  → They are closed in **reverse order** of declaration.

---

## 3. How to handle IOException?

### Explanation:

- **IOException** is a **checked exception** → must be caught or declared using `throws`.
- Indicates failure in I/O operations (file not found, permission denied, etc.).

### Approaches:

1. **try-catch** → handle locally.
2. **throws** → delegate handling to caller.

### Code Example:

```java
// Handling locally
try {
    FileReader fr = new FileReader("data.txt");
} catch (IOException e) {
    System.err.println("Error: " + e.getMessage());
}

// Delegating responsibility
public void readFile() throws IOException {
    FileReader fr = new FileReader("data.txt");
}
```

---

## 4. What are checked and unchecked exceptions?

### Explanation:

- **Checked Exceptions**:

  - Checked at **compile time**.
  - Must be either caught or declared using `throws`.
  - Example: `IOException`, `SQLException`.

- **Unchecked Exceptions**:

  - Subclass of `RuntimeException`.
  - Checked only at **runtime**.
  - Example: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

### Code Example:

```java
// Checked Exception
try {
    FileReader fr = new FileReader("abc.txt"); // File may not exist
} catch (IOException e) {
    e.printStackTrace();
}

// Unchecked Exception
int[] arr = {1, 2, 3};
System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
```

---

## 5. How does file writing work in Java?

### Explanation:

- Uses `FileWriter`, `BufferedWriter`, or `PrintWriter`.
- Writes characters to file (not binary data).
- Data is stored in OS buffer → flushed to disk.

### Code Example:

```java
// Overwrite mode
try (FileWriter fw = new FileWriter("notes.txt")) {
    fw.write("Hello World");
}

// Append mode
try (FileWriter fw = new FileWriter("notes.txt", true)) {
    fw.write("\nNew Line");
}
```

### Related Questions:

- Difference between character streams and byte streams?
- Why use BufferedWriter with FileWriter?

---

## 6. Difference between append and overwrite mode?

### Explanation:

- **Overwrite Mode (default)**: Clears the file before writing.
- **Append Mode**: Adds new content at the end.

### Example:

```java
new FileWriter("file.txt");        // overwrite
new FileWriter("file.txt", true);  // append
```

---

## 7. What is exception propagation?

### Explanation:

- When an exception occurs in a method, it is **passed up the call stack** until handled.
- If not handled anywhere, program terminates.

### Code Example:

```java
public void methodA() {
    int x = 10 / 0; // ArithmeticException
}

public void methodB() {
    methodA(); // propagates here
}

public static void main(String[] args) {
    new Demo().methodB(); // if not caught, program crashes
}
```

### Related:

- Can checked exceptions propagate without handling?
  → Yes, only if declared using `throws`.

---

## 8. How to log exceptions?

### Approaches:

1. **Print stack trace**

   ```java
   e.printStackTrace();
   ```

2. **System.err**

   ```java
   System.err.println("Error: " + e.getMessage());
   ```

3. **Logging Frameworks**

   - `java.util.logging`
   - `Log4j`
   - `SLF4J`

### Example using Logger:

```java
import java.util.logging.Logger;

Logger logger = Logger.getLogger("MyApp");
try {
    int x = 5 / 0;
} catch (Exception e) {
    logger.severe("Exception occurred: " + e.getMessage());
}
```

---

## 9. What is a stack trace?

### Explanation:

- A **report of method calls** leading to the exception.
- Helps debug where error occurred.
- Contains exception type, message, and call stack.

### Example:

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Demo.methodA(Demo.java:10)
    at Demo.main(Demo.java:15)
```

---

## 10. When to use finally block?

### Explanation:

- `finally` is always executed after try-catch, regardless of exception.
- Best used for **cleanup**: closing files, DB connections, sockets.

### Code Example:

```java
FileReader fr = null;
try {
    fr = new FileReader("data.txt");
} catch (IOException e) {
    e.printStackTrace();
} finally {
    if (fr != null) {
        fr.close(); // cleanup
    }
}
```

### Related Questions:

- What if both `catch` and `finally` have `return`?
  → `finally` executes, but its `return` overrides `catch`.

---

# ✅ Extra Possible Interview Questions

1. Difference between **throw** and **throws**?
2. What happens if `close()` throws an exception inside finally?
3. Why prefer `try-with-resources` over `finally`?
4. Difference between **BufferedWriter** and **PrintWriter**?
5. Can we read and write simultaneously on same file?
6. Why are streams in Java divided into byte and character streams?
7. What is the difference between `File` class and `FileReader`/`FileWriter`?
8. Can IOException be unchecked? Why or why not?
9. How does Java handle OS-level file locks?
10. What’s the difference between checked exceptions and errors?

```

---
````
