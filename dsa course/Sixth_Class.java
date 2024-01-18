import java.util.Scanner;

public class Sixth_Class
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // power of 2
        int n=sc.nextInt();
       while(n%2==0)

           n/=2;
           if(n==1)
           {
               System.out.println(true);
           }
           else
           {
               System.out.println(false);
           }
           // GCD

    }
}
