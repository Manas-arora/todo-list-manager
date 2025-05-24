# To-Do List Manager (Java + JDBC)

## 📌 Introduction
The **To-Do List Manager** is a simple console-based application designed to help users organize and track their daily tasks. This project demonstrates how Java can interact with a MySQL database using **JDBC**, offering hands-on experience with basic **CRUD operations** and **database connectivity**.

---

## 🎯 Objective
The primary goal of this project is to:
- Showcase Java's ability to connect and interact with a MySQL database via JDBC.
- Practice essential programming concepts such as input handling, query execution, and result processing.
- Build a functional task manager that supports adding, viewing, updating, and deleting tasks.

---

## 🗃️ Database Schema

**Table Name:** `tasks`

| Column      | Type         | Description                      |
|-------------|--------------|----------------------------------|
| `id`        | INT          | Auto Increment, Primary Key      |
| `title`     | VARCHAR(100) | Title of the task                |
| `description` | TEXT       | Detailed description of the task |
| `due_date`  | DATE         | Task due date                    |
| `status`    | VARCHAR(10)  | Task status (default: `pending`) |

---

## ✅ Key Functionalities
- ➕ Add a new task
- 📋 Display list of all tasks
- ✏️ Update task status
- ❌ Delete a task
- 🔍 Filter tasks by status (`pending`, `completed`, etc.)

---

## ⚙️ Implementation Overview
- Built in **Java** using **JDBC** for database interaction.
- **MySQL** database used for persistent task storage.
- Console-based interaction (simple input/output via terminal or IDE).
- SQL queries implemented for all CRUD functionalities.

---

## 🚀 How to Run
1. Make sure you have **Java**, **MySQL**, and **JDBC driver** set up.
2. Create the database and table using the schema above.
3. Update your database connection details in the Java file:
   ```java
   String url = "jdbc:mysql://localhost:3306/your_db_name";
   String username = "your_username";
   String password = "your_password";
