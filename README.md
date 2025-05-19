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