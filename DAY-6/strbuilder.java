class strbuilder{
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder();
        System.out.println("append :");
        sc.append("Sampath");
        System.out.println(sc);
        System.out.println("replace: ");
         sc.replace(0, 2, "hi");
         System.out.println(sc);
         System.out.println("reverse: ");
        sc.reverse();
        System.out.println(sc);
        System.out.println("capacity: ");
        int a = sc.capacity();
        System.out.println(a);
        System.out.println("insert: ");
        sc.insert(0, "a");
        System.out.println(sc);
        System.out.println("delete: ");
        sc.delete(0,2);
        System.out.println(sc);
        System.out.println("Charater a the specific position: ");
        sc.charAt(2);
        System.out.println(sc);
        System.out.println("Trim to size: ");
        sc.trimToSize();
        System.out.println(sc);
         System.out.println("capacity: ");
        int b = sc.capacity();
        System.out.println(b);

    }
}