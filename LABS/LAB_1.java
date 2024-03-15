package LABS;

import java.util.*;

public class LAB_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the Second number:");
        int b=sc.nextInt();
        int Sum=a+b;
        System.out.println("The sum is "+Sum);
        System.out.println("The difference is "+(a-b));
        System.out.println("The Multiplication is "+(a*b));
        System.out.println("The division is "+(a/b));
        //check the number is positve or negative
        int X=sc.nextInt();
        if (X>0) System.out.println("X is positive");
        else if (X<0) System.out.println("X is negative");
        else System.out.println("X is zero");

        // Factorial of a number
        int x=sc.nextInt();
        int a=1;
        for (int i = 1; i <=x; i++) {
            a=a*i;
        }
        System.out.println(a);
        sc.close();

        //HCF
        int a,b=sc.nextInt();
        int b=sc.nextInt();
        int HCF=0;
        for (int i = 1; i <= a || i<=b; i++) {
            if (a%i==0 && b%i==0) {
                HCF=i;
            }
        }
        System.out.println(HCF);

        // check wether four numbers are equal
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if (a==b && b==c && c==d) {
            System.out.println("All are equal");
        }else{
            System.out.println("Not equal");
        }
    }
}