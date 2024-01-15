import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n=sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (i%3 ==0 && i%5==0){
//                System.out.println("FizzBuzz");
//            } else if (i%3==0) {
//                System.out.println("Fizz");
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//            }
//            else System.out.println(i);
//        }
        // int n = sc.nextInt();
//        int sum=0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {System.out.println(i);
//            sum += i;
//                System.out.println("sum" + sum);
//        }
//        if (sum > 3 * n) {
//            break;
//        }
//    }
//        sc.close();

//        int n = sc.nextInt();
//        int count = 0;
//        for (int num = n; num > 0; num /= 10) {
//            System.out.println("digit is " + num + "now.");
//            count++;
//        }
//        System.out.println(count);
//        sc.close();

//        int n=sc.nextInt();
//        int count=0;
//        while (n>0){
//            n/=10;
//            count++;
//        }
//        System.out.println(count);

//        int n=sc.nextInt();
//        int count=0;
//        int r=0;
//        while (n>0){
//            int k=n%10;
//            r+=k;
//            n/=10;
//            count++;
//        }
//        System.out.println(count);
//        System.out.println(r);

        int left=sc.nextInt();
        int right=sc.nextInt();
        for (int num = left; num <=right ; num++) {
        int sum=0;
            for (int n=num; n > 0; n /= 10) {
                int lastDigit=n%10;
                sum+=lastDigit;
            }
            System.out.println(sum);
        }





    }
}
