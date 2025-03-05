# Ecommerce System

## 🚀 Overview
A modern **eCommerce system** built with **Spring Boot 3.2.2** that provides secure user authentication, product management, and order processing.

## 🔥 Features
- 🛒 Product catalog with CRUD operations
- 🔐 User authentication & authorization (Spring Security)
- 💳 Order processing & checkout
- 📊 Admin dashboard for management
- 📦 Database support: **PostgreSQL / H2 (for dev)**

## 🛠 Tech Stack
- **Backend:** Spring Boot, Spring Security, JPA, Hibernate
- **Frontend:** Thymeleaf, HTML/CSS
- **Database:** PostgreSQL / H2 (for development)
- **Build Tool:** Maven

## 📦 Installation

### 1️⃣ Clone the Repository
```sh
 git clone https://github.com/yourusername/ecommerce-system.git
 cd ecommerce-system
```

### 2️⃣ Configure Database
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3️⃣ Run the Application
```sh
mvn clean install
mvn spring-boot:run
```

## 🚀 API Endpoints
| Method | Endpoint            | Description         |
|--------|---------------------|---------------------|
| GET    | `/products`         | List all products  |
| POST   | `/products`         | Add a new product  |
| GET    | `/orders`           | View orders        |
| POST   | `/auth/register`    | Register a user    |
| POST   | `/auth/login`       | User login         |

## 📜 License
This project is licensed under the **MIT License**.

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repository and submit pull requests.

---
🚀 **Happy Coding!** 😃

