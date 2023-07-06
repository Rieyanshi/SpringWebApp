# SpringWebTelusko3

SpringWebTelusko3 is a simple Spring Boot application that provides a RESTful API for managing products. It leverages Spring Web, JPA, and Hibernate to handle CRUD (Create, Read, Update, Delete) operations for the Product entity.

## Features

- Retrieve a list of all products
- Retrieve a specific product by name
- Add new products (commented out in the current code)
- Product entity with properties such as name, type, place, and warranty
- Integration with an H2 in-memory database using Spring Data JPA

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- H2 in-memory database

## Getting Started

To run the project locally, follow these steps:

1. Make sure you have Java Development Kit (JDK) installed on your system.
2. Clone this repository to your local machine or download the source code.
3. Open the project in your preferred Integrated Development Environment (IDE).
4. Build the project to download the necessary dependencies.
5. Run the application.

The API endpoints can be accessed using a tool like cURL or through a web browser. Here are a few examples:

- Retrieve all products: `GET http://localhost:8080/products`
- Retrieve a specific product by name: `GET http://localhost:8080/products/{name}`

## Contributing

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
