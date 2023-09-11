import java.util.Scanner;
class Student_details
{
  public static void main(String a[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Username: ");
    String name=s.nextLine();
    System.out.println("Enter the Email: ");
    String email=s.nextLine();
    System.out.println("Enter the Phone no:  ");
    Long phno=s.nextLong();
    System.out.println("=====Details=====");
    System.out.println("Username:  "+name);
    System.out.println("Email:  "+email);
    System.out.println("Phone_No:  "+phno);
  }
}
    
  
