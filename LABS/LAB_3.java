// WAP to print a array after changing rows and coloumns of 2d array
// WAP that reads an integer and add all the digits
//WAP to print right and left angle traingle
package LABS;

import java.util.*;

public class LAB_3 {
    public static void main(String[] args) {
        int Array[]={1,2,5,0,4,14,13,25,53,18};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i]>max) {
                max=Array[i];
            }
        }
        System.out.println(max);
        int [][] twoDarr={{1,2,3},{2,4,5}};
        for (int i = 0; i < twoDarr.length-1; i++){
            for (int j = 0; j < twoDarr.length+1; j++) {
                System.out.print(twoDarr[i][j]+" ");
                System.out.println(twoDarr[twoDarr.length-1][j]);
            }
        }
        int a=12345;
        int sum=0;
        while (a>0) {
            int reva=a/10;
            int x=a%10;
            sum=sum+x;
            a=reva; 
        }
        System.out.println(sum);
        
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print('*'+" ");
            }
            System.out.println();    
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) System.out.print("*"+" ");
            System.out.println();
        }
        System.out.println("\n");
    }
}