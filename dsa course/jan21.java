import java.util.Scanner;

public class jan21 {
    public static void main(String[] args) {
        // System.out.println("vikram");
        // introduction to Strings
        // String sc="vikram kumar";
        Scanner sc=new Scanner(System.in);

        // declaration and initialisation of String
        // String str=" I am vikram kumar";
        // String str1=new String("hey there how are you");
        // // System.out.println(str1);
        
        
        // Taking input of String
        // String str2=sc.next();  // it will take only first string if we give line as input
        // System.out.println(str2);

        // String str3=sc.nextLine(); //-- it will take whole line as input
        // System.out.println(str3);

        // some inbuilt String function
        //  String str4=" Hi, I am vikram kumar a nice cool men       ";
        //  System.out.println(str4);
        //  System.out.println(str4.length());
        //  System.out.println(str4.charAt(6));
        //  System.out.println(str4.substring(7, 12));
        //  System.out.println(str4.substring(7));

        //  split 
        // String arr[] = str4.split(", ");
        // System.out.println(arr[1]);

        // contains gives if substring is present in the given string or not
        // System.out.println(str4.contains("Hi"));

        // trim
        // System.out.println(str4.trim());


        // String comparision

        // int to string & string to int
        
        // problem 1
        // given a positive integer, find the sum of itd first digit and last digit

        // String s1= sc.next();
        // int N=sc.nextInt();

        // String s1=Integer.toString(N);
        // int firstDig= s1.charAt(0) - '0' ;//it will change char into int -- (- '0') will find char at that index as it is
        // int lastDig =s1.charAt(s1.length()-1)-'0' ;
        // System.out.println(firstDig + lastDig);
        // System.out.pr intln(s1.charAt(0)+s1.charAt(s1.length()-1));

        // A bit about characters
        // char ch='a';
        // System.out.println((int)ch);


        //  String s="1234";
        // //  System.out.println(s.charAt(0)+s.charAt(s.length()-1)); --will not work because of typecasting into integer
        // for (int i = 0; i < 256; i++) {
        //     System.out.println(i + "\t->\t" + (char)i);
        // } 


        // problem2-- given a string, find the most recurring character in that string
        String s2=sc.next();
        // create an array of size 256
        // to store frequency of diff
        // character in the given string
        int freq[] = new int[256];
        for (int i = 0; i < s2.length(); i++) {
            int id =s2.charAt(i);
            // System.out.println(id);
            freq[id]++;
        }
        // you have all the frequencies now 
        // print the character with maximum frequency
        int max_id=-1;
        int max_f=-1;
        for (int i = 0; i < 256; i++) {
            if (freq[i] >max_f){
                max_f=freq[i];
                max_id=i;
            }
        }
        System.out.println((char)max_id);


    }
}

