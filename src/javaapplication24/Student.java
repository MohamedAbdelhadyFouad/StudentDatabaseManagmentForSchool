/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

    //  Decleare  variables 
    private String FirstName;
    private String FamilyName;
    private int YearOfStudent;
    private String StudentID;
    private String Courses = "";
    private static int CourseCost = 600;
    private double tuitionBalance = 0.0;
    public static int id = 1000;
    public static int studentNo= 0;

    // Constractor to take sudent's name and year.
    public Student() {
        studentNo ++;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student First name :  ");
        this.FirstName = sc.nextLine();
        System.out.print("Enter studnet Family name: ");
        this.FamilyName = sc.nextLine();
        System.out.print(" 1 - First Year \n 2 - Second Year \n 3 - Third Year \n 4 - Fourth Year \n Enter student class level: ");
        this.YearOfStudent = sc.nextInt();
        this.id += 1;
        GenerateID();
        //System.out.println(FirstName + " " + FamilyName + " " + YearOfStudent + " " + StudentID);
        enroll();
        showBalance();
        payTuition();

    }

    //Generate ID
    private void GenerateID() {
        // Grade level + ID   
        this.StudentID = YearOfStudent + "" + id;
    }

    //Rejister Subjects 
    private void enroll() {

        do {
            System.out.print("Enter course to Enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);

            String course = sc.nextLine();

            if (!course.equals("Q")) {
                Courses += "\n" + course;
                tuitionBalance += CourseCost;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("ENROLLED IN: " + Courses);

    }

    //View Balance
    private void showBalance() {
        System.out.println("YOUR BALANCE IS : $" + tuitionBalance);
    }
    //Show Tuition

    private void payTuition() {
        Scanner sc = new Scanner(System.in);
        System.out.print("HOW MUCH YOU WOULD YOU LIKE TO PAY: $");
        double payment = sc.nextDouble();
        tuitionBalance = tuitionBalance - payment;
        if ((tuitionBalance) == 0.0) {
            System.out.println("THANK YOU !!\nYOU ARE SUCCESSFULLY PAID ALL FEES");
        } else {
            System.out.println("THANK You!! YOU HAVE DONE  " + payment + " $ OF THE TOTAL FEES." + "\n THE REMAIN IS : " + tuitionBalance + "$");
        }

    }
    //Show status 

    @Override
    public String toString() {
        return "Student{"+studentNo+"}"+ "\n FirstName: " + FirstName + "\n FamilyName: " + FamilyName + "\n YearOfStudent: " + YearOfStudent + "\n StudentID: " 
                + StudentID + "\n Courses : " + Courses + "\n tuitionBalance: " + tuitionBalance ;
    }
    
}


