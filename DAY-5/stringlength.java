//string Length Check
import java.util.*;
class stringlength{
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if(n.length()>=5){
            System.out.println("Your String is long ");
        }
        else{
            System.out.println("Your string is short ");
        }


    }
}