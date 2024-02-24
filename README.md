# spring-boot-multi-datasource
This project demonstrates a simple Spring Boot application configured with two separate databases: a primary database for write operations and a secondary database for read operations. It showcases how to configure multiple data sources, entity manager factories, and transaction managers in a Spring Boot application using JPA and Hibernate.

# Features
 * Multiple Database Configuration: Configured separate data sources for primart and secondary databases.
 * Entity Management: Utilized Spring Data JPA for managing database entities.
 * Transaction Management: Implemented transaction management to ensure data consistency.
 * RESTful API: Created RESTful endpoints for creating and retrieving user data.

# Technologies Used
 * Spring Boot
 * Spring Data JPA
 * Hibernate
 * MySQL Database
 * RESTful API

# Getting Started
 To run this application locally, follow these steps:

  1. Clone this repository to your local machine.
  2. Make sure you have MySQL installed and running.
  3. Configure your MySQL databases in the application.properties file.
  4. Build the project using Maven or Gradle.
  5. Run the application.

# Usage
Once the application is running, you can use the following endpoints to interact with the API:

 * POST /users: Create a new user by providing JSON data in the request body.
 * GET /users/{id}: Retrieve a user by their ID.
