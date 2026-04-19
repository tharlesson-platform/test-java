# TaskFlow Pro API

## Descrição
TaskFlow Pro é uma aplicação backend completa para gestão de tarefas corporativas, projetos, times e fluxo de aprovação. Implementa autenticação JWT, controle de acesso por perfis, CRUD para organizações, times, projetos e tarefas, além de um dashboard e consultas avançadas.

## Tecnologias Utilizadas
- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- PostgreSQL
- Flyway
- Docker
- Testcontainers
- JUnit 5
- Mockito
- Lombok
- OpenAPI/Swagger

## Estrutura do Projeto
```
taskflow-pro-api/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── taskflowpro/
│   │   │           └── api/
│   │   │               ├── TaskFlowProApiApplication.java
│   │   │               ├── config/
│   │   │               │   └── SecurityConfig.java
│   │   │               ├── controller/
│   │   │               │   ├── AuthController.java
│   │   │               │   └── OrganizationController.java
│   │   │               ├── dto/
│   │   │               │   ├── OrganizationDto.java
│   │   │               │   └── UserDto.java
│   │   │               ├── entity/
│   │   │               │   ├── Organization.java
│   │   │               │   └── User.java
│   │   │               ├── repository/
│   │   │               │   ├── OrganizationRepository.java
│   │   │               │   └── UserRepository.java
│   │   │               ├── security/
│   │   │               │   └── JwtTokenProvider.java
│   │   │               ├── service/
│   │   │               │   ├── OrganizationService.java
│   │   │               │   └── UserService.java
│   │   └── resources/
│   │       ├── application.yml
│   │       └── db/
│   │           └── migration/
│   │               └── V1__Initial_schema.sql
├── docker-compose.yml
└── Dockerfile
```

## Execução Local
### Pré-requisitos
- Java 21
- Docker

### Passos
1. Clone o repositório.
2. Navegue até o diretório raiz do projeto.
3. Execute `docker-compose up -d` para iniciar a aplicação e o banco de dados PostgreSQL em contêineres.
4. Acesse a documentação da API via Swagger: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## Endpoints Principais
- **Autenticação:**
  - `POST /api/auth/register` (Cadastro de usuário)
  - `POST /api/auth/login` (Login)

- **Organizações:**
  - `GET /api/organizations`
  - `POST /api/organizations`
  - `PUT /api/organizations/{id}`
  - `DELETE /api/organizations/{id}`

## Contribuições
Pull requests são bem-vindos. Para mudanças significativas, por favor, abra uma issue primeiro para discutir o que você gostaria de alterar.

## Licença
[MIT](LICENSE)
