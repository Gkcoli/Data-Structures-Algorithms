import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        DynamicArray dynamicArray = new DynamicArray(5);

       dynamicArray.add("A");
       dynamicArray.add("B");
       dynamicArray.add("C");
       dynamicArray.add("D");
       dynamicArray.add("E");
       dynamicArray.add("F");

       // if you want to delete to this
    //    dynamicArray.delete("A");
    //    dynamicArray.delete("F");

    //    dynamicArray.insert(0, "X");
    //    dynamicArray.delete("B");
    //    System.out.println(dynamicArray.search("C"));

       
       System.out.println(dynamicArray);
       System.out.println("size " + dynamicArray.size);
       System.out.println("capacity " + dynamicArray.capacity);
       System.out.println("empty: " + dynamicArray.isEmpty());

    }
}
