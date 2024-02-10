import java.util.*;
public class dowhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int counter=1;
        // do{
        //     System.out.println("Hello World!");
        //     counter++;
        // } while(counter<=5);
        
        while (counter<=5) {
            System.out.println("hello world");
            counter++;
            if(counter==3){
                break;
            }
            
        }
        // continue
        for (int i = 1; i <= 5; i++) {
            if(i==3){
            continue;
             } 
             System.out.println(i);
        }
        
    }
}
