// Print a first charater from the user input

import java.util.*;
class firstchar{
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(n.charAt(0));

    }
}