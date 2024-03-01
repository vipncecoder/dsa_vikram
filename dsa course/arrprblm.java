import java.util.Scanner;

public class arrprblm {
    public static void main(String[] args) {
        // sorting problem
        int arr[] ={1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(i!=j){
                int ans = Math.abs((arr[j]-arr[i]));
                System.out.println(ans);
                }
            }
        }
    }
}
