package org.example;
import java.util.*;
public class Main {
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public double division(int a,int b){
        if(b==0){
            return 1e9;
        }
        return (float)a/b;
    }

    public static void main(String[] args) {
        Main calculator = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        int choice;
        do{
            System.out.println("Choose one of the following 5 options (enter the number of the option to choose the option");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            int a,b,output;
            switch (choice){
                case 1:
                    System.out.println("Enter two number to add");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    output = calculator.add(a,b);
                    System.out.println("The addition of the numbers is: "+output);
                    break;
                case 2:
                    System.out.println("Enter two number to subtract");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    output = calculator.subtract(a,b);
                    System.out.println("The subtraction of the numbers is: "+output);
                    break;
                case 3:
                    System.out.println("Enter two number to multiply");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    output = calculator.multiply(a,b);
                    System.out.println("The multiplication of the numbers is: "+output);
                    break;
                case 4:
                    System.out.println("Enter two number to Divide");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    double out;
                    out = calculator.division(a,b);
                    if(out==1e9){
                        System.out.println("Division by Zero Error Found !!");
                    }
                    else{
                        System.out.println("The division of the numbers is: "+out);
                    }
                    break;
                case 5:
                    System.out.println("Exiting the Calculator.");
                    System.out.println("Thank You !!");
                    break;
                default:
                    System.out.println("Invalid Choice !!");

            }
            System.out.println();
        }while(choice!=5);
        sc.close();
    }
}