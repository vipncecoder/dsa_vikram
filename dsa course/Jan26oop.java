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
    void stop(){
        System.out.println("stop the car");
    }
    int age(int curYear){
        return curYear-manufactureDate;
    }
}


public class Jan26oop {
    public static void main(String[] args) {
        car c1=new car();
        // System.out.println(c1);

        //accessing the properties of c1
        c1.manufactureDate=2018;
        c1.color="white";
        c1.start();
        c1.moveAhead();
        c1.stop();
        System.out.println(c1.age(2024));

    }
    
}
