import java.sql.SQLOutput;
import java.util.Scanner;
public class Fourth_class {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        // frizzbuzz problem
        /*int sum=0;
        for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0)
            System.out.println("Fizzbuzz");
        else if(i%3==0)
            System.out.println("Fizz");
        else if(i%5==0)
            System.out.println("Buzz");
        else
            System.out.println(i);
        sum += i;
        System.out.println("Sum is" +sum);
            if(sum> 3*n)
                break;
        }*/
        // count the digit in number

   /* int count=0;
    for(int num=n; num>0; num /=10)
    {
       System.out.println("Number is" +num + "now") ;
       count++;

    }
       System.out.println(count);*/
        // to find sum of digit
        int l=sc.nextInt();
        int r=sc.nextInt();
        for(int n=l; n<=r;n++) {
            int sum = 0;
            for (int num = n; num > 0; num /= 10) {
                int k = num % 10;
                sum = sum + k;

            }

            System.out.println(sum);
        }

    }
}
//number is prime or not
//




