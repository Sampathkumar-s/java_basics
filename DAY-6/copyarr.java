import java.util.Arrays;
class copyarr{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = new int[a.length];
        
         System.arraycopy(a,0,b,0,5);
       for (int i = 0; i <a.length; i++) {
           System.out.println(b[i]);
       }
       int c[] = new int[a.length];
       c = Arrays.copyOf(a, 5);
       for (int i = 0; i <a.length; i++) {
           System.out.println(c[i]);
       }
       int d[] = a.clone();
       System.out.println(Arrays.toString(d));
    }
}