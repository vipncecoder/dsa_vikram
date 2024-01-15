import java.util.Scanner;

public class problem2 {
    public static <String> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    problem -find the no whose digit sum is given from 1(left) to N(right)
//        int left = 1;
//        System.out.println("enter starting number" );
//        int left=sc.nextInt();
//        System.out.println("input end number");
//        int right = sc.nextInt();
//        System.out.println("input the sum of no we need1");
//        int k = sc.nextInt();
//        for (int num = left; num <= right; ++num) {
//            int sum = 0;
////            calculating the of digit for n
//            for (int n = num; n > 0; n /= 10) {
//                int lastDigit = n % 10;
//                sum += lastDigit;
//            }
//            if (sum == k) {
//                System.out.println(num + " : " + sum);
//            }
//        }
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <=5; j++) {
//                if(j%2==0){
//                    System.out.println("1");
//                }
//                else {
//                    System.out.println("0");
//                }
//            }
//        }
        //*** problem for perfect power of two
//        int n = sc.nextInt();
//        for (int i = 2; i < n; i++) {
//            if (n % Math.pow(2, i) == 0) {
//                System.out.println("perfect number");
//            }
//            else{
//                System.out.println("not perfect number");
//            }
//            break;
//        }

// 2nd method
//        int num=sc.nextInt();
//        while (num%2==0){
//            num/=2;
//        }
//        if (num==1){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        System.out.println(num == 1);  --shortcut for above if else problem


        //problem--- find HCF of two given number

//        int n1=sc.nextInt();
//        int n2=sc.nextInt();

// problem pattern 1
//          ****
//          ****
//          ****
//          ****
//int n=sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++)
//                System.out.print("*");
//            System.out.println();
//
//        }

//        rhombus pattern
//        int N = sc.nextInt();
//        for (int row = 1; row <= N; ++row) {
////            printing spaces
//            for (int sp = 1; sp <= (row - 1); ++sp) {
//                System.out.print(" ");
//            }
////            printing stars
//            for (int st = 1; st <= N; ++st) {
//                System.out.print("*");
//            }
////            print new line
//            System.out.println();
//        }
//        kite pattern
        int in=sc.nextInt();
        int num_stars=1;
        //N row to be printed
        for (int row = 1; row <= in; row++) {
            //print in-row space char
            for (int sp = 1; sp <=in-row ; sp++) {
                System.out.print(" ");
            }
            for (int st = 0; st < num_stars; st++) {
                System.out.print("*");
            }
            System.out.println();
            num_stars+=2;
        }

        //think about end
        num_stars=2*(in-1)-1;
        for (int row = in-1; row >=1; --row) {
            //print in-row space char
            for (int sp = 1; sp <=in-row ; sp++) {
                System.out.print(" ");
            }
            for (int st = 0; st < num_stars; st++) {
                System.out.print("*");
            }
            System.out.println();
            num_stars-=2;
        }
    }
}