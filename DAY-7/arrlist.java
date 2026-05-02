
import java.util.ArrayList;

class arrlist{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr);
        arr.add(1);
        arr.add(2);
        arr.add(33);
        System.out.println(arr);
        arr.set(0,7);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);

    }
}