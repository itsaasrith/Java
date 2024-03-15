import java.util.*;
public class practice_1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    //     do {
    //         System.out.println("Enter a number:");
    //         int n=sc.nextInt();
    //         if (n%10==0) {
    //             break;
    //         }
    //     } while(true);
        

        // do{
        //     System.out.print("enter a number:");
        //      int x=sc.nextInt();
        //     if(x%10==0){
        //         continue;
        //     }
        //       System.out.println("number was "+x);  
        //     }while (true) ;

            // checking prime number
            // int y=sc.nextInt();

            // boolean isprime=true;
            //  for (int i = 2; i <=y-1; i++) {
            //     if(y%i==0){
            //     isprime=false;
            //  }
            // }
            //  if (isprime==true) {
            //     System.out.println("y is prime");
            //  } else{
            //     System.out.println("y is not prime");
            //  }

                // by another method
    //     int n=sc.nextInt();
    //             if(n==2){
    //         System.out.println("it is prime");

    //     }else  ;
    //     boolean isprime=true;
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0);
    //         isprime=false;
    //     } if (isprime==true) {
    //         System.out.println("it is prime");
    //     }else{
    //         System.out.println("it is not prime");
    //     }
    // Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers
    int n;
    int choice;
    int evensum=0;
    int oddsum=0;
    do {
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if(n%2==0){
            evensum=n+evensum;
        }else{
            oddsum=oddsum+n;
        }
        System.out.println();
    }
    
    for (int i = 0; i <= n; i++) {
        
    }
    }       
}
