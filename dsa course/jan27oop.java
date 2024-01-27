class vehicle{
    int numWheels;
    String make;
    String model;
    vehicle(){
        System.out.println("hello I am from vehicle");
    }
    vehicle(String make, String model){
        System.out.println("hello I am in 2nd cnstructor");
        this.make=make;
        this.model=model;
    }

    public String convertToString(){
        return "[" + make + " -> " + model + "]";
    }
}


class car extends vehicle{
    boolean sunRoof;
    int noOfAirBag;
    int engineCapacity;
    int topSpeed;

    car(String make, String model, int engineCapacity){
        super(make,model);
        System.out.println("I am car cnstructor");
        this.make=make;
        this.model= model;
        this.engineCapacity=engineCapacity;
    }
}

class bus extends vehicle{
    boolean ac;
    int capacity;
    int weightCapacity;
    int noOfSeats;
    double rating;
    int seatOccupied;

    double utilisation(){
        return ((seatOccupied*100.0)/noOfSeats);
    }
}
class truck extends vehicle{
    boolean covered;
    int volCap;
    int engineCap;
    int weihtCap;
    int totalWeightCap;

    double utilise(){
        return ((weihtCap*100)/totalWeightCap);
    }
}


public class jan27oop {
    public static void main(String[] args) {
        // vehicle v=new vehicle();
        // v.numWheels=2;
        // v.make="bajaj";
        // v.model ="model";
        // System.out.println(v.convertToString());

        // truck t1=new truck();
        // System.out.println(t1.engineCap);

        // car c1=new car();
        // c1.engineCapacity=15;
        // c1.model="swift";
        // c1.topSpeed=205;
        // System.out.println(c1.topSpeed);

        // bus b1=new bus();
        // b1.ac=true;
        // b1.rating=4;
        // b1.model="volvo";
        // System.out.println(b1.ac);

        car c2=new car("kia", "seltos", 1550);
        c2.noOfAirBag=4;
        c2.sunRoof=false;
        System.out.println(c2.convertToString());
        // System.out.println(c2.noOfAirBag);
        System.out.println(c2);




    }   
}
