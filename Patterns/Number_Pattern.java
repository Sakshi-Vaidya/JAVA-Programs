/*Number Pattern (Floyd's Triangle)

1 

2 3 

4 5 6 

7 8 9 10 

11 12 13 14 15  */

package Patterns;

public class Star {

public static void main(String[] args) {

int i, j, k = 1;

for (i = 1; i <= 5; i++) {

for (j = 1; j < i + 1; j++) {

System.out.print(k++ + " "); /Floyd’s triangle logic(prints K value and increments on every iteration)

}

System.out.println();

}

}

}
