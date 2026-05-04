import java.util.Arrays;
import java.util.Random;

public class studentid {
    public static void main(String[] args) {
        Random random = new Random();
        int studentID = random.nextInt(1000);
        System.out.println("Student ID: " + studentID);
        double marks = random.nextDouble() * 100;
        System.out.println("Marks: " + String.format("%.2f", marks));
        float attendance = random.nextFloat() * 100;
        System.out.println("Attendance: " + String.format("%.2f", attendance) + "%");
        boolean status = random.nextBoolean();
        String statusString = status ? "PASS" : "FAIL";
        System.out.println("Status: " + statusString);
        long registrationNumber = Math.abs(random.nextLong());
        System.out.println("Registration Number: " + registrationNumber);

        double performanceScore = random.nextGaussian() * 10;
        System.out.println("Performance Score: " + String.format("%.2f", performanceScore));

        byte[] randomBytes = new byte[5];
        random.nextBytes(randomBytes);
        System.out.println("Random Bytes: " + Arrays.toString(randomBytes));
        
      
    }
}
