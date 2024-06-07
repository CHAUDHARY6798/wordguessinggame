public class SwapPairs {
    public static void main(String[] args) {
        String original = "manipulation";
        String swapped = swapPairs(original);
        System.out.println("Original string: " + original);
        System.out.println("Swapped string: " + swapped);
    }
    
    public static String swapPairs(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }
        return new String(chars);
    }
}
///// inn cppp
//#include <iostream>
// #include <string>

// std::string swapPairs(const std::string& str) {
//     std::string swapped = str;
//     for (int i = 0; i < swapped.length() - 1; i += 2) {
//         char temp = swapped[i];
//         swapped[i] = swapped[i + 1];
//         swapped[i + 1] = temp;
//     }
//     return swapped;
// }

// int main() {
//     std::string original = "hello";
//     std::string swapped = swapPairs(original);
//     std::cout << "Original string: " << original << std::endl;
//     std::cout << "Swapped string: " << swapped << std::endl;
//     return 0;
// }

