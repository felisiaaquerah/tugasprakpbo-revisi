
package felisiaaquerah;

import java.util.Scanner;

public class oplogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;

        Scanner keyboard = new Scanner(System.in);
        // konjungsi (dan)
        c = a && b;
        System.out.println("true && false =" + c);

        // disjungsi (atau)
        c = a || b;
        System.out.println("true || false = " + c);

        // negasi (bukan)
        System.out.println("Negasi, !true = " + !a);

    }
}