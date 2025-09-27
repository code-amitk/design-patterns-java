📌 1. Singleton Pattern
🔹 Definition

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to that instance.

🔹 When to Use

Managing shared resources (e.g., database connection, logging system).

Ensuring global state consistency.

🔹 Key Features

Private constructor.

Static method that returns the same instance.

📌 2. Factory Method Pattern
🔹 Definition

The Factory Method Pattern defines an interface for creating objects but lets subclasses decide which class to instantiate.

🔹 When to Use

When a class cannot anticipate the type of object it must create.

To allow new product classes to be introduced without modifying existing code.

🔹 Key Features

Superclass defines a factory method.

Subclasses override the factory method to create specific objects.

📌 3. Abstract Factory Pattern
🔹 Definition

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

🔹 When to Use

When the system should be independent of how its products are created.

To enforce consistency among products in the same family (e.g., UI themes: button, checkbox, dropdown).

🔹 Key Features

Abstract factory declares methods for creating abstract products.

Concrete factories implement these methods to produce related objects.
