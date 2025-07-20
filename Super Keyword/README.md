# 🔑 Super Keyword in Java
This repository contains beginner-friendly Java programs that demonstrate different uses of the super keyword, a core concept in object-oriented programming.
The super keyword is used to refer to the immediate parent class. It helps in accessing:
Parent constructors
Parent methods
Parent variables

---

## 📁 File Descriptions
### 📌 1. SuperConstructorCall.java
This file demonstrates how to use super() to call the constructor of a parent class from a subclass constructor.

#### 🔹 If super() is not explicitly written, Java automatically adds it as the first line of the subclass constructor.
#### 🔹 This ensures that the parent class is properly initialized before the subclass adds its own logic.

#### Concept Shown: Constructor chaining using super()

### 📌 2. SuperMethodCall.java
This program shows how the super keyword can be used to call a method from the parent class, especially when it is overridden in the subclass.

#### 🔹 The subclass has a method with the same name as in the parent class.
#### 🔹 Inside another method (called show()), both the child and parent versions of the method are called.
#### 🔹 super.methodName() is used to specifically call the parent version, while calling the method name directly refers to the child version.

#### Concept Shown: Method overriding and how to access parent method using super

### 📌 3. SuperVariableAccess.java
This file explains how super is used to access variables from the parent class when the subclass also defines a variable with the same name.

#### 🔹 The parent and child classes both have an int variable named i.
#### 🔹 A method prints three values: the method parameter, the child class variable (using this), and the parent class variable (using super).

#### Concept Shown: Resolving variable name conflicts using super

---

## 🧠 Summary Table
Use of super	What It Does
super()	Calls the constructor of the parent class
super.methodName()	Calls the overridden method from the parent class
super.variableName	Accesses the variable from the parent class

---

## 🎯 Purpose of This Folder
These programs are designed to:
Help Java learners understand inheritance and how parent-child relationships work.
Show real use-cases of the super keyword in different scenarios.
Prepare students for OOP-based interviews and exams.

#### 📘 Part of a series on Java Object-Oriented Programming concepts. Simple, clean, and educational!

## 👨‍💻 Author : Ikramullah Jamali
