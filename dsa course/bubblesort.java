public class bubblesort {
    void bubblesort(int[] arr){
        for(int it = 1; it <= arr.length - 1; ++it) {
        for (int i=0; i<arr.length-1;i++){
            while(arr[i]>arr[i+1]){
                int temp= arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
            
        }
    }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i <n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        bubblesort b = new bubblesort();
        // ob.sort(arr);
        b.bubblesort(arr);
 
        printArray(arr);
    }
}
