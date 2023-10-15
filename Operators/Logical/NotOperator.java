import java.util.*;

class NotOperator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int p = sc.nextInt();
    int q = sc.nextInt();
  
    System.out.println("p = " + p);
    System.out.println("q = " + q);
    
    System.out.println("!(p < q) = " + !(p < q));
    System.out.println("!(p > q) = " + !(p > q));
  }
}
