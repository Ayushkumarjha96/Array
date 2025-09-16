public class Average {
    public static void main(String[] args) {
        int[] arr={2,5,6,8,3};
        System.out.println(average(arr));
    }
    static int average(int[] arr){
        int sum=0;
        int n=arr.length;

       for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];


        }
      return sum/n;
    }
}
