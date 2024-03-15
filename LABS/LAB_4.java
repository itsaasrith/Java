// WAP to print diamond structure 
// WAP to print inverse left angle traingle
// WAP to print a pyramid with number(1,22,333)
// WAP to print number right angle traingle
package LABS;

public class LAB_4 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        int n=1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 5; i >=1; i--) {
            for (int j = 0; j < 6-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        int x=0;
        for (int i = 0; i < 5; i++) {
            x++;
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print(x+" ");
            }
            System.out.println();
        }

        int y=1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print(y+" ");
                y++;
            }
            System.out.println();
        }
    }
}
        
