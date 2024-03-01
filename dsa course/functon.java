  
import java.io.*;
public class functon {
    // after the class we can make the function and before main function

    // function without input
    static String great(String s , int h, int j){
        System.out.println("hello");
        System.out.println(h+j);
        return s;
    }

    // function with input
    static int addTwo( int a , int b , char c){
        System.out.println(c);
        great("HI", 6, 8); // calling other function in another function
        return a+b;
    }

    /*  pass by value v/s pass by reference */
    // in java there is only pass by value because there is no concept of pointer in java but it is in c++ or c
    // if input is array or stringBuilder it will work as pass by reference i.e value will change while calling function if we do any changes in input inside the function
    


    public static void main(String args[]){ // main is also a function 
        // main(args);  
        /*         declaratio of function   */

        //  returnType funcName(input pass){ 
        //     function body(logic)
        // }

        // function calling
        // System.out.println(great("vikram",7,9));
        System.out.println(addTwo(3, 0, 'f'));

    }
}
