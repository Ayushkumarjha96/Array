import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8};
        int target = 5;
       int[] result=twoSum(arr,target);
        if(result.length == 0){
            System.out.println("No pair found");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println();


        }
    }


        static int[] twoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
return  new int[]{i,j};
                }
            }
        }
            return new int[]{};

    }

}
