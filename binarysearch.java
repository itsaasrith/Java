// binary search will only work on sorted arrays
public class binarysearch {
    public static int binarysearch(int Array[], int key) {
        // sortedArray=Array.sorted;
        int x = Array.length / 2;
        int y = Array[x];
        // if (condition) {

        // }
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < y && Array[i] == key) {
                return i;
            } else if (Array[i] > y && Array[i] == key) {
                return i;
            }
        }
        return x;
    }

    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }

    public static void Pairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")" + " ");
            }
            System.out.println(); // time complexity=O(n^2) and totla no.of pairs=(n(n-1))/2
        }
    }

    public static void SubArrays(int Arrays[]) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < Arrays.length; i++) {
            for (int j = i; j < Arrays.length; j++) {
                int subArraySum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    // System.out.print(Arrays[j2]+" ");//time complexity=O(n^3) and total no. of
                    // subarrays=(N(N+1)/2)
                    subArraySum += Arrays[j2];
                }
                if (subArraySum > sum)
                    sum = subArraySum;
                // System.out.println();
            }
        }

        System.out.println("The max sum is: " + sum);
    }

    static int[] prefixArray(int[] arr) {
        int n = arr.length;
        int[] prefixArr = new int[n]; 
        prefixArr[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixArr[i] = arr[i] + prefixArr[i - 1];
        }

        return prefixArr;
    }

    static void maxSubArraySumPrefixMethod(int[] arr) {
        int n = arr.length;
        int[] preArr = prefixArray(arr);
        int sum = Integer.MIN_VALUE, subArraySum;

        
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                if (start == 0) subArraySum = preArr[end];
                else subArraySum = preArr[end] - preArr[start - 1];
                if (subArraySum > sum) sum = subArraySum;
            }
        }

        System.out.println("The max sum is: " + sum);
    }
    public static void main(String[] args) {
        // int Array[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        // int key = 8;
        // int index = binarysearch(Array, key);
        // System.out.println(index);

        // // reverse an array
        // int num[] = { 1, 5, 8, 4, 6, 3 };
        // reverse(num);
        // for (int i = 0; i < num.length; i++) {
        //     System.out.print(num[i] + " ");
        // }
        // System.out.println();

        // // Pairs in array
        // int numbers[] = { 1, 2, 3, 4, 5 };
        // Pairs(numbers);

        // // Sub Arrays
        // int Arrays[] = { 1, -2, 6, -1, 3 };
        // SubArrays(Arrays);

        // Prefix Sum Method
        int[] newArr = {1, 2, 3, 4, 5};
        // int[] preArr = prefixArray(newArr);
        // for (int i : preArr) System.out.print(i + " ");
        maxSubArraySumPrefixMethod(newArr);


    }
}