# Grade Management System

## Overview

The Grade Management System is a Java-based application designed to manage student grades. It allows users to add students, assign grades, search for students by their matriculation number, and generate reports.

## Features

- Add students to a class
- Assign grades to students
- Search for students by their matriculation number
- Generate and display reports of students, including their grades and average grades

## Project Structure

The project consists of the following main components:

### Classes

- **Aluno**: Represents a student with attributes for name, matriculation number, and grades. It includes methods to calculate the average grade and to return a formatted string with the student's details.
- **MainClass**: Contains the main method and provides a menu-driven interface for interacting with the system.
- **Turma**: Represents a class of students. It includes methods to add students, search for students by matriculation number, and generate reports.

### Interface

- **Relatorio**: An interface with a method to generate reports. The `Turma` class implements this interface.

## Getting Started

### Prerequisites

- Java 17 or higher
- An IDE such as Eclipse or IntelliJ IDEA

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/GradeManagementSystem.git
   ```
2. Open the project in your preferred IDE.

### Running the Application

1. Navigate to the `MainClass` file.
2. Run the `MainClass` file to start the application.
3. Follow the menu-driven interface to interact with the system.

## Usage

- **Add Student**: Add a new student to the class by providing their name and matriculation number.
- **Assign Grades**: Assign grades to a student by their matriculation number.
- **Search Student**: Search for a student by their matriculation number to view their details.
- **Generate Report**: Generate and display a report of all students, including their grades and average grades.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, please contact [yourname@example.com](mailto:yourname@example.com).