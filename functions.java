import java.util.*;
public class functions {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        return;
    }
    // calculate sum
    public static void sum(){
        int a=5;
        int b=15;
        int sum=a+b;
        System.out.println(sum);
        return;
    }
    public static int calculatesum(int num1,int num2){//parameters
        int sum=num1+num2;
        return sum;
    }
    // Factorial of a number
    public static int factorial(int a){
        
        int f=1;

        for (int i = 1; i < a; i++) {
            f=f*i;
        }
        return f;
    }
// binomal co efficient
    public static int binomalcoefficient(int n,int r){
        int nfact=factorial(n);
        int rfact=factorial(r);
        int n_minus_r_fact=factorial(n-r);
        int binomalcoefficient=nfact/(rfact*n_minus_r_fact);
        return binomalcoefficient;
    }
// prime
        public static boolean isprime(int a){
            
            for(int i=2;i<=a-1;i++){
                if (a%2==0) {
                return false;
                }
            }
            return true;
}
// primes in range
public static void primesinrange(int x){
    for (int i = 2; i <=x; i++) {
        if(isprime(i)){
        System.out.print(i+" ");
    }
    }
    System.out.println();
}

// binary to decimal
public static void bintodec(int  binnum){
    int pow=0;
    int dec=0;
    while (binnum>0) {
        int lastdig=binnum%10;
        dec=dec+(lastdig*(int)Math.pow(2, pow));
        pow++;
        binnum=binnum/10;
        
    }
    System.out.println(dec);
}

// decimal to binary
public static void dectobin(int dec){
    int pow=0;
    int bin=0;
    while (dec>0) {
        int remainder=dec%2;
        bin=bin+(remainder*(int)Math.pow(10, pow));
        pow++;
        dec=dec/2;
    }
    System.out.println(bin);
}
     public static void main(String[] args) {
        printHelloWorld(); 
        sum();
        int num1=4;
        int num2=8;
        System.out.println(calculatesum(num1, num2));//argument
        System.out.println(factorial(4));
        System.out.println(binomalcoefficient(5,2));
        System.out.println(isprime(10));
        primesinrange(10);
        bintodec(1110);
        dectobin(5);
    }
}
