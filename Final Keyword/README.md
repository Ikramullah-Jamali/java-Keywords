# 🔑 Java Keywords: `final` and `finally` Examples

This repository provides practical examples of the `final` and `finally` keywords in Java, grouped under a dedicated folder. 
These concepts are essential for understanding Java's approach to immutability, method restrictions, class design, and exception handling.

---

## 📂 Folder: `final_keywords`

The folder includes four Java files, each demonstrating a specific and commonly used feature.

---

### 1️⃣ FinalClassExample.java

This file shows how a class can be made non-inheritable using the `final` keyword. The class `A` is marked as `final`, which means no other class can extend it. 
The program demonstrates that objects of a final class can still be created and used normally, but it enforces strict design to prevent any further subclassing.

#### 📌 **Purpose**: To ensure a class remains unchanged in design or logic by blocking inheritance.

---

### 2️⃣ FinalMethodExample.java

This file explains how a method can be protected from being overridden using the `final` keyword. 
A parent class defines a `final` method, and a subclass attempts (but is not allowed) to override it. 
The override section is commented out to avoid compile-time errors, but it's kept visible for educational purposes.

#### 📌 **Purpose**: To preserve the original implementation of critical methods, even in an inheritance hierarchy.

---

### 3️⃣ FinalVariableExample.java

This program illustrates how `final` variables work in Java. It shows that once a variable is declared as `final` and assigned a value, that value cannot be changed. 
Attempting to reassign it will cause a compile-time error. The example focuses on the use of constants in Java logic.

#### 📌 **Purpose**: To enforce immutability on variables for consistency, safety, and predictability in code.

---

### 4️⃣ Finallyblock.java

This example demonstrates the `finally` block in Java exception handling. 
Even when an exception is thrown (e.g., division by zero), the `finally` block still executes. 
It emphasizes the reliability of `finally` for cleanup operations such as closing files, releasing resources, or showing user-friendly messages.

#### 📌 **Purpose**: To ensure specific code runs regardless of whether an exception occurs or not, typically used for resource cleanup.

---

## 📚 What You Learn

- How `final` can be used to lock down class, method, and variable behavior. 
- How `finally` ensures execution of important code in exception-prone blocks. 
- The role of these keywords in writing secure, reliable, and maintainable code. 

---

## 🚀 How to Run

Each Java file is independent and can be compiled and run using:

javac FileName.java
java ClassName
Use a terminal or any Java IDE (e.g., IntelliJ, Eclipse, BlueJ, or VS Code).
### ✅ Final Note
These examples are kept concise, clean, and educational. 
Whether you're a beginner exploring Java or someone revisiting core concepts, this mini-library gives you a strong foundation in handling final and finally the right way.

## 👨‍💻 Author : Ikramullah Jamali
