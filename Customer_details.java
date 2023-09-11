import java.util.Scanner;
class Customer_details
{
  public static void main(String a[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the CustomerId: ");
    int id=Integer.parseInt(s.nextLine());
    System.out.println("Enter the CustomerName: ");
    String name=s.nextLine();
    System.out.println("Enter the Email:  ");
    String email=s.nextLine();
    System.out.println("Enter the PhoneNo: ");
    Long phno=s.nextLong();
    System.out.println("Enter the City: ");
    String city=s.nextLine();
    System.out.println("=====Customer Details=====");
    System.out.println("CustomerId:  "+id);
    System.out.println("CustomerName:  "+name);
    System.out.println("Email:  "+email);
    System.out.println("PhoneNo: "+phno);
    System.out.println("City: "+city);
  }
}
    
  
