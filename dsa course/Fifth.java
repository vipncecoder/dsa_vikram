import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     /*   int l= sc.nextInt();
        int r= sc.nextInt();
        int k= sc.nextInt();
        int sum=0;
        for(int n=l;n <=r;n++)
        {

         for(int N=n;n>0;n/=10){
             int m= n%10;
             sum= sum+m;
         }
         if (sum==k)
             System.out.println(n+""+sum);
        }*/
       /* While(condition) you can do updation in body and intialise anywhere you
        want according to need
        do { code} while(condition)        */

      /*  int target_count= sc.nextInt();
        int target_sum= sc.nextInt();
        // start from 1 and keep checking sum is digit for all natural no, one by one
        // print first 10 no whose sum is target sum
        int cur_num=1;
        int count=0;
        while(count <target_count) {
            int sum = 0;
            for (int num = cur_num; num > 0; num/=10) {
                int k = num % 10;
                sum = sum + k;

                if (sum == target_sum) {
                    System.out.println(cur_num);
                    count++;
                }
            }
            cur_num++;
        }*/
      //  Prime no
        int n= sc.nextInt();
        int N= sc.nextInt();
        boolean is_prime= true;

        for(int i=2;i<=n-1;i++)
        {
             if(n%i==0){
               is_prime= false;
               break;
             }

        }
        System.out.println(is_prime+ ", Number is not prime");
        }
    }

