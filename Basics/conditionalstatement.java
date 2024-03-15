import java.util.*;
public class conditionalstatement {
    public static void main(String[] args) {
        // int a,b;
        //     a=2 ;b=4;
        //     if (a<b)
        // System.out.println("largest number is "+b);
        // else
        // System.out.println(a);
        
        Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // if(x%2==0){
        //     System.out.println(x+" is even");
        // } else{
        //     System.out.println(x+" is odd");
        // }
        
        // income tax calculator
        // int income=sc.nextInt();
        // if (income<500000){
        //     System.out.println("zoro tax");
        // }
        // else if(income>=500000 && income<=1000000){
        //     System.out.println("tax is 20%");
        // }
        // else{
        //     System.out.println("tax is 30%");
        // }

        // using ternary operator
        // int marks=sc.nextInt();
        // String status=marks>=33? "PASS":"FAIL";
        // System.out.println(status);

        // using switch
        int number=2;
        switch (number) {
            case 1:System.out.println("apple");
            break;
            case 2:System.out.println("burger");
            break;
            case 3:System.out.println("mango shake");
            break;
            default :System.out.println("we wake up");
        }
    }
}
