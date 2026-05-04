class excehand{
    public static void main(String[] args) {
        int a  = 5;
       try {
            int b = 5/0;
       } catch (Exception e) {
        System.out.println(e);
       }
       try {
           String s=null;
           System.out.println(s.length());
       } catch (Exception e) {
         System.out.println(e);
       }
       int arr[] = {1,2,3,4,5};
       try {
           arr[8]=5;
       } catch (Exception e) {
        System.out.println(e);
       }
      
       try {
            String s[] = {};
            System.out.println(s[0]);
       } catch (Exception e) {
        System.out.println(e);
       }
    //    try {
    //         String s[] = {};
    //         System.out.println(s[0]);
    //    } catch (Exception e) {
    //     System.out.println(e);
    //    }

    // for (int i = 0; i < arr.length; i++) {
    //     System.out.println(arr[i]);
        
    // }
    // System.out.println("Welcome");

        
    }
}