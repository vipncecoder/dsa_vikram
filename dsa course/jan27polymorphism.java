class Couple {
    // properties
    int first;
    int second;

    // Constructors

    // Non-Parameterized constructor
    Couple() {
        this.first = -1;
        this.second = -1;
    }

    // Parameterized constructor
    Couple(int first, int second) {
        this.first = first;
        this.second = second;
    }

    // Copy constructor
    Couple(Couple c) {
        this.first = c.first;
        this.second = c.second;
    }


    // methods 
    boolean equals(Couple c) {
        // whether the first & second of this
        // object is equal to the first & second
        // of the object `c` or not?
        return first == c.first && second == c.second;
    }

    //method overloading

    int multiply(){
        return this.first*this.second;
    }

    couple multiply(int a){
        couple c= new couple();
        c.first =this.first*a;
        c.second = this.second*a;
        return c;
    }

    // int multiply(int a, int b){
    //     return a*b;
    // }

    couple multiply(couple c){
        couple ans = new couple(c.first*this.first, c.second*this.second);
        return ans;
    }

    String convertToString() {
        return "[" + first + ", " + second + "]";
    } // 1 2 -> "[1, 2]"
}

public class jan27polymorphism {
    public static void main(String[] args) {
        couple c1= new couple(4, 12);
        System.out.println(c1.multiply(4));
        
    } 
    
}
