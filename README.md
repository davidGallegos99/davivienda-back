# 📦 Davivienda Backend

Este es el backend del sistema de gestión de clientes y solicitudes financieras para Davivienda. Desarrollado con **Spring Boot**, utiliza una arquitectura por capas con principios inspirados en **Domain-Driven Design (DDD)** para una separación clara de responsabilidades y una mejor mantenibilidad.

## ⚙️ Tecnologías

- Java 17
- Spring Boot 3.2.4
- Spring Data JPA
- MySQL
- Hibernate
- Maven
- Swagger (OpenAPI 3)
- Lombok

## 🧱 Estructura del Proyecto

```text
com.davivienda
├── domain
│   ├── ActividadesEconomicas.java
│   ├── EstadoCivil.java
│   ├── FormaPago.java
│   ├── Persona.java
│   └── Solicitud.java
│
├── infrastructure
│   ├── controller
│   │   └── MainController.java
│   └── persistence
│       ├── ActividadesEconomicasRepository.java
│       ├── EstadoCivilRepository.java
│       ├── FormaPagoRepository.java
│       ├── PersonaRepository.java
│       └── SolicitudRepository.java
│
├── services
│   ├── PersonaService.java
│   ├── SolicitudService.java
│   └── serviceImpl
│       ├── PersonaServiceImpl.java
│       └── SolicitudServiceImpl.java
│
└── DaviviendaApplication.java
```

> 📌 **Nota**: Aunque se sigue una separación en capas (domain, infrastructure, service), no se implementa Clean Architecture estrictamente. Las entidades del dominio aún están acopladas a JPA, lo cual es una decisión pragmática en este contexto.

## 📂 Descripción de Capas

- **domain**: Define las entidades del negocio. Actualmente acopladas a JPA mediante anotaciones (`@Entity`, `@ManyToOne`, etc.).
- **infrastructure.controller**: Expone los endpoints REST de acceso al sistema.
- **infrastructure.persistence**: Contiene las interfaces de persistencia (repositorios JPA).
- **services**: Contiene la lógica de negocio principal.
  - `serviceImpl`: Implementaciones concretas de los servicios.
- **DaviviendaApplication.java**: Clase principal para levantar la aplicación Spring Boot.

## 🚀 Cómo ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/davidGallegos99/davivienda-back.git
   cd davivienda-backend
   ```

2. Configura la base de datos en `application.yml`:
   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/davivienda
       username: root
       password: tu_contraseña
   ```

3. Ejecuta la app desde IntelliJ, VS Code o consola:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Accede a la documentación Swagger:
   ```
   http://localhost:8080/swagger-ui.html
   ```

## 🧑‍💻 Autor

David Gallegos
