import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr={3,5,7,8,9};
        int pos=1;
        int n=5;
        int value=20;
        for(int i=n;i<pos;i--){
            arr[i]=arr[i+1];
        }
        arr[pos]=value;
        n++;
        System.out.println(Arrays.toString(arr));
    }

}
