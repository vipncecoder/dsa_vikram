import java.util.Arrays;

public class jan24fun {

    // function declaration
    // // return_type functionName(){
    // //body
    // }

    public static void pranam() {
        System.out.println("jai shree ram!");
    }

    // taking input in a function
    public static void pranam1(String name) {
        System.out.println("pranam! " + name);
    }

    // scope of variables
    public static int add(int a, int b) {
        int c = a + b;
        // System.out.println(c); -- scope of variable in this function is only in this
        // function
        return c;
    }

    // call stack
    // pass_by_value
    // public static void increment(int num) {
    //     num++;
    // }
    public static void func(int inp[]) {
        inp[2]= 1000;
        
    }

    public static void main(String[] args) {
        // System.out.println(pranam());
        // pranam();
        // pranam1("vikram");
        // System.out.println(add(12, 6));
        int x=5;
        // increment(x);
        // System.out.println(x);
        int arr[] ={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        func(arr);
        System.out.println(Arrays.toString(arr));
    }
}
