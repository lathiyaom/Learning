# Learning

A personal collection of Java projects, exercises and experiments maintained by lathiyaom. This repository contains small-to-medium sized Java examples, learning exercises, and reference code intended to help practice core Java concepts and common libraries.

> Language: Java (100%)

## Table of contents
- [About](#about)
- [Highlights](#highlights)
- [Prerequisites](#prerequisites)
- [Build & Run](#build--run)
- [Project layout](#project-layout)
- [Testing](#testing)
- [Contributing](#contributing)
- [Issues & Support](#issues--support)
- [License](#license)
- [Contact](#contact)

## About
This repository is a learning-focused collection of Java code. Each folder typically contains an independent example or small project demonstrating a concept (algorithms, data structures, core Java APIs, I/O, concurrency, unit tests, small utilities, etc.). The code is intended to be readable, educational, and easy to run.

## Highlights
- Clear, focused examples for learning Java fundamentals
- Small projects and exercises suitable for step-by-step study
- Examples intended to be run from IDEs or the command line
- Test examples (where present) to demonstrate unit testing

## Prerequisites
- Java Development Kit (JDK) 8 or newer installed (preferred JDK 11+)
- An IDE (IntelliJ IDEA, Eclipse, VS Code) is recommended for exploration
- Some modules may use Maven or Gradle — install one of those if required for a particular subproject

Check each subproject's folder for a README or build file (pom.xml / build.gradle) to see the required Java version and dependencies.

## Build & Run

Common ways to build and run examples:

1) Compile & run with javac/java (simple scripts/projects)
- Navigate into the example directory:
  - javac:
    ```
    javac -d out src/com/example/*.java
    ```
  - run:
    ```
    java -cp out com.example.Main
    ```

2) Using Maven (if a subproject has a pom.xml)
- Build:
  ```
  mvn clean package
  ```
- Run (if the JAR is executable):
  ```
  java -jar target/your-artifact.jar
  ```
- Run tests:
  ```
  mvn test
  ```

3) Using Gradle (if a subproject has build.gradle)
- Build:
  ```
  ./gradlew build
  ```
- Run tests:
  ```
  ./gradlew test
  ```
- Run a Java application (configure `application` plugin or use `java -cp` on the produced jar)

4) Open the project in your IDE
- Import as a Maven/Gradle project if build files are present, or create a standard Java project and add source folders.
- Run the main class from the IDE run configuration.

Note: Specific examples may include additional instructions in their own folders — check those READMEs first.

## Project layout
Top-level folders typically follow this pattern (may vary by subproject):
- /example-name
  - src/main/java/... — source code
  - src/test/java/... — unit tests (if present)
  - pom.xml or build.gradle — build config (optional)
  - README.md — example-specific instructions (optional)

## Testing
Where unit tests are present, they generally use JUnit (common in Java projects). Use the build tool commands described above (mvn test or gradle test) to run tests.

## Contributing
Contributions are welcome! If you want to add an example or improve an existing one:
1. Fork the repository.
2. Create a topic branch: git checkout -b feature/your-topic
3. Add your code, tests, and a short README for the example.
4. Commit and push your branch.
5. Open a pull request describing the change.

Guidelines:
- Keep examples focused and small.
- Include comments or a short README explaining the learning objective.
- Prefer clear, idiomatic Java code.
- Add tests where reasonable.

## Issues & Support
Found a bug or want to request an example? Open an issue describing:
- The example or file path
- Steps to reproduce or the idea you'd like implemented
- Java version and build tool used

When opening a PR, link the related issue if one exists.

## License
This repository does not specify a license by default. If you want to reuse code, please contact the repository owner or open an issue to request a license. To add a license, create a LICENSE file in the repository root.

(If you are the owner and want a licence, common choices are MIT, Apache-2.0, or GPL-3.0. Add a LICENSE file and update this section.)

## Contact
Repository: https://github.com/lathiyaom/Learning

Owner / maintainer: lathiyaom

Questions, suggestions, or contributions are welcome via issues and pull requests.

Happy learning!
