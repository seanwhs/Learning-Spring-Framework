# Spring Framework Learning Repository

This repository documents the iterative development of a Game Runner application using the Spring Framework. The goal is to progressively move from tightly coupled Java code to a loosely coupled design, leveraging Spring's features for dependency injection and configuration.

## Iterations Overview

### Iteration 1: Tightly Coupled Java Code

In this iteration, the Game Runner is implemented with tightly coupled Java code. The GameRunner class directly depends on concrete implementations of game classes, such as Mario, SuperContra, Pacman, etc.

### Iteration 2: Loose Coupling - Interfaces

The second iteration introduces loose coupling through interfaces. The GameRunner class now depends on a GamingConsole interface, allowing for more flexibility in adding new game implementations without modifying the GameRunner.

### Iteration 3: Loose Coupling - Spring Level 1

This iteration takes advantage of Spring Beans for managing objects and wiring dependencies. The Spring framework is utilized to handle the instantiation and configuration of objects, bringing a higher level of abstraction to the application.

### Iteration 4: Loose Coupling - Spring Level 2

In the final iteration, Spring annotations are introduced for further simplification and automation. Annotations such as @Service, @Primary, and @Qualifier are used to guide Spring in creating, managing, and autowiring objects, reducing boilerplate code.

## Project Structure

The project follows a modular structure:

- **src/main/java/learn/springframework/game:** Contains the source code for game-related classes.
- **src/main/java/learn/springframework:** Houses the main application classes, including the GameRunner and the Spring configuration classes.

## How to Run

To run the application, follow these steps:

1. Clone the repository to your local machine.
2. Ensure you have Java and Maven installed.
3. Navigate to the root directory of the project.
4. Run the following command in your terminal:

    ```bash
    mvn clean install
    ```

5. Execute the application:

    ```bash
    java -jar target/your-application-jar-name.jar
    ```

Feel free to explore each iteration and dive into the code to understand the gradual transformation from tight to loose coupling using the Spring Framework.

Happy learning!
