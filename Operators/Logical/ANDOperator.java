import java.util.Scanner;

class ANDOperator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();

    if ((p > q) && (p > r)) {
      System.out.println("Maximum: " + p);
    } 
    else if ((q > p) && (q > r)) {
      System.out.println("Maximum: " + q);
    } 
    else {
      System.out.println("Maximum: " + r);
    }
  }
}
