# 📘 Static Methods in Java

This folder contains examples that explain the use of **static methods** in Java — how they behave, how they are used, and how they differ from instance methods.

---

## 📂 Files and Their Purpose

1. **StaticMethodAccessing.java**  
   - Demonstrates how to declare a static method and a static variable.  
   - Shows how to call a static method directly from the `main` method without creating an object.  
   - Explains that static methods can access static variables directly because both belong to the class.

2. **StaticMethodAccessingInstanceVariable.java**  
   - Demonstrates how a static method can access an instance variable by first creating an object of the class.  
   - Highlights a common beginner error: trying to use the `this` keyword inside a static method.  
   - Explains why `this` is not allowed — because static methods do not belong to any specific object.

3. **StaticMethodCallingStaticMethod.java**  
   - Demonstrates how one static method can call another static method in the same class.  
   - Explains that calling a non-static method from a static method directly will result in a compilation error.  
   - Shows the correct structure by keeping both methods static.

---

## 🧠 Key Concepts Covered

- Static methods belong to the class, not to instances of the class.
- You can call a static method without creating an object.
- Static methods can only directly access other static members.
- To access instance variables or methods, create an object inside the static method.
- The `this` keyword is not allowed in static methods because it refers to the current object, and static methods do not operate on objects.
- Utility or helper functions in Java are often static (like in the Math class).

---

## ✅ Summary

This folder is designed to help you:
- Understand how static methods work.
- Recognize common errors when mixing static and non-static code.
- Practice writing and fixing code that uses static behavior correctly.

Each file is written to show one or more practical learning points. For the best understanding, try editing and running the code yourself.

## 👨‍💻 Author : Ikramullah Jamali
