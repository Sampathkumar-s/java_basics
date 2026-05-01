import java.util.*;
class methoad1{
    public static void main(String[] args){
        
        System.out.print("Enter you task: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        todo x = new todo();
        x.todolist(a);

    }
}
class todo{
    void todolist(String a)
    {
        if(a.isBlank())
        {
            System.out.println("You not enter any task");
            return;
        }

        else{
            System.out.println("your task: "+a);
            System.out.println("Thank you for entering the task");
        }
    }
}