package com.rajni.course_two;

public class Student {
    private String name;
    private int rollNo;
    private double cgpa;

    public Student(int rollNo, String name, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        Student student = new Student(1256, "Rajni", 8.8);
        System.out.println(student.findPercentage());
    }

    public double findPercentage() {
        return (cgpa /10.0) * 100.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
