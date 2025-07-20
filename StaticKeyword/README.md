# 🧲 Java `static` Keyword – Full Concept Guide

Welcome to the **StaticKeyword** section of the [`java-Keywords`] repository!  
This folder provides practical examples and explanations of how the `static` keyword works in Java.

---

## 📘 What is the `static` Keyword in Java?

The `static` keyword is used for memory management in Java.  
It makes a **field, method, block, or nested class** belong to the **class** rather than to instances (objects) of the class.

That means:
> Static members are **shared across all objects** and can be accessed **without creating an object**.

---

## 🧪 Where Can `static` Be Used?

| Context         | Example Use                                    |
|-----------------|------------------------------------------------|
| Static Variable | Shared value for all objects (e.g. counter)    |
| Static Method   | Utility method (e.g. `Math.max(a, b)`)         |
| Static Block    | Run code only once when the class is loaded    |
| Static Class    | Nested helper classes inside another class     |

---

## 📂 Subfolders & Topics Covered

| Subfolder | Description |
|-----------|-------------|
| `StaticMethod` | 🔹 Demonstrates how to define, call, and return values from static methods |
| `StaticVariable`| 🔸 Shows how static variables are shared across objects |
| `StaticBlock`| 🔧 Explains static blocks and their use for one-time initialization |
| `StaticVsInstance` | ⚖️ Compares static and instance members (methods and variables) |

---

## 📝 Detailed Concepts Explained

### 🔹 1. Static Variable
- Declared with the `static` keyword inside a class.
- Only **one copy** is created, shared across all instances.
- Useful for counters, constants, or shared resources.

---

### 🔹 2. Static Method
- Can be called using `ClassName.methodName()`
- Cannot access non-static variables or use `this`
- Commonly used for **utility/helper functions**

---

### 🔹 3. Static Block
- A block that runs once when the class is first loaded.
- Great for **initializing static data**.

---

### 🔹 4. Static vs Instance
- Instance members belong to an object; static belongs to the class.
- Static methods cannot use instance variables directly.

---

## 🚀 Real-World Examples

| Scenario | Use of `static` |
|----------|------------------|
| Counter that tracks total objects | `static int count` shared among objects |
| Math operations | `Math.abs()`, `Math.pow()` are static methods |
| Constants | `static final double PI = 3.14` |
| Utility Classes | `Collections.sort()` or `Arrays.toString()` |

---

## ✅ Best Practices

- Use `static` for **shared logic/data**, not object-specific behavior.
- Don’t overuse `static` — it breaks encapsulation if used wrongly.
- Use static methods in **utility/helper** or **factory** classes.

---

📚 *Perfect for Java beginners and intermediates who want to understand how `static` works with hands-on code examples.*  
⭐ Star this repo if you find it helpful!

---

## 👨‍💻 Author : Ikramullah Jamali
