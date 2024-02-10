import java.util.*;
public class Array {
    public static void main(String[] args) {
      int marks[] =new int[10];  
      int numbers[]={1,2,3};
      String fruits[]={"apple","mango","banana"};
      float num[]={1.0f,2.0f,3.0f};
        Scanner sc=new Scanner(System.in);
        // int maths;
        // maths=sc.nextInt();
        // phy=sc.nextInt
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("maths:"+marks[0]);
        System.out.println("phy:"+marks[1]);
        System.out.println("chem:"+marks[2]);
        marks[0]=marks[0]+1;
        System.out.println("maths"+marks[0]);
        System.out.println(marks.length);
        System.out.println(fruits.length);
        
    }
}
