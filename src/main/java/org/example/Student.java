package org.example;

public class Student {
    private static long id;
    private  String name;
    private  String surname;
    private  String birthDate;
    private  String email;

    public Student (String name,String surname,String birthday,String email){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.birthDate=birthday;
        this.email=email;
        System.out.println(id+" "+name+" "+surname+" "+birthday+" "+email);}
    public static void increaseIdS(int a){
        id+=a;
        System.out.println(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
