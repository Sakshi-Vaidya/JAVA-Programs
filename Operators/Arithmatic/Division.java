import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        System.out.print("Enter the 1st number: ");
        int a=s.nextInt();
        
        System.out.print("Enter the 2nd number: ");
        int b=s.nextInt();
        
        int c =a/b;
        System.out.println("Division: "+c);
    }
}
