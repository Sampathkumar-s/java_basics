// To-do list 
import java.util.*;  
class todolist{
    public static void main(String[] args){
        
        String a[] = new String[3];
        
        
        for(int i=0;i<3;i++){
        System.out.print("Enter you task: ");
        Scanner sc = new Scanner(System.in);
        a[i] = sc.nextLine();
        }
        System.out.println("Your to do list :");
        for(int i=0;i<3;i++){
            System.out.println(a[i]);
        }

        
    }
}
