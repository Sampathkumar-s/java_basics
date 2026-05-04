public class profilecreator {
    public static void main(String[] args) {
        String firstName = "Arun";
        String city = "Chennai";
        String hobby = "Cricket";
        
        StringBuilder bio = new StringBuilder();
        bio.append(firstName).append(" FROM ").append(city).append(" LOVES ").append(hobby);
        
        System.out.println(bio.toString().toUpperCase());
    }
}
