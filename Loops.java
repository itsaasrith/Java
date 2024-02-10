import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int range =sc.nextInt();
        // int counter=1;
        // while (counter<=range) {
        //     System.out.println(counter+" ");
        //     counter++;
        // }
        // System.out.println();

        // int n= sc.nextInt();
        // int i=1;
        // int sum=0;
        // while (i<=n) {
        //     sum=sum+i;
        //     i++;
        // }
        // System.out.println("sum is "+sum);
        // for(int i=1;i<=10;i++){
        //     System.out.println("Hello World");
        // }
        // for (int i=1;i<=4;i++){
        //     System.out.println("****");
        // }  
        

        
            // print reverse of a number
            // int n=sc.nextInt();
            // while (n>0) {
            //     int last_digit=n%10;
            //     System.out.println(last_digit);
            //     n=n/10; 
            // }
            // System.out.println();
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while (n>0) {
          int lastdigit=n%10;
          n=n/10;
          rev=(rev*10)+lastdigit;
        }
        System.out.println(rev);
        if (temp==rev){
            System.out.println("it is palindrome");
        }else{
        System.out.println("it is not palindrome");
        }
    }
}
