import java.util.*;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    if (n%2==0 && n>2){
        System.out.println("they can divide it  into two even parts");
    }else{
        System.out.println("not possible");
    }
    }
}
