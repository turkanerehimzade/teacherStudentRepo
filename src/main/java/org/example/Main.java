package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Menu();
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    addTeacher(scanner);
                    break;
                case 2:
                    addStudent(scanner);
                    break;
                case 3:
                    addTeacherStudent();
                    break;
                case 4:
                    seeTeacher();
                    break;
                case 5:
                    seeStudent();
                    break;
                case 6:
//                    seeTeacherStudent();
                    controlTeacher();
                    break;
                case 7:
                    controlStudent();
                    break;
                case 8:
                    System.out.println("Sistemden chixildi...");
                    System.exit(0);
            }
        }
    }

    public static void Menu() {
        String list = "1.Create a new teacher" +
                "\n 2.Create a new student" +
                "\n 3.Create a new teacher-student relationship" +
                "\n 4.See available teachers" +
                "\n 5.See available students" +
                "\n 6.See teachers teaching a student" +
                "\n 7.See students taught by a teacher" +
                "\n 8.Shut down the system";
        System.out.println(list);
    }

    public static Teacher addTeacher(Scanner scanner) {
        System.out.println("a teacher's id:");
        Teacher.increaseIdT(1);
        System.out.println("enter a teacher's name");
        String setName = scanner.next();
        System.out.println("enter a teacher's surname");
        String setSurname = scanner.next();
        System.out.println("enter a teacher's birthdate");
        String setBirthDate = scanner.next();
        System.out.println("enter a teacher's email");
        String setEmail = scanner.next();
        System.out.println("Muellim ughurla yaradildi");
        Teacher teacher = new Teacher(setName, setSurname, setBirthDate, setEmail);
        Database.addTeacher(teacher);
        return teacher;

    }

    public static Student addStudent(Scanner scanner) {
        System.out.println(" a student's id");
        Student.increaseIdS(1);
        System.out.println("enter a student's name");
        String setName = scanner.next();
        System.out.println("enter a student's surname");
        String setSurname = scanner.next();
        System.out.println("enter a student's birthdate");
        String setBirthDate = scanner.next();
        System.out.println("enter a student's email");
        String setEmail = scanner.next();
        System.out.println("Shagird ughurla yaradildi");
        Student student = new Student( setName, setSurname, setBirthDate, setEmail);
        Database.addStudent(student);
        return student;

    }

    public static void addTeacherStudent() {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = addTeacher(scanner);
        Student student = addStudent(scanner);
        TeacherStudent teacherStudent = createTeacherStudent(scanner, teacher, student);
        Database.addTeacherStudent(teacherStudent);
        System.out.println("Muellim-shagird elaqesi ughurla yaradildi");

    }

    public static TeacherStudent createTeacherStudent(Scanner scanner, Teacher teacher, Student student) {
        System.out.println(" a teacher-student id");
        TeacherStudent.increaseIdtc(1);
        System.out.println("enter a subject");
        String setSubject = scanner.next();
        System.out.println("enter a classNumber");
        String setClassNumber = scanner.next();
        TeacherStudent teacherStudent = new TeacherStudent( teacher, student, setSubject, setClassNumber);
        return teacherStudent;
    }

    public static void seeTeacher() {
        Database.printTeacher();
    }

    public static void seeStudent() {
        Database.printStudent();
    }

//    public static void seeTeacherStudent() {
//        Database.printTeacherStudent();
//        controlTeacher();
//    }

    public static void controlTeacher() {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = addTeacher(scanner);
        Student student = addStudent(scanner);
        TeacherStudent teacherStudent = createTeacherStudent(scanner, teacher, student);
        Database.teacherList(teacherStudent);
    }
    public static void controlStudent(){
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = addTeacher(scanner);
        Student student = addStudent(scanner);
        TeacherStudent teacherStudent = createTeacherStudent(scanner, teacher, student);
        Database.studentList(teacherStudent);
    }
}