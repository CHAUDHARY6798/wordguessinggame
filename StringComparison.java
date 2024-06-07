
import java .util.Scanner;

public class StringComparison {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the first string:");
        String str1=sc.nextLine();
        System.out.println("enter the second string:");
        String str2=sc.nextLine();
        // String str1="mehak";
        // String str2="meher";//
        if(str1.equals(str2)){
            System.out.println("strings are equal");

        }

    else{
        System.out.println("strings are not  equal");
    }




}
}





// import java.util.Scanner;

// public class StringComparison {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Enter the first string:");
//         String str1 = scanner.nextLine();
        
//         System.out.println("Enter the second string:");
//         String str2 = scanner.nextLine();
        
//         if (areStringsEqual(str1, str2)) {
//             System.out.println("Strings are equal");
//         } else {
//             System.out.println("Strings are not equal");
//         }
        
//         scanner.close();
//     }
    
//     public static boolean areStringsEqual(String str1, String str2) {
//         // Check lengths
//         if (str1.length() != str2.length()) {
//             return false;
//         }
        
//         // Check characters
//         for (int i = 0; i < str1.length(); i++) {
//             if (str1.charAt(i) != str2.charAt(i)) {
//                 return false;
//             }
//         }
        
//         // If both lengths are same and all characters are same, return true
//         return true;
//     }
// }



