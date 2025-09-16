import java.util.Arrays;

public class PrintRoll {
    public static void main(String[] args) {
        int[] marks={23,56,78,45,22};
        int n=marks.length;
        for(int i=0;i<n;i++){
            if(marks[i]<35){
                System.out.print(i + " ");
            }
        }
    }
}
