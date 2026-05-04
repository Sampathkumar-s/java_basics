import java.util.Random;

public class lottery {
    public static void main(String[] args) {
        String[] customers = {"Arun", "Bala", "Cathy", "Divya", "Eshan"};
        
        Random random = new Random();
        int winnerIndex = random.nextInt(customers.length);
        String winner = customers[winnerIndex];
        
        System.out.println("Winner is: " + winner);
    }
}
