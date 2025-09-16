public class Maximum {
    public static void main(String[] args) {
        int[] arr = {2, 8, 76, 5, 7};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}

