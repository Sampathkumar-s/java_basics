import java.util.*;
class charactercheck{
    public static void main(String[] args) {
        System.out.print("Enter a charater: ");
        Scanner s = new Scanner(System.in);
        int a = s.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
            System.out.println("You enter a vowel");
        }
        else{
            System.out.println("You Entered a Constant");
        }
    }
}