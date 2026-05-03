import java.util.Scanner;
class abst{
    public static void main(String[] args) {
        sample o = new sample();
        Scanner sc = new Scanner(System.in);
       int  pin_no = 2006;
      System.out.print("Enter your pin: ");
      int pin = sc.nextInt();
        if(pin == 2006){
           while(true){
               System.out.println("1.Check Balance\n2.Deposite\n3.Exit ");
               System.out.print("Enter Your choice: ");
               double choice = sc.nextDouble();
               if (choice == 1)
           {
            System.out.println(o.getbalance());
           } 
           else if(choice == 2)
           {
            System.out.print("Enter the amount for deposit: ");
            double rupee = sc.nextDouble();
            o.deposit(rupee);
           }
            else if(choice == 3)
           {
            System.out.println("Transaction Completed");
            break;
           }
           }         
           
        }
        else{
            System.out.println("Incorrect Pin!");
        }


    }
}

class sample{
    private double balance = 3000.10;

    double getbalance(){
        return balance;
        
    }

    void deposit(double amt){
        balance += amt;
        System.out.println(balance);
    }
}