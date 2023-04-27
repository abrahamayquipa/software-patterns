<br>
<div align="center">
    <h1 align="center">🖥️ Software pattners</h1>
    <span>Detailed summary of all about software patterns - The Gang of Force.</span>
</div>

## 📖 Definition
Design patterns are common solutions to common problems in software design. 
Each pattern is like a blueprint that can be customized to solve a particular design problem in your code.

## ✨ Advantages of patterns
Patterns are a set of tools that provide solutions to common software design problems. 
They define a common language that helps your team to communicate more efficiently.

## Most used patterns
* Factory method
* Singleton
* Observer
* Strategy
* Adapter
* Builder
* State

## ⛓️ Types software pattners 
###  🛠️ Creational:
These patterns focus on the creation of objects and their initialization. The main goal is to facilitate the creation of objects in an efficient and flexible way.

Example from everyday life: When buying a car, there are different customization options, such as color, model and additional features. 
The purchase process involves the creation of a customized car object according to the customer's specifications.

* Factory Method: This pattern is used to create objects without specifying the exact type of the object to be created. 
For example, a car factory may have different production lines for different types of cars (sedan, station wagon, sports car), but the customer only needs to specify the type of car he wants to buy.

* Abstract Factory: This pattern provides an interface to create families of related or dependent objects without specifying their concrete classes. 
For example, a furniture factory can have an "abstract factory" interface to create different types of furniture (tables, chairs, sofas) that share a common design or style.

* Builder: This pattern is used to build complex objects step by step. 
For example, when building a house, first the walls are built, then the floors and ceilings are added, and finally the furniture and accessories are installed.

* Singleton: This pattern ensures that a class has a single instance and provides a global access point to it. 
For example, a class that manages a database connection can be a singleton to ensure that there is always a single active connection in the system.

* Prototype: This pattern is used to create new objects by cloning existing objects. For example, a photo store may have a library of photo album templates, and customers can customize and clone these templates to create their own custom albums.

### 🏗️ Structural:
These patterns focus on the composition of objects and their relationship to each other. The main objective is to define how objects interact with each other to form larger structures.

Example from everyday life: A building is composed of different elements, such as walls, windows, doors and floors. 
Each of these elements interacts with each other to form the complete structure of the building.

* Adapter: allows two incompatible interfaces to work together. 
An example from everyday life is the power adapter used to connect electronic devices from different regions of the world.

* Bridge: separates an abstraction from its implementation, allowing the two to change independently. 
An example from everyday life is a remote control for televisions, which separates the functionality of the remote control buttons from the implementation of the television itself.

* Composite: composes objects into tree structures to represent complete hierarchies of objects. An example from everyday life is a file folder on a computer containing subfolders and individual files.

* Decorator: adds responsibilities to an object dynamically. 
An example from everyday life is adding a decorative border to a picture frame to enhance its appearance.

* Facade: provides a simplified interface to a complex subsystem. An example from everyday life is a mobile shopping application that hides the complexity of the checkout process behind an intuitive user interface.

* Flyweight: enables the efficient creation of multiple similar objects. An example from everyday life is a printer that uses a single ink source to print different colors.

* Proxy: provides an object that acts as an intermediary for another object. An example from everyday life is a proxy server that handles network requests on behalf of a client to increase security or performance.

### ✍🏻 Behavioral:
These patterns focus on the interaction and communication between objects and how they perform different behaviors and tasks. The main objective is to define the interaction between objects and how they respond to different situations.

Example from everyday life: When two people talk to each other, there is interaction and communication between them. Each person can perform different behaviors, such as listening, talking, asking questions, etc. The interaction and behavior between these people is defined by behavioral software patterns.

* Strategy: Allows you to change the behavior of an object at runtime. An example would be a video game where a character can change its attack strategy depending on the situation.

* Observer: Allows an object to notify other objects when there is a change in its state. An example would be a "like" button on a social network that notifies other users when someone has "liked" a post.

* Template Method: Defines the structure of an algorithm and allows subclasses to provide specific implementations of individual steps. 
An example would be a cooking recipe where the general structure is the same for different types of dishes, but the ingredients and specific steps may vary.

* Chain of Responsibility: Allows a series of objects to handle a request sequentially until one of them handles it. 
An example would be a chain of stores where each store can handle a purchase request, but if the local store does not have an item, it sends it to the regional store and so on.

* Command: Encapsulates a request as an object, allowing it to be parameterized with different requests, queued or logged, and undone. 
An example would be a TV remote control that sends commands to the TV to change the channel or turn up the volume.

* Iterator: Provides a way to sequentially access the elements of a collection without exposing its internal structure. 
An example would be an online product catalog where the user can scroll through the products one by one without knowing the internal structure of the database.

* Mediator: Defines an object that encapsulates how a set of objects communicate and minimizes the dependencies between them. 
An example would be an online chat where the mediator is the chat server that communicates with all users and allows them to send messages to each other.

* Memento: Allows an object to capture its internal state and restore it later without violating the encapsulation principle. 
An example would be a word processor that automatically saves the file being edited and allows the user to revert to a previous version of the file if necessary.

* State: Allows an object to alter its behavior when its internal state changes. 
An example would be a thermostat that changes the temperature in a room depending on the time of day or the presence of people.

* Strategy: Defines a family of algorithms, encapsulates each one and makes them interchangeable. 
An example would be a photo editing program that allows the user to select different algorithms to resize the image or adjust the brightness and contrast.

* Visitor: Allows adding new operations to an existing class without modifying it. An everyday example would be an inspector visiting different rooms of a house and performing different actions in each room without having to modify the structure of the house itself.