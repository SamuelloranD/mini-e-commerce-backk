# 🛒 Mini E-Commerce - Backend

## 📋 Sobre
API REST para um sistema de e-commerce, desenvolvida com **Spring Boot** e **Java**. O projeto utiliza o framework Spring Boot 4.0 (presumido) e Java 21 (presumido) para fornecer uma API robusta de gerenciamento de produtos.

## 🚀 Como Rodar

### 1. Pré-requisitos
Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente:
*   **Java 21**
*   **PostgreSQL**
*   **Maven**

### 2. Configurar Banco de Dados
Crie o banco de dados `bancoangular` no seu servidor PostgreSQL:

```sql
CREATE DATABASE bancoangular;
```

### 3. Configurar Credenciais
Crie o arquivo de propriedades específico para o ambiente de desenvolvimento: `src/main/resources/application-dev.properties` e insira as credenciais de acesso ao seu banco de dados.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/bancoangular
spring.datasource.username=postgres
spring.datasource.password=sua_senha_aqui
spring.datasource.driver-class-name=org.postgresql.Driver
```

### 4. Executar
Execute a aplicação utilizando o Maven:

```bash
mvn spring-boot:run
```

A API estará rodando e acessível em: `http://localhost:8080`

## 📡 Endpoints

O `ProdutoController` gerencia a entidade `Produto` sob o caminho base `/produtos`.

### Produtos

| Método HTTP | URI | Descrição |
| :--- | :--- | :--- |
| **POST** | `/produtos` | Criar produto |
| **GET** | `/produtos` | Listar todos os produtos |
| **GET** | `/produtos/{id}` | Buscar produto por ID |
| **PUT** | `/produtos/{id}` | Atualizar produto |
| **DELETE** | `/produtos/{id}` | Excluir produto |

## 📦 Exemplo de Uso

### Criar produto:

```bash
curl -X POST http://localhost:8080/produtos \
  -H "Content-Type: application/json" \
  -d '{"nome": "Notebook", "preco": 3500.00}'
```

### Listar produtos:

```bash
curl -X GET http://localhost:8080/produtos
```

## 🔧 Estrutura
A estrutura de diretórios do projeto segue o padrão Spring Boot para organização de código:

```text
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── controller/  # ProdutoController (Camada de API)
│   │   ├── service/     # Lógica de Negócio (ProdutoService)
│   │   ├── repository/  # Acesso a Dados (Spring Data JPA)
│   │   ├── model/       # Entidades de Domínio (Produto)
│   │   └── dto/         # Objetos de Transferência de Dados (CriarProdutoDTO)
│   └── resources/
│       └── application.properties (ou application-dev.properties)
└── test/
```

## 🛠 Tecnologias
*   Java 21
*   Spring Boot 4.0.0
*   PostgreSQL
*   Hibernate
*   Lombok
*   Maven

## 👨‍💻 Autor

Samuel Lorand

GitHub: https://github.com/SamuelloranD

LinkedIn: https://www.linkedin.com/in/samuellorand/
