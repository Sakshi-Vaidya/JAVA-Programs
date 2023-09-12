import java.util.Scanner;
public class ReverseString {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);  
      System.out.println("Enter the String: ");
      String str = s.nextLine();
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);
    }
}
