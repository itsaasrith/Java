public class Sorting {
        public static void bubblesorting(int a[]){
            int n=a.length;
            for(int turns=0;turns<(n-1);turns++){
                int swap=0;
                for(int j=0;j<(n-1-turns);j++){
                    if(a[j]>a[j+1]){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        swap++;
                    }
                }
            }
            
        }
        public static void selectionsort(int arr[]){
            // int small=Integer.MAX_VALUE;
            for (int i = 0; i < arr.length-2; i++) {
                int minpos=i;
                for (int j = i+1; j < arr.length-1; j++) {
                    if (arr[minpos]>arr[j]) {
                       minpos=j;
                    }
                }
                int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;

            }
        }
        public static void insertionsort(int array[]){
           int sortedarr[]={};
        //    array[0]=sortedarr[0];
           for (int i = 0; i < array.length-1; i++) {
                //  sortedarr[0]=i;
                for (int j = 0; j < sortedarr.length; j++) {
                    if (sortedarr[j]>array[j]) {
                        int temp=sortedarr[j];
                        sortedarr[j]=array[j];
                        array[j]=temp;
                    }
                }
           }
        }
    public static void main(String args[]) {
        int a[]={10,2,57,48,20};
        bubblesorting(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        // int arr[]={2,5,8,1,4,9};
        // selectionsort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        int array[]={3,5,4,1,7,2};
        insertionsort(array);;
        for (int i = 0; i < sortedarr.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        
    }
}
