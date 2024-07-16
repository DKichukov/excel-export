# Spring Boot - Export Excel File 

This project demonstrates exporting data from a MySQL database to an Excel file using a Spring Boot application with Apache POI. It includes Flyway for database schema management and Docker Compose for running the MySQL database.

## Technologies Used

Spring Boot: Framework for building Java applications.
- Java Development Kit (JDK) 17
- Maven
- Docker and Docker Compose (for running MySQL)
- Apache POI (poi-ooxml): Library for reading and writing Microsoft Office file formats.
- Flyway: Database migration tool for managing database schema changes.

## Usage
### API Endpoint

- GET /api/books/excel: Generates and downloads an Excel file (books.xls) containing data from the books table.

## Excel File Generation
- The /api/book/excel endpoint triggers the generation of an Excel file using Apache POI, fetching data from the MySQL books table.
