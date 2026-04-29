# Sistema de Gestão Comercial (SGC)

## 📌 Descrição do Projeto

Este projeto consiste no desenvolvimento de um Sistema de Gestão Comercial (SGC) voltado para pequenos negócios.

O sistema permite o gerenciamento básico de:

* Clientes
* Produtos
* Vendas

A aplicação foi desenvolvida utilizando arquitetura em camadas, com o objetivo de organizar melhor o código e facilitar a manutenção.

---

## 🚀 Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Thymeleaf
* Maven

---

## ▶️ Como Rodar o Sistema

### 1. Clonar o repositório

git clone [https://github.com/seuusuario/sgc-sistema-comercial.git](https://github.com/ThiagoRoberto-dev/sgc-sistema-comercial.git)

---

### 2. Criar o banco de dados no MySQL

CREATE DATABASE sgc;

---

### 3. Configurar o application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/sgc
spring.datasource.username=root
spring.datasource.password=123456

---

### 4. Rodar o projeto

* Abrir no Eclipse
* Executar a classe principal (Spring Boot)

---

### 5. Acessar no navegador

http://localhost:8080

---

## 📊 Funcionalidades

* Cadastro de clientes
* Cadastro de produtos
* Registro de vendas
* Controle de estoque

---

## 🧱 Arquitetura

O sistema segue o padrão de arquitetura em camadas:

Controller → Service → Repository → Banco de Dados

---
