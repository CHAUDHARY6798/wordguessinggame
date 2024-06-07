public class ReverseString {
    public static void main(String[] args) {
        String original = "happy";
        String reversed = reverseString(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            // Move pointers
            left++;
            right--;
        }
        return new String(chars);
    }
}
// // public class Main {
//     public static void main(String[] args) {
//         String originalString = "Hello, world!";
//         String reversedString = reverseString(originalString);
//         System.out.println("Original string: " + originalString);
//         System.out.println("Reversed string: " + reversedString);
//     }
    
//     // Method to reverse a string
//     public static String reverseString(String str) {
//         StringBuilder reversed = new StringBuilder();
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed.append(str.charAt(i));
//         }
//         return
// //
