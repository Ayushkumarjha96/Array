public class Sum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 3};
        System.out.println(arraySum(arr));
    }
    static int arraySum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
