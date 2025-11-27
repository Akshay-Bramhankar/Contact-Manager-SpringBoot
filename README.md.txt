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

spring.datasource.url=jdbc:mysql://localhost:3306/contact_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

This is the final step to make your project shareable and professional. Since you want this to be "usable by all," a good GitHub repository needs two things:

Clean Code: Excluding junk files (like compiled code).

A Good README: Explaining how to run it.

Here is your step-by-step guide.

Part 1: Prepare the Project (The .gitignore)
Before you push anything, you must tell Git what to ignore. You do not want to upload compiled files (.class, .jar) or IDE settings.

Go to your project folder.

Check if you have a file named .gitignore.

If not, create a file named .gitignore (no extension) and paste this content:

Plaintext

/target/
!.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
*.class

# Eclipse
.classpath
.project
.settings/

# IntelliJ
.idea/
*.iml

# OS junk
.DS_Store
Thumbs.db
Part 2: Push to GitHub (The Commands)
Open your Terminal (Mac/Linux) or Git Bash / Cmd (Windows) inside your project folder.

1. Initialize Git

Bash

git init
2. Add all files

Bash

git add .
3. Commit the code

Bash

git commit -m "Initial commit - Complete Contact Manager App"
4. Go to GitHub.com

Log in and click the + icon (top right) -> New Repository.

Name it: Contact-Manager-SpringBoot.

Do not check "Add README" or "Add .gitignore" (we already have them).

Click Create repository.

5. Connect and Push Copy the commands GitHub shows you under "…or push an existing repository from the command line" and run them. They usually look like this:

Bash

git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/Contact-Manager-SpringBoot.git
git push -u origin main
(Replace YOUR_USERNAME with your actual GitHub username).

Part 3: The Professional README Content
A project is useless if people don't know how to run it. Create a file named README.md in your project folder, paste the code below, and then push it again (git add ., git commit -m "added readme", git push).

Copy everything below this line:

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
mvn spring-boot:run

This is the final step to make your project shareable and professional. Since you want this to be "usable by all," a good GitHub repository needs two things:

Clean Code: Excluding junk files (like compiled code).

A Good README: Explaining how to run it.

Here is your step-by-step guide.

Part 1: Prepare the Project (The .gitignore)
Before you push anything, you must tell Git what to ignore. You do not want to upload compiled files (.class, .jar) or IDE settings.

Go to your project folder.

Check if you have a file named .gitignore.

If not, create a file named .gitignore (no extension) and paste this content:

Plaintext

/target/
!.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
*.class

# Eclipse
.classpath
.project
.settings/

# IntelliJ
.idea/
*.iml

# OS junk
.DS_Store
Thumbs.db
Part 2: Push to GitHub (The Commands)
Open your Terminal (Mac/Linux) or Git Bash / Cmd (Windows) inside your project folder.

1. Initialize Git

Bash

git init
2. Add all files

Bash

git add .
3. Commit the code

Bash

git commit -m "Initial commit - Complete Contact Manager App"
4. Go to GitHub.com

Log in and click the + icon (top right) -> New Repository.

Name it: Contact-Manager-SpringBoot.

Do not check "Add README" or "Add .gitignore" (we already have them).

Click Create repository.

5. Connect and Push Copy the commands GitHub shows you under "…or push an existing repository from the command line" and run them. They usually look like this:

Bash

git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/Contact-Manager-SpringBoot.git
git push -u origin main
(Replace YOUR_USERNAME with your actual GitHub username).

Part 3: The Professional README Content
A project is useless if people don't know how to run it. Create a file named README.md in your project folder, paste the code below, and then push it again (git add ., git commit -m "added readme", git push).

Copy everything below this line:

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
mvn spring-boot:run

4. Access the App
Open your browser and go to: http://localhost:8080

📸 Screenshots

This is the final step to make your project shareable and professional. Since you want this to be "usable by all," a good GitHub repository needs two things:

Clean Code: Excluding junk files (like compiled code).

A Good README: Explaining how to run it.

Here is your step-by-step guide.

Part 1: Prepare the Project (The .gitignore)
Before you push anything, you must tell Git what to ignore. You do not want to upload compiled files (.class, .jar) or IDE settings.

Go to your project folder.

Check if you have a file named .gitignore.

If not, create a file named .gitignore (no extension) and paste this content:

Plaintext

/target/
!.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
*.class

# Eclipse
.classpath
.project
.settings/

# IntelliJ
.idea/
*.iml

# OS junk
.DS_Store
Thumbs.db
Part 2: Push to GitHub (The Commands)
Open your Terminal (Mac/Linux) or Git Bash / Cmd (Windows) inside your project folder.

1. Initialize Git

Bash

git init
2. Add all files

Bash

git add .
3. Commit the code

Bash

git commit -m "Initial commit - Complete Contact Manager App"
4. Go to GitHub.com

Log in and click the + icon (top right) -> New Repository.

Name it: Contact-Manager-SpringBoot.

Do not check "Add README" or "Add .gitignore" (we already have them).

Click Create repository.

5. Connect and Push Copy the commands GitHub shows you under "…or push an existing repository from the command line" and run them. They usually look like this:

Bash

git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/Contact-Manager-SpringBoot.git
git push -u origin main
(Replace YOUR_USERNAME with your actual GitHub username).

Part 3: The Professional README Content
A project is useless if people don't know how to run it. Create a file named README.md in your project folder, paste the code below, and then push it again (git add ., git commit -m "added readme", git push).

Copy everything below this line:

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

Built with ❤️ by [Akshay Bramhankar]


