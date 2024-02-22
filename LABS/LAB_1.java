package LABS;

import java.util.Scanner;

public class LAB_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the Second number:");
        int b=sc.nextInt();
        int Sum=a+b;
        System.out.println("The sum is "+Sum);
        System.out.println("The difference is "+(a-b));
        System.out.println("The Multiplication is "+(a*b));
        System.out.println("The division is "+(a/b));
    }
}
