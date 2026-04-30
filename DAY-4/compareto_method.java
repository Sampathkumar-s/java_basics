import java.util.*;

class compareto_method {
    public static void main(String[] args) {
        
        System.out.println("=== compareTo() Method ===");
        System.out.println("compareTo() compares two strings lexicographically (dictionary order)");
        System.out.println("Returns: int value\n");
        
        // Example 1: Basic comparison
        System.out.println("--- Example 1: Basic String Comparison ---");
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";
        
        int result1 = str1.compareTo(str2);  // "Apple" vs "Banana"
        int result2 = str1.compareTo(str3);  // "Apple" vs "Apple"
        int result3 = str2.compareTo(str1);  // "Banana" vs "Apple"
        
        System.out.println("str1 = \"Apple\"");
        System.out.println("str2 = \"Banana\"");
        System.out.println("str3 = \"Apple\"");
        System.out.println();
        System.out.println("str1.compareTo(str2) = " + result1 + " (negative: str1 comes BEFORE str2)");
        System.out.println("str1.compareTo(str3) = " + result2 + " (zero: strings are EQUAL)");
        System.out.println("str2.compareTo(str1) = " + result3 + " (positive: str2 comes AFTER str1)");
        
        // Example 2: Understanding return values
        System.out.println("\n--- Example 2: Return Value Explanation ---");
        System.out.println("Negative (<  0) : First string is lexicographically BEFORE second");
        System.out.println("Zero (== 0)    : Both strings are EQUAL");
        System.out.println("Positive (> 0) : First string is lexicographically AFTER second");
        
        // Example 3: Case-sensitive comparison
        System.out.println("\n--- Example 3: Case-Sensitive Comparison ---");
        String lower = "apple";
        String upper = "Apple";
        
        System.out.println("lower = \"apple\"");
        System.out.println("upper = \"Apple\"");
        System.out.println("lower.compareTo(upper) = " + lower.compareTo(upper));
        System.out.println("Note: lowercase comes AFTER uppercase in ASCII");
        
        // Example 4: Case-insensitive comparison
        System.out.println("\n--- Example 4: Case-Insensitive Comparison ---");
        System.out.println("lower.compareToIgnoreCase(upper) = " + lower.compareToIgnoreCase(upper));
        System.out.println("Result: 0 (strings are equal when ignoring case)");
        
        // Example 5: Practical usage - Sorting
        System.out.println("\n--- Example 5: Sorting Strings (Using compareTo) ---");
        String[] fruits = {"Mango", "Apple", "Banana", "Cherry"};
        
        System.out.println("Original: " + Arrays.toString(fruits));
        
        // Simple bubble sort using compareTo
        for (int i = 0; i < fruits.length - 1; i++) {
            for (int j = 0; j < fruits.length - i - 1; j++) {
                if (fruits[j].compareTo(fruits[j + 1]) > 0) {
                    // Swap
                    String temp = fruits[j];
                    fruits[j] = fruits[j + 1];
                    fruits[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted:   " + Arrays.toString(fruits));
        
        // Example 6: More complex examples
        System.out.println("\n--- Example 6: More Comparisons ---");
        String s1 = "Hello";
        String s2 = "Hello World";
        String s3 = "Hello";
        
        System.out.println("\"Hello\".compareTo(\"Hello World\") = " + s1.compareTo(s2));
        System.out.println("(negative: \"Hello\" is substring, comes BEFORE \"Hello World\")");
        System.out.println();
        System.out.println("\"Hello\".compareTo(\"Hello\") = " + s1.compareTo(s3));
        System.out.println("(zero: strings are identical)");
        
        // Example 7: Practical use - Input validation/sorting
        System.out.println("\n--- Example 7: Practical Usage ---");
        String input1 = "Zebra";
        String input2 = "Apple";
        
        if (input1.compareTo(input2) > 0) {
            System.out.println(input1 + " comes AFTER " + input2 + " alphabetically");
        } else if (input1.compareTo(input2) < 0) {
            System.out.println(input1 + " comes BEFORE " + input2 + " alphabetically");
        } else {
            System.out.println(input1 + " is EQUAL to " + input2);
        }
        
        // Example 8: Comparison table
        System.out.println("\n--- Comparison Table ---");
        System.out.println("String 1\t\tString 2\t\tResult\t\tMeaning");
        System.out.println("\"Apple\"\t\t\"Apple\"\t\t0\t\tEqual");
        System.out.println("\"Apple\"\t\t\"Banana\"\t\t-1\t\tApple < Banana");
        System.out.println("\"Zebra\"\t\t\"Apple\"\t\t25\t\tZebra > Apple");
        System.out.println("\"abc\"\t\t\"abcd\"\t\t-1\t\tabc < abcd");
        
    }
}
