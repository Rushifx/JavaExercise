package MovieDiscount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the cinema! What is your age?");
        age = scanner.nextInt();                                                      //prompts user for input for age

        if (age >= 5 && age <= 60) {                                                  //if age is more than 5 and less than 60
            System.out.println("Your ticket costs 7 euros");
        } else if (age < 5) {                                                         //if age is less than 5
            System.out.println("You get a 60% discount on your ticket");
        } else if (age > 60) {                                                        //if age is more than 60
            System.out.println("You get a 55% discount on your ticket");
        } else {
            System.out.println("Invalid");
        }
    }
}
