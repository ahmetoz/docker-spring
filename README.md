# Dockerized Spring Boot application running with Vaadin, Postgres DB and Mongo DB

## Instructions

### Install Docker
Follow the instructions for your OS on [this page](https://docs.docker.com/engine/installation).

### Build the application
```
mvn clean package
```

### Start the Containers
```
docker-compose build
docker-compose up
```

### Web site runs with Vaadin: : http://localhost:8080
### Persons endpoint on PostgresDB : http://localhost:8080/persons
### Customers endpoint on MongoDB : http://localhost:8080/customers

### Stop the Containers
```
docker-compose stop
```

### Update Container Image
```
docker-compose build
```

### Down the Containers
```
docker-compose down 

with volumes.

docker-compose down -v

```

### Remove the Containers
```
docker-compose rm -f
```

###List the running containers
```
docker-compose ps
```

### View a Container's logs
```
docker logs dockerspring_mongo_1
```

### Connect to a Container
```
docker exec -it dockerspring_mongo_1 bash

docker exec -it dockerspring_postgres_1 psql -U postgres

docker exec -it dockerspring_web_1 bash

```