package org.example;

import java.util.Scanner;

public class TeacherStudent {
    private static long id;
    private Teacher teacher;
    private Student student;
    private String subject;
    private String classNumber;


    public TeacherStudent( Teacher teacher, Student student, String setSubject, String setClassNumber) {
        this.teacher=teacher;
        this.student=student;
        this.subject=setSubject;
        this.classNumber=setClassNumber;
        System.out.println(teacher.getName()+" muellim, "+student.getName()+" adli shagirdine "+setClassNumber+"ci sinif "+setSubject+" uzre ders verir ");
    }

    public TeacherStudent() {

    }


    public static void increaseIdtc(int a){
        id+=a;
        System.out.println(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
}
