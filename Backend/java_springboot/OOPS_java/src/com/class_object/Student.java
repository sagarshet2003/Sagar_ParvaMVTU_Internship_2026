package com.class_object;

import java.util.Scanner;

public class Student {
    String stud_name;
    int usn;
    String address;

    public String isStudying() {
        return "Yes he is studying";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        Student stud = new Student();

        System.out.println("Enter student 1 name:");
        stud.stud_name = sc.nextLine();

        System.out.println("Enter student 1 USN:");
        stud.usn = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter student 1 Address:");
        stud.address = sc.nextLine();

        System.out.println("student 1 details");
        System.out.println("name: " + stud.stud_name);
        System.out.println("USN: " + stud.usn);
        System.out.println("address: " + stud.address);
        System.out.println(stud.isStudying());



       
        Student stud1 = new Student();

        System.out.println("Enter student 2 name:");
        stud1.stud_name = sc.nextLine();

        System.out.println("Enter student 2 USN:");
        stud1.usn = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter student 2 address:");
        stud1.address = sc.nextLine();

        System.out.println("student 2 details ");
        System.out.println("Name: " + stud1.stud_name);
        System.out.println("USN: " + stud1.usn);
        System.out.println("Address: " + stud1.address);
        System.out.println(stud1.isStudying());

        sc.close();
    }
}