
# Merchant Pathao Automation with TestNG

This project is an automation framework designed to test the Merchant functionalities of the Pathao platform using Selenium and TestNG. The project is configured with Maven for dependency management.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Project Setup](#project-setup)
- [Running Tests](#running-tests)
- [Folder Structure](#folder-structure)
- [Dependencies](#dependencies)

## Technologies Used

- **Java**: Programming language used for test development.
- **Selenium**: WebDriver for browser automation.
- **TestNG**: Testing framework for running and managing tests.
- **Maven**: Build tool and dependency manager.

## Project Setup

### Prerequisites

1. Ensure that you have JDK 8 or higher installed.
2. Install [Maven](https://maven.apache.org/).

### Cloning the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/sadmanpieal/Merchant-Pathao-With-TestNG.git
   cd Merchant-Pathao-With-TestNG
   ```

2. Import the project into your IDE (e.g., IntelliJ IDEA or Eclipse).

### Maven Dependencies

All required dependencies are listed in the `pom.xml` file. They will be downloaded automatically by Maven.

To install the dependencies, run:

```bash
mvn clean install
```

## Running Tests

The tests can be executed using TestNG. To run the tests:

1. Open your terminal or command prompt.
2. Navigate to the project directory.
3. Run the following Maven command to execute the tests defined in `testng.xml`:

   ```bash
   mvn test
   ```

Alternatively, you can run the tests directly from your IDE by right-clicking on the `testng.xml` file and selecting `Run`.

## Folder Structure

- **src/main/java**: Contains the application source code.
- **src/test/java**: Contains the test cases for automation.
- **pom.xml**: Maven configuration file for managing dependencies.
- **testng.xml**: Configuration file for managing TestNG test suite execution.

## Dependencies

The project uses the following main dependencies:

1. **Selenium Java (v4.25.0)**:
   - Selenium WebDriver for automating browser actions.
   - Maven dependency:
   ```xml
   <dependency>
       <groupId>org.seleniumhq.selenium</groupId>
       <artifactId>selenium-java</artifactId>
       <version>4.25.0</version>
   </dependency>
   ```

2. **TestNG (v7.10.2)**:
   - TestNG framework for running test cases.
   - Maven dependency:
   ```xml
   <dependency>
       <groupId>org.testng</groupId>
       <artifactId>testng</artifactId>
       <version>7.10.2</version>
       <scope>test</scope>
   </dependency>
   ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
