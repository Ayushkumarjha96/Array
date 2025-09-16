public class PrimeCountArray {
    public static void main(String[] args) {
        // Array from 1 to 30
        int arr[] = new int[30];
        for (int i = 0; i < 30; i++) {
            arr[i] = i + 1;
        }

        int count = 0;

        // Check each element
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }

        System.out.println("Count of prime numbers between 1 and 30 = " + count);
    }

    // Function to check prime
    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}