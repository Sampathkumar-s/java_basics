import java.util.*;  // Expense Tracker
class methoad2{
    public static void main(String[] args){
        
        String a;
        long b=0;
         long c=0;
         int x;
        do { 
        System.out.print("Enter you task: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        System.out.print("Expense for the task: ");
        b = sc.nextLong();
        c += b;
        System.out.print("Do you want to continue(yes:1/No:0): ");
         x = sc.nextInt();
        } while(x==1);
        System.out.println("Total Expenses: "+c);
        
    }
}
