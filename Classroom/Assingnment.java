package Classroom;

import java.util.Arrays;

public class Assingnment {
    static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("num1"+num1+" "+"num2"+num2);
    }
    static float productfloat(float float1,float float2){
        float product=float1*float2;
        return product;
    }
    static void evenorodd(int numerical){
        if (numerical%2==0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }  
    
    static void maxofthree(int a1,int a2,int a3){
        if (a1>a2 && a1>a3) {
            System.out.println(a1);
        }else if (a2>a1 && a2>a3) {
            System.out.println(a2);
        }else{
            System.out.println(a3);
        }
    }
    static int fact(int term){
        int fact=1;
        for (int i = 1; i <= term; i++) {
            fact*=i;
        }
        return fact;
    }
    static void reversestr(String str){
        String revString="";
        int length=str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            revString+=str.charAt(length-i);
        }
        System.out.println(revString);
    }
    static int minnum(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static void reverse(int num) {

        System.out.print("revese of number is ");
        while (num > 0) {
            int lastdig = num % 10;
            System.out.print(lastdig);
            num = num / 10;
        }
        System.out.println();
    }

    static void addtwostrings(String string_1, String string_2) {
        String addsString = string_1 + " " + string_2;
        System.out.println("The addition of two strings is " + addsString);
    }

    static void fibseries(int number) {
        int n1 = 0, n2 = 1, n3;
        System.out.print("Fib series is " + n1 + " " + n2 + " ");
        for (int i = 2; i < number; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    static int avgofarr(int arrr[]) {
        int sum = 0;
        int l = arrr.length;
        for (int i = 0; i < arrr.length; i++) {
            System.out.print(arrr[i] + " ");
            sum = sum + arrr[i];
        }
        System.out.println();
        System.out.println("Sum is " + sum);
        int avg = sum / l;
        System.out.println("AVG is " + avg);
        return avg;
    }

    static void addoftwomatrices(int matr1[][], int matr2[][]) {
        int summatr[][] = new int[matr2.length][matr2[0].length];
        if (matr1.length == matr2.length) {
            for (int i = 0; i < matr2.length; i++) {
                for (int j = 0; j < matr2[0].length; j++) {
                    summatr[i][j] = matr1[i][j] + matr2[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(summatr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("min value is" + minnum(arr));
        // numerical right angle traingle
        System.out.println("numerical right angle traingle");
        for (int i = 0; i <= 5; i++) {
            int x = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
        // flyoyd's traingle
        System.out.println("flyoyd's traingle");
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        // left right angled traingle
        System.out.println("left right angled traingle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) System.out.print("* ");
            System.out.println();
        }System.out.println("");
        reverse(123);
        addtwostrings("Hello", "World");
        fibseries(10);
        int arrr[] = { 1, 3, 5, 7, 9 };
        avgofarr(arrr);
        int matr1[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        int matr2[][] = { { 3, 3, 1 }, { 5, 3, 7 }, { 1, 4, 8 } };
        addoftwomatrices(matr1, matr2);
        swap(85, 56);
        System.out.println(productfloat(2.5f, 8.5f));
        evenorodd(20);
        maxofthree(2, 4, 8);
        System.out.println(fact(5));
        String str="racecar";
        reversestr(str);;
    }
}