import java.util.*;
class loop1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        do { 
            a = s.nextInt();
            System.out.println("user entered: "+a);
        } while (a!=0);
    }
}