
import java.util.*;
class task4{
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.print("Enter a number1 : ");
        int a = age.nextInt(); // 
        Scanner age2 = new Scanner(System.in);
        System.out.print("Enter a number2 : ");
        int a2 = age2.nextInt();
        if(a>a2){
            System.out.println(a+" is the greater number");
        }
        else if(a==a2)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println(a2+" is the greater number");
        }
       
    }
}