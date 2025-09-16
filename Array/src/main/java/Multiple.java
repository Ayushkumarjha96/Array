import java.util.*;
public class Multiple {
    static int multiple(int n) {
        int sum = 0;
        int i = 1;
        while (i<n) {
            if(i%3==0 ||i%5==0){
            sum = sum + i;

        }
        i++;
    }

        return sum;

    }

    public static void main(String[] args) {

        System.out.println(multiple(10));

        }
    }

