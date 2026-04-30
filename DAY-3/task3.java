import java.util.*;
class task3{
    public static void main(String[] args) {
        System.out.print("Enter a Mark: ");
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        if(a>90 && a<=100){
            System.out.println("grade A");
        }
        else if(a>80 && a<=90){
            System.out.println("grade B");
        }
        else if(a>70 && a<=80){
            System.out.println("grade C");
        }
        else if(a>60 && a<=70){
            System.out.println("grade D");
        }
        else if(a>50 && a<=60){
            System.out.println("grade F");
        }
        else if(a>40 && a<=50){
            System.out.println("grade F");
        }
        else{
            System.out.println("Fail");
        }
    }
}