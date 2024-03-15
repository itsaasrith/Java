import java.util.*;
import java.math.*;
public class Strings {
    // palindrome
    public static boolean checkpalindrome(String str){
        int n=str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i)!=str.charAt(n-i-1)) {
                return false;
            }
            

        }return true;
    }

    // shortest path
    public static double shortpath(String str){
        int x=0;
        int y=0;
        char north='N';
        char south='S';
        char east='E';
        char west='W';
        for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==north){
                    y=y+1;
                }else if (str.charAt(i)==south) {
                    y--;
                }
                else if (str.charAt(i)==east) {
                    x++;
                }else{
                    x--;
                }
        }
        double path=Math.sqrt((x*x)+(y*y));
        return path;
        
    }

    // conver to upper case
    // public static void firsttoupper(String str){
    //     StringBuilder sb=new StringBuilder("");

    // 

    // String compressor
    public static void StringCompressor(String str){
        StringBuilder sb=new StringBuilder("");
        
        for (int i = 0; i < str.length(); i++) {
            
        }
    }


    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
        //strings are immutable
        Scanner sc=new Scanner(System.in);
        String name;
        String name1;
        // name=sc.next();
        // name1=sc.nextLine();
        // System.out.println(name);
        // System.out.print(name1);       
        String FullName="Sai Aasrith";
        System.out.println(FullName.length());
        System.out.println(FullName.charAt(4));
        for (int i = 0; i < FullName.length(); i++) {
            System.out.println(FullName.charAt(i)+" ");
        }
        String str1="racecar";
        System.out.println(checkpalindrome(str1));
        // checkpalindrome(str1);
        String str_1="WNEENESENNN";
        System.out.println(shortpath(str_1));

        if (str1.equals(str_1)) {
            System.out.println("yes");
        }else{
            System.out.println("no"); 
        }
        System.out.println(FullName.substring(0, 3));
        StringBuilder sb=new StringBuilder("");
        sb.toString();
        System.out.println(sb);
        for (char ch='a'; ch<= 'z';ch++) {
            sb.append(ch);
        }
        System.out.println(sb);//O(n)=O(26)
        



        
    }
}

// interning : pointing two strings to a same strin(name,char,etc....)
