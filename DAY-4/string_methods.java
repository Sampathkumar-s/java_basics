
class string_methods {
    public static void main(String[] args) {
        
        // Example 1: length() method
        System.out.println("=== length() Method ===");
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "";
        
        System.out.println("str1 = \"Hello\" -> length = " + str1.length());     // Output: 5
        System.out.println("str2 = \"Java\" -> length = " + str2.length());      // Output: 4
        System.out.println("str3 = \"\" -> length = " + str3.length());          // Output: 0
        
        System.out.println("\n=== isEmpty() Method ===");
        // Example 2: isEmpty() method
        // isEmpty() returns true if string length is 0, false otherwise
        // Available in Java 6+
        
        String empty = "";
        String notEmpty = "Hello";
        String space = " ";
        
        System.out.println("empty = \"\" -> isEmpty() = " + empty.isEmpty());           // Output: true
        System.out.println("notEmpty = \"Hello\" -> isEmpty() = " + notEmpty.isEmpty()); // Output: false
        System.out.println("space = \" \" -> isEmpty() = " + space.isEmpty());          // Output: false (has 1 space)
        
        System.out.println("\n=== isBlank() Method ===");
        // Example 3: isBlank() method
        // isBlank() returns true if string is empty OR contains only whitespace
        // Available in Java 11+
        
        String blank1 = "";
        String blank2 = "   ";
        String blank3 = "\t\n";  // tabs and newlines
        String notBlank = "  Hello  ";
        
        System.out.println("blank1 = \"\" -> isBlank() = " + blank1.isBlank());              // Output: true
        System.out.println("blank2 = \"   \" -> isBlank() = " + blank2.isBlank());          // Output: true
        System.out.println("blank3 = \"\\t\\n\" -> isBlank() = " + blank3.isBlank());       // Output: true
        System.out.println("notBlank = \"  Hello  \" -> isBlank() = " + notBlank.isBlank()); // Output: false
        
        System.out.println("\n=== Comparison Table ===");
        System.out.println("String\t\tlength()\tisEmpty()\tisBlank()");
        System.out.println("\"\"   \t\t0\t\ttrue\t\ttrue");
        System.out.println("\"   \"\t\t3\t\tfalse\t\ttrue");
        System.out.println("\"\\t\\n\" \t\t2\t\tfalse\t\ttrue");
        System.out.println("\"Hello\"\t\t5\t\tfalse\t\tfalse");
        
        System.out.println("\n=== Real-World Example ===");
        // Practical usage
        String userInput = "  ";
        
        if (userInput.isEmpty()) {
            System.out.println("String is empty");
        } else if (userInput.isBlank()) {
            System.out.println("String contains only whitespace - not valid!");
        } else {
            System.out.println("Valid input: " + userInput);
        }
        
    }
}
