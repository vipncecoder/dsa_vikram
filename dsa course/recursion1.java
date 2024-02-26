// import java.util.*;
public class recursion1 {
    static int  fac(int n){
        if (n==0){
            return 1;
        }
        int partial_ans = fac(n-1);
        int ans=n*partial_ans;
        return ans;
    }
    static int print(int n, int i){
        if(i==n+1){
            return i;
        }
        System.out.println(i);
        return print(n, i+1);
    }
    static int fib(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fib(n-2) +fib(n-1);
    }
    public static void main(String[] args) {
    //   int ans1= fac(5);
    //   System.out.println(ans1);

    // int ans2= print(10, 0);
    // System.out.println(ans2);
      
    int ans3= fib(1);
    System.out.println(ans3);
    }
}
