/*Diagonal 

        *

      *

    *

  *

*             */

package Patterns;

public class Star {

public static void main(String[] args) {

int i, j;

for (i = 1; i <= 5; i++) {

for (j = 0; j < 5 - i; j++) {

System.out.print("  "); //Print blank space

}

System.out.print("*"); //Print Star and newline

}

}

}
