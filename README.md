# Pizzaria API

Este projeto é uma API RESTful desenvolvida com Spring Boot para gerenciar uma pizzaria. Ele permite operações CRUD para entidades como Clientes, Pedidos, Pizzas e Bebidas.

## Tecnologias Utilizadas

- **Spring Boot**: Facilita a criação de aplicações stand-alone baseadas em Spring com mínima configuração.
- **Spring Data JPA**: Proporciona uma maneira simplificada de implementar camadas de acesso a dados.
- **Hibernate**: Framework de mapeamento objeto-relacional que facilita o mapeamento de atributos entre a aplicação Java e o banco de dados.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional para armazenamento e recuperação de dados.

## Funcionalidades

- **Gestão de Clientes**: Cadastrar, atualizar, listar e remover clientes.
- **Gestão de Pedidos**: Criar pedidos associando-os a clientes e adicionando pizzas e bebidas.
- **Gestão de Cardápio**: Manter um catálogo atualizado de pizzas e bebidas disponíveis.
- **Interface API RESTful**: Facilitar a interação programática com o sistema, permitindo integrações e expansões futuras.

## Como Executar

### Pré-requisitos

- Java JDK 11 ou superior.
- Maven 3.6 ou superior.
- MySQL Server 5.7 ou superior.

### Passos para Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/Bianca-Leal/api-pizzaria-soulcode.git
2. Entre no diretório do projeto:
   ```bash
   cd api-pizzaria-soulcode
3. Configure o banco de dados MySQL:
   ```bash
   - Acesse o MySQL através do seu terminal ou de uma interface gráfica como o MySQL Workbench.
   - Execute o seguinte comando SQL para criar uma nova base de dados:
     ```sql
     CREATE DATABASE pizzaria;```
4. Execute o projeto usando Maven:
    ```bash
   mvn spring-boot:run

## Autores

- [Bianca Leal](https://www.linkedin.com/in/bianca-leall/)