Markdown

# 📘 Contact Manager App

A full-stack Contact Management System built with **Java Spring Boot**, **MySQL**, and **Thymeleaf**. This application allows users to register, log in, and manage their private contact list securely.

## 🚀 Features

* **User Authentication:** Secure Login and Signup with BCrypt password encryption.
* **Private Data:** Users can only see and manage their own contacts.
* **CRUD Operations:** Create, Read, Update, and Delete contacts.
* **Modern UI:** Responsive design using **Bootstrap 5** with Modal popups for editing.
* **Security:** Protected against CSRF attacks and unauthorized access.

## 🛠️ Tech Stack

* **Backend:** Java 17, Spring Boot 3 (Web, Data JPA, Security)
* **Database:** MySQL
* **Frontend:** Thymeleaf, Bootstrap 5, HTML/CSS
* **Tools:** Maven, Lombok

## ⚙️ How to Run Locally

### 1. Clone the Repo
```bash
git clone [https://github.com/YOUR_USERNAME/Contact-Manager-SpringBoot.git](https://github.com/YOUR_USERNAME/Contact-Manager-SpringBoot.git)
cd Contact-Manager-SpringBoot
2. Configure Database
Create a MySQL database named contact_db.

Open src/main/resources/application.properties.

Update your MySQL username and password:

Properties

spring.datasource.url=jdbc:mysql://localhost:3306/contact_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
3. Run the App
You can run it using your IDE (Eclipse/IntelliJ) or via command line:

Bash

mvn spring-boot:run
4. Access the App
Open your browser and go to: http://localhost:8080

📸 Screenshots
(You can upload screenshots to your repo later and link them here)

🤝 Contributing
Fork the project.

Create your feature branch (git checkout -b feature/NewFeature).

Commit your changes (git commit -m 'Add some NewFeature').

Push to the branch (git push origin feature/NewFeature).

Open a Pull Request.

Built with ❤️ by Akshay Bramhankar
