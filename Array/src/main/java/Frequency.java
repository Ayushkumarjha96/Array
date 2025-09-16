public class Frequency {
    public static void main(String[] args) {
        int[] arr={5,2,8,76,5,2,5,3,7};
        int n=5;
        int freq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                freq++;
            }
        }
        System.out.println("frequency is:"+freq);
    }

}
