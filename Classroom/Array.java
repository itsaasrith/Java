package Classroom;

public class Array {
        // WAP to create java method to reverse a string
        // WAP to calculate the fibbonacci series
        // WAP to print left angle triangle
        public void reverseastring(String str){
            String reversed="";
        char[] chararr=str.toCharArray();
            for (int i = 0; i < str.length()/2; i++) {
                char temp=chararr[i];
                chararr[i]=chararr[str.length()-i];
                chararr[str.length()-i]=chararr[i];
            }
        }
        public static void reverse(){
            String name="san";
            String rev="";
            for (int i = 0; i < name.length(); i++) {
                rev=name.charAt(i)+rev;
            }
            System.out.println(rev);
        }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        //length
        System.out.println("length of the array:"+arr.length);
        //sum of th elements
        int sum=0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum=sum+arr[i];
        // }
        for (int i : arr) {//by traversing 
            sum=sum+i;
        }
        System.out.println(sum);
        //average of the array
        float avg=sum/arr.length;
        System.out.println(avg);
        // String name="racecar";
        // reverse(name);
        String name="san";
            String rev="";
            for (int i = 0; i < name.length(); i++) {
                rev=name.charAt(i)+rev;
            }
        System.out.println(rev);
        String str="abcde";
        char[] chararr=str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

        }
    }
}

