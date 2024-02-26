public class custom_Arraylist {
    public static void main(String[] args) {
        DynamicArray arr= new DynamicArray();
        for (int i = 0; i < 41; i++) {
            
            arr.add(i);
            System.out.println(arr.size() + " - " + arr.capacity()  );
        }
    }
}
class DynamicArray{
    private int arr[];
    private int capacity=10;
    private int size=0;

    DynamicArray(){
        arr = new int[10];
        size=0;
        capacity=10;
    }
    void add(int num){
        if(size==capacity){
         
            int newArr[]=new int[2*capacity];
            // copy the elements from old array
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];

                this.arr=newArr;
                capacity*=2;
            }
            arr[size]=num;
            size++;

        }
    }
    void remove_back(){
        if(size>0){
            this.arr[size-1]=0;
            size--;
        }
    }
void set(int id , int num){
    if(id>=0 && id<size){
        this.arr[id]=num;
    }
}
int get(int id){
    if(id>=0 && id<size){
        return this.arr[id];
    }
    return -1;
}
int size(){
    return this.size;
}
int capacity(){
    return this.capacity;
}
}
