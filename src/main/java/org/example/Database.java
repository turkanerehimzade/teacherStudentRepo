package org.example;

import java.util.Scanner;

public class Database {
    private  static Teacher[] teachers=new Teacher[5];
    private static Student[] students=new Student[5];
    private static TeacherStudent[] teacherStudents=new TeacherStudent[5];
    private static int lastIndex=0;
    private static int studentLastIndex=0;
    private static int TeacherLastIndex=0;

    public static void addTeacher(Teacher teacher){
            teachers[TeacherLastIndex++]=teacher;
    }
    public static void printTeacher(){
        for(Teacher teacher:teachers){
            if(teacher!=null){
                System.out.println(teacher.getName()+"-"+teacher.getSurname());
            }
        }
    }
    public static void addStudent(Student student){
        students[studentLastIndex++]=student;
    }

    public static void printStudent() {
        for(Student student:students){
            if(student!=null){
                System.out.println(student.getName()+"-"+student.getSurname());
            }
        }
    }
    public static void addTeacherStudent(TeacherStudent teacherStudent){
        teacherStudents[lastIndex++]=teacherStudent;
    }
    public static void printTeacherStudent(){
        for(TeacherStudent teacherStudent:teacherStudents){
            if(teacherStudent!=null){
                System.out.println("Muellim: "+teacherStudent.getTeacher().getName()+"\n Shagird: "+teacherStudent.getStudent().getName());
            }

        }
    }
    public static void teacherList(TeacherStudent teacherStudent){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Shagirdin adini daxil edin;");
        String studentnm= scanner.next();
        String b=teacherStudent.getStudent().getName();
        if(studentnm.equals(b)){
            System.out.println("Bu shagirde ders kechen muellimler:");
            System.out.println(teacherStudent.getTeacher().getName()+" muellim");
        }else{
            System.out.println("Bu ada sahib shagirde hech bir muellim ders kechmir");
        }
    }
    public static void studentList(TeacherStudent teacherStudent){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Muellimin adini daxil edin;");
        String teachernm= scanner.next();
        String c=teacherStudent.getTeacher().getName();
        if(teachernm.equals(c)){
            System.out.println("bu muellimin ders kechdiyi shagirdler:");
            System.out.println(teacherStudent.getStudent().getName()+" adli shagird");
        }else{
            System.out.println("Bu ada sahib muellim hech bir shagirde ders kechmir");
        }
    }
}
