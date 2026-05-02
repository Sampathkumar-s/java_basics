//  Check String Starts With Java


import java.util.*;
class startjava{
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
         if(n.startsWith("Java") || n.startsWith("java") ){
            System.out.println("Yes ");
        }
        else{
            System.out.println("No");
        }

    }
}