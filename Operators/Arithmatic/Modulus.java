import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the 1st value: ");
        int a=s.nextInt();

        System.out.println("Enter the 2nd value: ");
        int b=s.nextInt();
        int c= a% b;
        System.out.println("Modulus: "+c);
    }
}
