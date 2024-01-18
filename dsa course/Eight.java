import java.util.Arrays;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt(); // length of array
        int arr[]= new int[N];
        for(int i=0;i<N;i++){ //insert element in array and increase index one by one
            arr[i]=sc.nextInt();

        }
        int min= arr[0];
        for(int i=0;i<N;++i)
        {
            if(arr[i]<min)
                min= arr[i];
        }

        System.out.println(min);
        int sec_min=Integer.MAX_VALUE;
        for(int i=0;i<N;++i){
            if(arr[i]== min)
                continue;
            if(arr[i]<sec_min)
                sec_min=arr[i];
        }
        System.out.println(sec_min);
        for(int i=N-1;i>=0;i--)
        {
            System.out.println(arr[i]+ "");
        }
       // Arrays.reverse=(arr);
        //medium
        int i=0;
        int j=N-1;
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }


        sc.close();
    }

}
