import java.util.Arrays;
import java.util.Random;

class rand{
    public static void main(String[] args) {
        Random rand = new Random();
        int ri = rand.nextInt(); 
        System.out.println("Random integer: " + ri);

        int r = rand.nextInt(100);
        System.out.println("Random integer between 0 and 99: " +
r);
        boolean randBool = rand.nextBoolean();
        System.out.println("Random boolean: " + randBool);
        double randDouble = rand.nextDouble();
        System.out.println("Random double between 0.0 and 1.0: " +
randDouble);
        long randLong = rand.nextLong();
        System.out.println("Random long: " + randLong);
        
        double Ga = rand.nextGaussian();
        System.out.println("Gassian : " +Ga);

        byte b[] = new byte[4];
        rand.nextBytes(b);
        System.out.println(Arrays.toString(b));

    }
}