import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<>();
        System.out.println(arr1 + " arr1 -> " + arr1.size());

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        System.out.println(arr1 + " arr1 -> " + arr1.size());
        System.out.println(arr1.get(2));

        arr1.set(1,100);
        System.out.println(arr1 + " arr1 -> " + arr1.size());

        // declaring an arraylist of a given list
        ArrayList<Integer> arr2= new ArrayList<>(List.of(6,5,4,3,2,1));
        System.out.println(arr2 + " arr2 size -> " + arr2.size());

        arr2.remove(arr2.size() - 5 );
        System.out.println(arr2 + " arr2 size -> " + arr2.size());
        System.out.println(arr2.isEmpty());


        



        
    }
}


