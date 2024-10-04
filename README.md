Demonstrate a sample CRUD using Java, JPA, Spring and hexagonal architecture. 

Steps to configure development environment

Execute mysql database:

create database user;

Start spring boot app;

Request:
POST http://localhost:8080/userservice/

{
    "id": "user44444",
    "password":"testpassword"
}
