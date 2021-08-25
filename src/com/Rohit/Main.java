package com.Rohit;
import java.util.Scanner;
class Atm{
    Scanner sc = new Scanner(System.in);
    int pin;
    void add(){
        System.out.println("please enter your card");
        System.out.println("please enter your pin");
        pin= sc.nextInt();
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = 1000;
        Atm a1 = new Atm();
        a1.add();
        System.out.println("please enter your choice");
        System.out.println("1. With drawl");
        System.out.println("2.balance enquiry");
        System.out.println("3.change pin");
        int choice = sc.nextInt();
        switch  (choice){
            case 1:
                System.out.println("please enter the amount");
                int sum = sc.nextInt();
                if (sum<=1000) {
                    int total = data - sum;
                    System.out.println("Amount " + sum + " is debited from your account");
                    System.out.println("remaining balance is " + total);
                    break;
                }
                else
                    System.out.println("you entered amount is invalid / not fount in your account");
                break;
            case 2:
                System.out.println("the remaining balance is "+data);
                break;
            case 3:
                System.out.println("please enter your old pin");
                int fer = sc.nextInt();
                if ( fer == a1.pin){
                System.out.println("please change your pin");
                int var = sc.nextInt();
                System.out.println("your pin is changed successfully");
                System.out.println("your new pin is " + var);
                break;
            }
else
                System.out.println("you entered wrong pin");
            break;


        }
        System.out.println("thank you for using Atm please visit again");

    }
}
