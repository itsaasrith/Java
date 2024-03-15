public class linearsearch {
    public static int linearsearch(int numbers[],int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==key) {
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int numbers[]={1,5,8,86,55,5,2,5,3,2,4,8};
        int key=55;
        int index =linearsearch(numbers, key);
        if (index==-1) {
            System.out.println("not found");
        }else{
            System.out.println("key is "+index);
        }
    
        int num[]={5,8,9,1,07,3,52};
        int largest =Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i]>largest){
                largest=num[i];
            }
        }System.out.println("largest is "+largest);
    }

}
