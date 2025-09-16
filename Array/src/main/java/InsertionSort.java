import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,6,8,1};
        for(int i=1;i<arr.length;i++){
            int current=arr[i]; //unsorted array
            int j=i-1;//Sorted array

             while(j>=0&& current<arr[j]){
                 arr[j+1]=arr[j];
                 j--;

             }

         arr[j+1]=current;
        }
        printArr(arr);
    }
    static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
