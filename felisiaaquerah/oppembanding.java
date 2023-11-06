
package felisiaaquerah;

import java.util.Scanner;

public class oppembanding {
    public static void main(String[] args) {
        int a = 400;
        int b = 150;
        boolean hasil;

        Scanner keyboard = new Scanner(System.in);
        
        //fungsi sama dengan
        hasil = a == b;
        System.out.println("Apakah a == b ? " + hasil);
        
        //fungsi tidak sama dengan
        hasil = a != b;
        System.out.println("Apakah a != b ? " + hasil);
        
        //fungsi lebih besar
        hasil = a > b;
        System.out.println("Apakah a > b ? " + hasil);
        
        //fungsi lebih kecil
        hasil = a < b;
        System.out.println("Apakah a < b ? " + hasil);
        
        //fungsi lebih besar sama dengan
        hasil = a >= b;
        System.out.println("Apakah a >= b ? " + hasil);
        
        //fungsi lebih kecil sama dengan
        hasil = a <= b;
        System.out.println("Apakah a <= b ? " + hasil);
    }

}
