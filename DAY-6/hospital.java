import java.util.Scanner;
class hospital{
    public static void main(String[] args) {
        int ra[] = {101,102,103,104,105};
        System.out.println("Enter the patient ID: ");
        Scanner sc = new Scanner(System.in);
        int ra1 = sc.nextInt();
        int c = 0;
        for (int i = 0; i < ra.length; i++) {
            if(ra1==ra[i]){
                System.out.println("Patient found");
                c++;
            }
        }
        if(c==0){
            System.out.println("Patient Not Found");
        }
    }
}