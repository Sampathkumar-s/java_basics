
import java.util.Scanner;
class task2{
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = age.nextInt(); // 
       if(a>0){
        System.out.println("Positive number");
       }
       else if(a<0){
        System.out.println("Negative number");
       }
       else{
        System.out.println("Zero");
       }
    }
}