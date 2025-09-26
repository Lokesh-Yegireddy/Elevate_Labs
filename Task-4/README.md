# Java Notes App (File Persistence)

## Overview

This is a simple Java project that demonstrates **file persistence** using `FileWriter`, `FileReader`, and `BufferedReader`.  
Users can:

- **Write notes** to a file.
- **Read saved notes** back from the file.

## Features

1. **Write Notes**

   - Saves user input into a file (`notes.txt`).
   - Appends new notes instead of overwriting existing ones.

2. **Read Notes**
   - Reads all saved notes from the file.
   - Displays them in a clean format.

## Outcome

- Learn to **persist data** using Java I/O.
- Understand difference between **FileWriter** and **BufferedReader**.
- Practice handling **IOException** using try-with-resources.

## How to Run

1. Compile the code:
   ```bash
   javac WriteNotes.java ReadNotes.java
   ```

JavaNotesApp/
├── README.md
├── WriteNotes.java
├── ReadNotes.java
├── notes.txt
└── Screenshots/
├── image.png

output:

## 📸 Screenshots

### 1. Writing a Note

![Writing/Reading a Note](Screenshots/image.png)
