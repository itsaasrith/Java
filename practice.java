import java.util.*;
public class practice {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a=sc.nextInt();
    System.out.println("Enter the second number:");
    int b=sc.nextInt();
    System.out.println("Enter the third number:");
    int c=sc.nextInt();
    
    int average=(a+b+c)/3;
    
    System.out.println(average);

    int aakash=sc.nextInt();
    int area=aakash*aakash;
    System.out.println(area);
    sc.close();
    float pencil=sc.nextFloat();
    float pen=sc.nextFloat();
    float eraser=sc.nextFloat();
    float total=pen+pencil+eraser;
    double withgst=total+(0.18f * total);
    System.out.printf("%.3f", withgst);

    byte b=4;
    char c='a';
    short s=512;
    int $ =1000;
    float f=3.14f;
    double d=99.9954;
    double result =(f*b)+($%c)-(d*s);
    System.out.println(result);


   } 
}




