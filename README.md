# LibSys - Library Management System

## Overview
LibSys is a simple command-line Library Management System built in Java. It allows users to manage books and members, issue and return books, and view the current library catalog.

## Features
- Add new books and members.
- Issue books to members.
- Return issued books.
- View all books in the library.
- View all registered members.
- User-friendly command-line interface.

## Technologies Used
- Java
- Object-Oriented Programming (OOP)

## How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/your-repo/LibSys.git
   ```
2. Navigate to the project directory:
   ```sh
   cd LibSys
   ```
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the program:
   ```sh
   java Main
   ```

## Usage
Upon running the program, you will be presented with a menu:
1. Add a new book
2. Add a new member
3. Issue a book
4. Return a book
5. View all books
6. View all members
7. Exit

Follow the prompts to interact with the system.

## Code Structure
- `Main.java` - Entry point for the application, providing the CLI interface.
- `Library.java` - Manages books and members.
- `Book.java` - Represents a book with details like ID, title, author, and issued status.
- `Member.java` - Represents a library member with an assigned ID and book issue details.

## License
This project is open-source and free to use under the MIT License.

