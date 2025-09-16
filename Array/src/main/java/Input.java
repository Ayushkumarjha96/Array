// Taking input from the user
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Array of primitive
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();



        }
        System.out.println(Arrays.toString(arr));


    }
}
