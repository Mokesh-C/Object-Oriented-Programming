# Object-Oriented Programming in Java — Learning Examples

This repository contains small, focused Java examples that demonstrate core Object-Oriented Programming (OOP) concepts. Each topic is provided as a separate package (folder) and includes example classes and a `Main` class that demonstrates the concept.

## What this repository contains

- AbstractClasses — examples of abstract classes and concrete subclass implementations.
- AccessModifiers — examples demonstrating visibility rules (default, private, protected, public).
- ClassAndObject — basic class and object examples, `final` usage, and wrapper class demonstrations.
- Encapsulation — examples showing information hiding with private fields and public getters/setters (includes `ATM`).
- Enumeration — examples using Java `enum` types.
- ExceptionAndClone — examples of custom exceptions and cloning-related code.
- Generics — examples demonstrating generic types and methods.
- Inheritance — examples of superclass/subclass relationships and method overriding.
- Interfaces — examples of interfaces and their implementations.
- LamdaFunctions — examples of lambda expressions and functional interfaces.
- Polymorphism — examples of method overloading and overriding.
- SimplePackage — compact example showing package structure and related classes.
- Static — examples demonstrating `static` fields/methods, static blocks, and a singleton pattern.

## Package summaries

- AbstractClasses
  - Focus: abstract classes, abstract methods and concrete implementations.
  - Files (examples): `Deposit.java`, `Transaction.java`, `Transfer.java`, `Withdraw.java`, `Main.java`.

- AccessModifiers
  - Focus: visibility rules and access from different classes and packages.
  - Files (examples): `College.java`, `Student.java`, `Manager.java`, `ObjectClass.java`, `Main.java`.

- ClassAndObject
  - Focus: class design, `final` classes, finalize-related examples, wrapper classes.
  - Files (examples): `FinalClass.java`, `FinalizeClass.java`, `SimpleClass.java`, `WrapperClass.java`.

- Encapsulation
  - Focus: keeping fields private and exposing behavior via getters/setters; includes an `ATM` example.
  - Files (examples): `ATM.java`, `Main.java`.

- Enumeration
  - Focus: defining and using `enum` types, constructors and methods inside enums.
  - Files (examples): `Month.java`, `Main.java`.

- ExceptionAndClone
  - Focus: custom exceptions and cloning patterns.
  - Files (examples): `CustomException.java`, `ExceptionClass.java`, `Student.java`, `Main.java`.

- Generics
  - Focus: parameterized classes and methods to improve type safety.
  - Files (examples): `Array.java`, `Main.java`.

- Inheritance
  - Focus: `extends` relationships, `super` usage, and overridden behavior.
  - Files (examples): `Employee.java`, `Main.java`.

- Interfaces
  - Focus: interface definitions, multiple interface implementation, and contracts for classes.
  - Files (examples): `BaseInfo.java`, `Payable.java`, `Workable.java`, `Employee.java`, `Main.java`.

- LamdaFunctions
  - Focus: lambda expressions and functional-style constructs introduced in Java 8.
  - Files (examples): `Lamda.java`, `Student.java`, `Main.java`.

- Polymorphism
  - Focus: compile-time and runtime polymorphism via method overloading and overriding.
  - Files (examples): `Employee.java`, `Main.java`.

- SimplePackage
  - Focus: simple package-level organization and related class examples.
  - Files (examples): `Employee.java`, `SeniorManger.java`.

- Static
  - Focus: `static` fields and methods, static initialization, and a simple singleton example.
  - Files (examples): `SingletonClass.java`, `StaticBlock.java`, `StaticMethod.java`.

## How to explore and experiment (IntelliJ and other editors)

- For IntelliJ IDEA:
  1. Create or open a Java project in IntelliJ.
  2. Copy the package folders from this repository into the project's source root used for Java sources.
  3. In the Project tool window, open any package and run its `Main` class by right-clicking the `Main` class and selecting Run, or by using the run icon next to the `main` method.
  4. Edit or extend the example classes, then re-run the `Main` classes to observe behavior.

- For other editors or build tools:
  - Place the package folders into the project's source folder used by your editor or build tool. Open or import the project with your editor, then run the `Main` classes using the editor or build tool's standard workflow.

This is a personal learning repository. The examples are intentionally compact so they are easy to read and change while studying OOP concepts in Java.
