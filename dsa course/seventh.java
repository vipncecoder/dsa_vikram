// import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        int arr [];
        arr= new int[10];
        arr[0]= 10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        System.out.println(arr[1]);
        System.out.println(arr.length);
        for(int i=0;i<arr.length;++i){
            System.out.println(arr[i]);
        }
        int arr2[]= {1, -9, -5, -4};
        System.out.println(" ");
        for(int i=0;i<arr2.length;++i){
            System.out.println(arr2[i]);}
        for(int value:arr2 ){
            System.out.println(value +" ");}
        // tostring
        System.out.println(Arrays.toString(arr2));
        // sort
        Arrays.sort(arr2);
        System.out.println();
        //replace element
        Arrays.fill(arr2, -1);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr,arr2));

        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int arr3[]= new int[5];
        for(int i=0;i<=N; ++i) {
            arr[i]= sc.nextInt();
        }
        int target_num= sc.nextInt();
        boolean ans= false;
        for(int val : arr){
            if(val== target_num){
                ans = true;
                break;
            }
        }

    }
}
