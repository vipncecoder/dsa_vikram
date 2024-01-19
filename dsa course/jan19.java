import java.util.Scanner;

public class jan19 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //taking input
    // int N=sc.nextInt();
    // int arr[] =new int[N];
    // for (int i = 0; i < N; i++) {
    //     arr[i]=sc.nextInt();
    // }

    //print subarray from an array
    // for (int start = 0; start < N; start++) {
    //     //en =st,st+1,st+2...N-1
    //     for (int end = start; end < N; end++) {
    //         for (int i = start; i  <=end; i++) {
    //             System.out.print(arr[i] + " ");
                
    //         }
    //         System.out.println(" ");
    //     }
    // }

    // Multidimensional array
    // Declaration
    // <datatype> <array name>[][]=new <datatype>[no of rows][no of cols]
    // Declaration and initialization at same time
    // <datatype> <array name>[][]={{elements},{elements},{elements}};

    // Accessing the elements in multi dimensiona array
    
    // A bit about memory allocation

    // can different rows have differnt column size--yes called jagged array
    
    // 2-D aarray
    int arr2D[][] = new int[6][3];


    // no if rows
    System.out.println(arr2D.length + " rows ");
    System.out.println(arr2D[1].length + " cols ");

int arr2[][] ={{1,2,3},{4,5,6}};  //2D arr

// row wise traversal--printing array
for (int i = 0; i < arr2.length; i++) {
    // ith row
    for(int val: arr2[i])
    System.out.print( val + " ");
    System.out.println();
}

// row wise traversal -printing array
// for (int i = 0; i < arr2.length; i++) {
//     for (int j = 0; j < arr2[i].length; j++) 
//         System.out.print(arr2[i][j] + " ");
//     System.out.println();
// }
System.out.println(arr2[1][2]);
 }   
}
