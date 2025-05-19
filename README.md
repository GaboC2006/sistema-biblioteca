# Sistema de Gestión de Biblioteca

## Descripción
Sistema de gestión de biblioteca desarrollado con Spring Boot que permite administrar libros, usuarios y préstamos.

## Características
- Gestión de libros (CRUD)
- Gestión de usuarios (CRUD)
- Sistema de préstamos con las siguientes reglas:
  - Duración predeterminada de 14 días
  - Control automático de disponibilidad de libros
  - Actualización automática del estado del libro al realizar/devolver préstamos

## Tecnologías Utilizadas
- Java 17
- Spring Boot 3.1.5
- Spring Data JPA
- H2 Database
- Lombok
- SpringDoc OpenAPI (Swagger)

## Configuración del Proyecto
1. Requisitos previos:
   - Java 17
   - Maven

2. Clonar el repositorio:
```bash
git clone [URL_DEL_REPOSITORIO]
```
## Ejecutar el proyecto:
```
mvn spring-boot:run
```
## Endpoints API
El sistema expone los siguientes endpoints:

### Libros (/api/books)
- GET /api/books : Obtener todos los libros
- GET /api/books/{id} : Obtener libro por ID
- POST /api/books : Crear nuevo libro
- PUT /api/books/{id} : Actualizar libro
- DELETE /api/books/{id} : Eliminar libro
### Usuarios (/api/users)
- GET /api/users : Obtener todos los usuarios
- GET /api/users/{id} : Obtener usuario por ID
- POST /api/users : Crear nuevo usuario
- PUT /api/users/{id} : Actualizar usuario
- DELETE /api/users/{id} : Eliminar usuario
### Préstamos (/api/loans)
- GET /api/loans : Obtener todos los préstamos
- GET /api/loans/{id} : Obtener préstamo por ID
- POST /api/loans : Crear nuevo préstamo
- PUT /api/loans/{id} : Actualizar préstamo
- DELETE /api/loans/{id} : Eliminar préstamo (devolver libro)
## Documentación API
La documentación completa de la API está disponible en:

- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/api-docs
## Base de Datos
El proyecto utiliza H2 como base de datos en memoria. La consola de H2 está disponible en:

- URL: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:librarydb
- Usuario: sa
- Contraseña: [vacío]
