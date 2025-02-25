# Chat Application

## Overview

This is a real-time chat application that enables seamless communication between users. It is built using a microservices architecture with a Spring Boot backend and an Angular frontend. The project supports WebSocket-based messaging, secure authentication using Keycloak, and database management with PostgreSQL. The entire application is containerized with Docker and orchestrated using Docker Compose.

## Features

- Real-time messaging via WebSockets
- Secure user authentication and authorization with Keycloak
- RESTful API with Spring Boot and Spring Data JPA
- Database migrations using Flyway
- Containerized deployment with Docker and Docker Compose
- Responsive user interface built with Angular 19

## Technologies Used

### Backend

- Java 17
- Spring Boot
- Spring WebSocket
- Spring Security (OAuth2 Client)
- Spring Data JPA
- Flyway
- PostgreSQL
- Maven
- Docker
- Keycloak

### Frontend

- Angular 19
- TypeScript
- Angular Material
- WebSockets
- RxJS

## API Documentation
The backend exposes RESTful APIs, and you can explore them using Swagger: http://localhost:8080/swagger-ui.html

## License
This project is licensed under the MIT License. See the [LICENSE](https://github.com/zohidjonyuldashev/chat-app/blob/master/LICENSE) file for details.
