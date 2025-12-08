# Object Oriented Programming (Java) — Learning Examples

This repository is a personal learning collection of small Java programs demonstrating core Object-Oriented Programming (OOP) concepts. The code is organized by topic (packages) and contains short examples you can compile and run locally.

## What this repo contains

- AccessModifiers — examples showing default, private, protected, public members and usage across classes.
- ClassAndObject — simple classes, final classes, wrapper usage and finalize demos.
- Encapsulation — examples showing information hiding (private fields + public getters/setters) and an `ATM` example.
- Inheritance — basic inheritance examples (superclass/subclass relationships).
- Polymorphism — runtime/compile-time polymorphism examples.
- SimplePackage — example showing a package with multiple related classes.
- Static — examples of `static` fields, static initialization, singleton pattern, and static methods.

Each package typically contains a `Main.java` with a simple `main` method you can run to see the concept in action.

## Prerequisites

- Java Development Kit (JDK) 8 or later installed and `javac` / `java` available on your PATH.
- A terminal (on Windows, use Command Prompt `cmd.exe`) and basic familiarity with `javac` and `java`.

## Compile and run (Windows / cmd.exe)

From the repository root (the directory that contains the Java source folders), run the commands below. Replace `<path-to-java-files>` with the path or pattern that matches your `.java` files (for example, a specific folder or a list of files).

```cmd
:: create an output directory for compiled classes
if not exist out mkdir out

:: compile Java source files into the out directory (replace placeholder with your paths)
javac -d out <path-to-java-files>

:: run a sample Main for a package (example: AccessModifiers)
java -cp out AccessModifiers.Main
```

Notes:
- The `-d out` flag tells `javac` to put `.class` files into the `out` folder while preserving package structure.
- To run another example, replace `AccessModifiers.Main` with the package-qualified class name of the `Main` you want to run (e.g. `Encapsulation.Main`, `Inheritance.Main`, `Polymorphism.Main`).
- Using an IDE (IntelliJ IDEA, Eclipse, VS Code) is the easiest way to run individual `Main` classes and explore these examples.

## Package summaries

- AccessModifiers
  - Demonstrates default, private, protected, and public members and how they can be accessed from other classes.
  - Example files: `College.java`, `Student.java`, `Manager.java`, `Main.java`.

- ClassAndObject
  - Shows class creation, final classes, finalizers, simple classes and wrapper class usage.

- Encapsulation
  - Contains examples that show how to keep fields private and expose behavior safely (e.g. `ATM.java`).

- Inheritance
  - Demonstrates `extends` relationships and shared behavior across subclasses.

- Polymorphism
  - Shows method overriding and polymorphic behavior when using superclass references.

- SimplePackage
  - Small package-level design example with related classes.

- Static
  - `SingletonClass.java` (pattern example), `StaticBlock.java` (static initializer), and `StaticMethod.java` (static methods/fields).

## How to explore and experiment

- Open the project in your IDE (IntelliJ IDEA, Eclipse, VS Code, etc.).
- Run individual `Main` classes from your IDE for quick feedback.
- Modify values or add new small examples to practice (for instance, add a subclass in `Inheritance` or a new `Main` demonstrating edge cases).



