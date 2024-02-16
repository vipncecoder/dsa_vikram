import java.util.Scanner;

public class feb23_ArrPrac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // //  problem maximum subarray
        // int arr[]={1,2,3,4,-1,5,3,4,-9};
        // int mac  

        // problem 1
        int N=sc.nextInt();
        int Q=sc.nextInt();

        int arr[]=new int[N]; 
        // System.out.println(arr[1]);
        // query1

        // Input the queries
        for (int i = 0; i < Q; ++i) {
            int l=sc.nextInt();
            int r=sc.nextInt();

            arr[l] +=1;
            if (r+1<N) {
                arr[r+1]-=1;
            }
        }
        for (int i = 0; i < N; i++) {
            arr[i] +=arr[i-1];
        }
        for(int num: arr)
        System.out.println(num + " ");
        
    }
}
