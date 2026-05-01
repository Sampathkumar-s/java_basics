import java.util.*;  // Expense Tracker
class methoad2{
    public static void main(String[] args){
        
        String a;
        long b;
         long c=0;
        do { 
        System.out.print("Enter you task: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        System.out.print("Expense for the task: ");
        b = sc.nextLong();
        c += b;
        
        } while(b!=0);
        System.out.println("Total Expenses: "+c);
        
    }
}
class todo{
    void todolist()
    {
        
    }
}