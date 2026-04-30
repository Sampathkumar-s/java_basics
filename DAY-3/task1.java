
import java.util.Scanner;
class task1{
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int sa = age.nextInt(); // 
       // int age = 20; //value assigned by me 
        if(sa>=18)
        {
            System.out.println("Your are Eligible for Voting");
        }
        else{
            System.out.println("Your are Not Eligible for Voting");
        }
    }
}