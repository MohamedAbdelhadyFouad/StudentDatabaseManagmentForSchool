package javaapplication24;

import java.util.Scanner;

public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ask the user how many students to add

        Scanner sc = new Scanner(System.in);
        System.out.print("How MANY STUDENT YOU WOULD LIKE TO ADD: ");
        int numberOfStudents = sc.nextInt();

        //Creat a number of a new students 
        Student StDb[] = new Student[numberOfStudents];
        for (int i = 0; i <= StDb.length-1; i++) {
            System.out.println("Enter data for student Number  " + (i+1));

            StDb[i] = new Student();

        }
    }
}
