Demonstrate a sample CRUD using Java, JPA, Spring and hexagonal architecture. 

Steps to configure development environment

Execute mysql database:
docker run -d --name mysql -e MYSQL_ROOT_PASSWORD={password}
Execute docker container ls to get container id
docker exec -it {container_id} bash
Inside container you can start mysql:
mysql -uroot -p{password}

Exceute following command to create database:
create database user;

Start spring boot app;

Request:
POST http://localhost:8080/userservice/

{
    "id": "user44444",
    "password":"testpassword"
}
