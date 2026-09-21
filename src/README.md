# GamingConsoleFactory

## Description

This project demonstrates two design patterns in Java:

- Factory Method
- Abstract Factory

The project uses gaming consoles as an example.

The main products are:

- PlayStation
- Xbox
- PlayStation Controller
- Xbox Controller

---

## Factory Method

The Factory Method is used to create different types of consoles.

Main classes:

- `Console` — Product
- `PlayStation` and `Xbox` — Concrete Products
- `ConsoleCreator` — Creator
- `PlayStationCreator` and `XboxCreator` — Concrete Creators

Example:

```java
ConsoleCreator creator = new PlayStationCreator();
creator.startConsole();
```

The creator decides which console should be created.

---

## Abstract Factory

The Abstract Factory is used to create related products as a family.

There are two families:

### PlayStation Family

- PlayStation Console
- PlayStation Controller

### Xbox Family

- Xbox Console
- Xbox Controller

Main classes:

- `GamingConsoleFactory` — Abstract Factory
- `PlayStationFactory` — Concrete Factory
- `XboxFactory` — Concrete Factory
- `Controller` — Abstract Product
- `PlayStationController` and `XboxController` — Concrete Products

Example:

```java
GamingConsoleFactory factory = new PlayStationFactory();

Console console = factory.createConsole();
Controller controller = factory.createController();
```

---

## Project Structure

```text
src
├── factorymethod
│   ├── Console.java
│   ├── ConsoleCreator.java
│   ├── PlayStation.java
│   ├── PlayStationCreator.java
│   ├── Xbox.java
│   └── XboxCreator.java
│
├── abstractfactory
│   ├── Controller.java
│   ├── GamingConsoleFactory.java
│   ├── PlayStationController.java
│   ├── PlayStationFactory.java
│   ├── XboxController.java
│   └── XboxFactory.java
│
└── Main.java
```

---

## Clean Code Principles

### 1. Single Responsibility

Each class has its own responsibility.

For example, `PlayStationFactory` creates PlayStation products, while `XboxFactory` creates Xbox products.

### 2. Meaningful Names

Classes and methods have clear names such as:

```java
createConsole()
createController()
start()
getName()
```

### 3. Encapsulation

The project uses interfaces to hide implementation details and allows the client to work with general types such as `Console` and `Controller`.

### 4. Polymorphism

Different classes implement the same interfaces.

For example:

```java
Console playStation = new PlayStation();
Console xbox = new Xbox();
```

Both objects can be used through the `Console` interface.

### 5. Separation of Creation

The client does not directly create the concrete console and controller objects.

Factories are responsible for creating them.

---

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open `Main.java`.
3. Run the `main()` method.

The program demonstrates both Factory Method and Abstract Factory.

---

## Technologies

- Java
- IntelliJ IDEA
- Git
- GitHub

## Conclusion

This project demonstrates how Factory Method can be used to create individual products and how Abstract Factory can be used to create related product families.
