Demonstrate a sample CRUD using Java, JPA, Spring and hexagonal architecture. 

Steps to configure development environment

Execute mysql database:<br />
docker run -d --name mysql -e MYSQL_ROOT_PASSWORD={password} {container_id}<br />
Execute docker container ls to get container id<br />
docker exec -it {container_id} bash<br />
Inside container you can start mysql:<br />
mysql -uroot -p{password}<br />

Exceute following command to create database:<br />
create database user;<br />

Start spring boot app;<br />

Request:<br />
POST http://localhost:8080/userservice/<br />

{<br />
    "id": "user44444",<br />
    "password":"testpassword"<br />
}<br />
