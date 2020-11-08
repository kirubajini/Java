class SumOfArray{
    public static void main(String args[]){
        int[] array = {15, 10, 25, 35, 50, 100};
        int sum = 0;
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array is:"+sum);
    }
}
