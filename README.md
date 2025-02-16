# Taskly Backend

Taskly is a task management system built with Spring Boot, providing essential backend services for managing tasks, teams, users, and comments.

## Tech Stack
- **Java 17**
- **Spring Boot 3.x**
- **PostgreSQL** (for database storage)
- **Spring Security with JWT** (for authentication and authorization)

## Setup Instructions

### Clone the Repository
```bash
git clone https://github.com/yourusername/taskly-backend.git
cd taskly-backend
```

### Configure Database
Edit `application.properties` or `application.yml` with your PostgreSQL settings:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskly
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Run the Application
```bash
./mvnw spring-boot:run
```

## Features
- Task creation, assignment, and status tracking
- User management with roles
- Teams and collaboration
- Commenting system for tasks
- JWT-based authentication and authorization

## TODO
- Implement Config and Security modules
- Integrate CI/CD pipeline for backend deployment

---

Stay tuned for updates and detailed documentation as the project progresses!
