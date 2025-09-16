public class Count {
    public static void main(String[] args) {
        int n=4567;
        int i=0;
        while(n!=0){
            int rem=n%10;
            i++;
            n=n/10;
        }
        System.out.println(i);
    }
}
