
import java.util.ArrayList;
import java.util.Collections;
class arrlist{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr);
         System.out.println("Adding elements in array");
        arr.add(1);
        arr.add(2);
        arr.add(33);
        System.out.println(arr);
         System.out.println("Updating the Values");
        arr.set(0,7);
        System.out.println(arr);
         System.out.println("Removing the Value");
        arr.remove(2);
        System.out.println(arr);
      
        Collections.sort(arr); 
         System.out.println("Sorting the Array");
         System.out.println(arr);
        System.out.println("Contians Check in Array");
        System.out.println(arr.contains(1));
          // System.out.println(arr);

    }
}