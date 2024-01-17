import java.util.Scanner;
// function to display the array
public class jan17_arr {
    public static void display(int[] arr,int N){
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static int insert_at_end(int[] arr,int N, int val){
        if(N<arr.length){
            arr[N]=val;
            return N+1;
        }
        else return N;
    }
    public static int delete_from_end(int[] arr, int N){
        if (N>=1){
            arr[N-1]=0;
            return N--;
        }
        else return N;
    }
    public static int delete_from_beginning(int[] arr, int N){
        if (N==0) {
            return N;
        }
        // n>=1
        // arr[1]->arr[0]
        // arr[2]->arr[1];
        // ...
        // arr[N-1]-> arr[N-2]

        // original arr : [1,2,3,4,..]{N=4}

        // current : [2,3,4,5,...]
        for (int i = 0; i+1 < N; i++) {
            arr[i]=arr[i+1];
        }
         arr[N-1] =0;
        return N-1;
    }
    public static int insert_in_beginning(int[] arr, int N, int val){
        if (N== arr.length) {
            return N;
        }
        //make space at oth index
        //shift everything to 1 place right
        //orig : [1,2,3,4,5..]
        for (int i = N; i >=1; i--) {
            arr[i]=arr[i-1];
        }
        //use the space to fill in the new val
        arr[0]=val;
        return N+1;
    }
    public static int delete_at_index(int[] arr, int N, int id){
        if (N==0) {
            return N;
        }
        if(id<0||id>=N)
        return N;

        for (int i = id; i+1 < N; i++) {
            arr[i]=arr[i+1];

        }
        arr[N-1] =0;
        return N-1;
    }
    public static int insert_at_index(int[] arr,int N, int id,int val){
        
        if (N==arr.length) {
            return N;
        }
        if (id<0||id>=N) {
            return N;
        }
        for (int i = N; i >=id ; i--) {
            arr[i]= arr[i-1];
        }

        arr[id]= val;
        return N+1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //insertion and deletion in array
        // int arr[]={1,5,3,3};
        int arr[]=new int[100];
        
        //taking the input in the array
        int N =sc.nextInt();
        for (int i = 0; i < N ;i++) {
            arr[i]=sc.nextInt();
        }

        display(arr,N);

        //delete from the end
        // if (N>=1) {
        //     arr[N-1]=0;
        //     N--;
        // }
        // display(arr, N);
        // deleting using function
        // N=delete_from_end(arr, N);
        // display(arr, N);

        //insert 15 at the end
        // N=insert_at_end(arr, N, 15);
        // display(arr, N);

        // delete in the beginning

        // N=delete_from_beginning(arr, N);
        // display(arr, N);

        // N=delete_at_index(arr, N, 2);
        // display(arr, N);

        N=insert_in_beginning(arr, N, 12);
        display(arr, N);


        // N=insert_at_index(arr, N, 3, 14);
        // display(arr, N);

        sc.close();
    }
}
