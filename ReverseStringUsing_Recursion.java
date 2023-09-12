import java.util.Scanner;
public class ReverseStringUsing_Recursion {

    public static String ReverseStringUsing_Recursion(String str) {
        if (str.length() == 0) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str =s.nextLine();
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);
    }
}
