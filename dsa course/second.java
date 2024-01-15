import java.util.Scanner; //this package is used for taking input from user -- for this have to make its object as given below

class second {
    static int age2 = 44; //here we can only initialize using static keyword

    public static void main(String[] args) {//from here code starts
//        intro to java
//        here public static void main are java keywords
//        java is case-sensitive language
//        System.out.println("hello ");//using 'println' will print in different line but 'print' will print in same line

//        ***********************variable declaration

//        byte	1 byte	Stores whole numbers from -128 to 127
//        short	2 bytes	Stores whole numbers from -32,768 to 32,767
//        int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean	1 bit	Stores true or false values
//        char	2 bytes	Stores a single character/letter or ASCII values
//          int age, b, c; //  declared only --multiple variable can be declared using comma separation
//          datatype variable_name;
//        int age=34;  //declared and initialized
//        System.out.println(age);   //print 34
//        age=23;
//        System.out.println(age);   //print 23
//        System.out.println(age2);
//
////        decimal
//        double a=54.3;
//        float b=54.99f;
//        boolean c= true;
//        char ch='$';
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(ch);



//        **************type conversion

//        int var1 = 45;
//        long var2 = 55;
//        var1 = (int) var2; //we can convert short length datatype into long one using this type casting
//        System.out.println(var2);

//        *********************Arithmetic operator
//        +,_,*,/

//        int a1=5 ,b1=10, c1=7;
//         int d=a1/(b1+c1); // divide int by int will get only integer value
//        System.out.println(d)


// **********************divide (double/float by double/float)
//        int /(double or float)
//        double or float / int
//        System.out.println(19.4 / 5.0);
//
//        System.out.println(19.0 / 5.0);

//        module operator -- gives the remainder
//        System.out.println(5 % 2);
//        System.out.println(12 % 5);
//        System.out.println(-12 % 5);

//        ***************************Assignment operator(=,-=,+=
//        int x=4;
//        x+= 6;
//        System.out.println(x);

//        ********************Relation operator(>=,<=,<,>,==)
//        int y=3;
//        int z=5;
//        System.out.println( y+99>=z+6);
//        System.out.println('a'==5);
//        System.out.println(5.0==5);

//        ******************Logical operators(&&-and, ||-or, !-not)
        System.out.println(7 > 5 && 5 > 7);
        System.out.println(7 > 9 || 9 > 7);

        //*****************unary operator(++,--)

//        find difference between pre increment ond post increment
        int f = 4;

//        System.out.println(++f);
//        System.out.println(f++);
//        System.out.println(f);

//       ********************  method for taking input

        Scanner in = new Scanner(System.in); //this is to make new object and using (in.next...) we will assign type of datatype
//        Scanner in1=new Scanner(System.in);

        System.out.println(  in.nextInt() +  in.nextInt());
        in.nextDouble();


    }
}
