
import java.util.Scanner;

class abst2{
    public static void main(String[] args) {
        login a = new login();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sakthi Travels!");
        System.out.print("Enter Your user name: ");
        String b = sc.nextLine();
        System.out.print("Enter Your password: ");
        int c = sc.nextInt();
        a.check(b,c);
        

    }
}
class login{
    private String username = "Dark_Prince";
    private  int login = 123456;

    int check(String b,int c){

        if(b.equals("Dark_Prince") && c==123456){

            System.out.println("Login Sucessfully");
            return 1;
        }
        else{
            System.out.println("Login Failed");
            return 0;
        }
     }
}