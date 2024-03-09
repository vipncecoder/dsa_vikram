class car{
    String model;
    int manufactureDate;
    int price;
    String color;

    void start(){
        System.out.println("start the car");
    }
    void moveAhead(){
        System.out.println("moving ahead");
    }
    // void moveBackward(){
    //     if(isOn==false){
    //         System.out.println("start the car first");
    //         return;
    //     }
    // }
    void stop(){
        System.out.println("stop the car");
    }
    int age(int curYear){
        return curYear-manufactureDate;
    }
}
class couple{
    int first;
    int second;

    boolean equals(couple c){

        // whether the first & second of this
        // object is equals to the first & second
        // of the object "c" or not?
        return first ==c.first && second==c.second;
    }
    String convertToString(){
        return "[" + first + ", " + second + " ]";
    }
    // constructor

    // non parameterised 
    couple(){
        this.first=-1;
        this.second=-1;
    }

    // parameterised constructor
    couple(int first, int second){
        this.first=first  ;
        this.second=second;
    }

    // copy constructor
    couple(couple c){
        this.first= c.first;
        this.second=c.second;
    }
    public char[] multiply(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }
}

public class Jan26oop {
    public static void main(String[] args) {
        // car c1=new car();
        // System.out.println(c1);

        //accessing the properties of c1
        // c1.manufactureDate=2018;
        // c1.color="white";
        // c1.start();
        // c1.moveAhead();
        // c1.stop();
        // System.out.println(c1.age(2024));

        couple c1=new couple();
        c1.first=1;
        c1.second=5;
        System.out.println(c1.convertToString());
        couple c2= new couple();
        c2.first=1;
        c2.second=5;
        System.out.println(c1.equals(c2));
        



    }
    
}
