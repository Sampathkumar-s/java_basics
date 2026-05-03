import java.util.Arrays;
class manualarrc{
    public static void main(String[] args) {
        int ra[] = {1,2,3,4,5};
        int ra1[] = new int[ra.length];
        System.out.println("Original Array: "+Arrays.toString(ra));
        for(int i = 0; i < ra.length; i++) {
            ra1[i] = ra[i];
        }
         System.out.println("Manual copied Array: "+Arrays.toString(ra1));
    }
}