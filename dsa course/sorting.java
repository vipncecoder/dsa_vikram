
public class sorting {
    void sort(int[] arr){
        for(int i =1;i <arr.length;i++){
            int key= arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]= arr[j];
                j--;
            }
            arr[j + 1] = key;
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
        // comparator -- if we sort on the basis of some points then it is called sorting. 
        int arr[] = { 12, 11, 13, 5, 6 };
 
        sorting ob = new sorting();
        ob.sort(arr);
 
        printArray(arr);
    }
}
