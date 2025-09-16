public class Array1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 8, 6};
        System.out.println(largest(arr));
    }

    static int largest(int[] arr) {
        int max = arr[0];
        for (int j : arr) {


            if (j > max) {
                max = j;
            }


        }
        return max;
    }
}
