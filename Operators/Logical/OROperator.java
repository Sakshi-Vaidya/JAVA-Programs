import java.util.*;

class OROperator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input the three sides of the triangle: ");

    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();

    sc.close();

    if (p + q <= r || p + r <= q || q + r <= p) {
      System.out.println("Invalid Triangle");
    } 
    else {
      System.out.println("Valid Triangle");
    }
  }
}
