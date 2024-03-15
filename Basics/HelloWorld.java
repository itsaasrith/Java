// public class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
        
//     }
// }
public class HelloWorld {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int n1 = 0, n2 = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + " ");

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
