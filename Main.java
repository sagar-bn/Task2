package task2;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> studentRecord = new ArrayList<>();
    int options;
    while (true) {
      System.out.println("1.add");
      System.out.println("2.view ");
      System.out.println("3.delete");
      System.out.println("4.Update");
      System.out.println("5.exit");
      System.out.println("choose one option: ");
      options = sc.nextInt();
      switch (options) {
        case 1 -> addStudent(studentRecord, sc);
        case 2 -> viewStudents(studentRecord);
        case 3 -> deleteStudent(studentRecord, sc);
        case 4 -> updateStudent(studentRecord, sc);
        case 5 -> System.exit(0);
        default -> System.out
            .println("Invalid option. Please choose again.");

      }
    }
  }

  public static void addStudent(ArrayList<Student> studentRecord, Scanner sc) {
    System.out.print("Enter student ID: ");
    int Id = sc.nextInt();
    System.out.print("Enter student marks: ");
    int marks = sc.nextInt();
    System.out.print("Enter student name: ");
    String name = sc.next();
    Student student = new Student(Id, marks, name);
    studentRecord.add(student);
    System.out.println("Student added successfully!");
  }

  public static void viewStudents(ArrayList<Student> studentRecord) {
    if (studentRecord.isEmpty()) {
      System.out.println("record is empty");
    } else {
      for (Student student : studentRecord) {
        System.out.println(student);
      }
    }
  }

  public static void deleteStudent(ArrayList<Student> studentRecord, Scanner sc) {
    if (studentRecord.isEmpty()) {
      System.out.println("record is empty");
    } else {
      System.out.println("enter the student id to be deleted");
      int idToDelete = sc.nextInt();
      for (Student student : studentRecord) {
        if (student.getId() == idToDelete) {
          studentRecord.remove(student);
          System.out.println("deleted successfully!");
          return;
        }
        System.out.println("Not Found the in record");
      }
    }

  }

  public static void updateStudent(ArrayList<Student> studentRecord, Scanner sc) {
    System.out.println("Enter the student id to update");
    int Id = sc.nextInt();
    if (studentRecord.isEmpty()) {
      System.out.println("No students present in record!");
    } else {
      for (Student student : studentRecord) {
        if (student.getId() == Id) {
          System.out.print("Enter new marks: ");
          int marks = sc.nextInt();
          sc.nextLine();
          System.out.print("Enter new name: ");
          String name = sc.nextLine();

          student.setMarks(marks);
          student.setName(name);
        } else {
          System.out.println("Not found");
        }
      }

    }

  }

}
