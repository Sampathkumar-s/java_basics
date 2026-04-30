import java.util.*;
class userinput{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String a = s.nextLine();
       
        System.out.print("Enter a age: ");
         byte b = s.nextByte();
       
        System.out.print("Enter a Phone number: ");
         long c = s.nextLong();
       
        System.out.print("Enter a salary : ");
         Double d = s.nextDouble();
         s.nextLine();
        System.out.print("address: ");
        String e = s.nextLine();
        

        System.out.println("Name    :"+a);
        System.out.println("age     :"+b);
        System.out.println("Ph no   :"+c);
        System.out.println("Salary  :"+d);
        System.out.println("address :"+e);
    }
}