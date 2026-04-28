public class MyClass {
    String a;              // Instance variable
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.print(obj.a);  // ✓ Prints: 0 (default value)
    }
}