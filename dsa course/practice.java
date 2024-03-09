import java.util.*;
public class practice {
    static void hollowSq(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1 || i==n || j==1 || j==n ||i==j|| j==(n - i + 1)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void hollowSqStar( int n){
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==1|| i==n||j==1||j==n||i==j||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n =sc.nextInt();

        //problem 1
    //     for (int i=1; i <=n ; ++i){
    //         for (int j=1 ; j<= n ; ++j){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // hollowSq(5);
    // hollowSqStar(5);

    int n= sc.nextInt();
    

    

  }
}
