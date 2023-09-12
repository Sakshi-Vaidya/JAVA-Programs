import java.util.Scanner;
class Product_details
{
  public static void main(String a[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the ProductCode: ");
    int code=Integer.parseInt(s.nextLine());
    System.out.println("Enter the ProductName: ");
    String name=s.nextLine();
    System.out.println("Enter the ProductPrice:  ");
    Float price=s.nextLine();
    System.out.println("Enter the ProductQty: ");
    int qty=s.nextInt();
    System.out.println("=====Product Details=====");
    System.out.println("ProductCode:  "+code);
    System.out.println("ProductName:  "+name);
    System.out.println("ProductName:  "+price);
    System.out.println("ProductQty: "+qty);
  }
}
    
  
