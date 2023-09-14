import java.util.Scanner;
public class PalindromeString {
    public static boolean isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str1 = s.nextLine();
        System.out.println(isPalindrome(str1)); // true
        
    }
}
