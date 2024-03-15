package LABS;
import java.util.*;
public class LAB_2 {
    public static void main(String[] args) {
        int a =(101+6)/3 ;
        double b=3.0e-6 *10000000.1;
        boolean c= true &&false;
        boolean d= true &&true;
        boolean e=(false && false) || (true && true);
        boolean f=(false || false) && (true || true);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        int Array[]={1,2,5,0,4,14,13,25,53,18};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i]>max) {
                max=Array[i];
            }
        }
        
        System.out.println(max);

        // 2d array
        int twoArr[][]={{5,15,25},{10,20,30}};
        System.out.println(twoArr[0][2]);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < twoArr.length+1; j++) {
                System.out.print(twoArr[j][i]+" ");
            }
           System.out.println(); 
        }
    }
}
