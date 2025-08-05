# 📘 Student Management System (Java Console Application)

A simple Java-based console application that allows users to manage student records. You can add, view, delete, and update student details.

---

## 🚀 Features

- ➕ Add a student
- 📋 View all students
- ❌ Delete a student by ID
- ✏️ Update student details
- 🚪 Exit the application

---

## 🧱 Project Structure

- `Main.java` - Contains the main logic and menu-driven interface
- `Student.java` - Class representing the Student model with `id`, `name`, and `marks`

---

## 🛠️ Technologies Used

- Java 17+
- Scanner (for input)
- ArrayList (for storing records)

---

## 🖥️ How to Run

1. Save both `Main.java` and `Student.java` in the same folder.
2. Open terminal/command prompt and navigate to that folder.
3. Compile and run:

```bash
javac Main.java Student.java
java Main

📌 Example Menu in Console
markdown
Copy
Edit
1. Add
2. View
3. Delete
4. Update
5. Exit
Choose one option:
📂 Sample Output
yaml
Copy
Edit
Enter student ID: 1
Enter student marks: 88
Enter student name: John
Student added successfully!