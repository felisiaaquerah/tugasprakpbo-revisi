
package felisiaaquerah;

import java.util.Scanner;

public class opbitwise {

    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        // fungsi and
        hasil = a & b;
        System.out.println("Hasil dari a & b : " + hasil);
        
        // fungsi or
        hasil = a | b;
        System.out.println("Hasil dari a | b : " + hasil);
        
        // fungsi xor
        hasil = a ^ b;
        System.out.println("Hasil dari a ^ b : " + hasil);
        
        // fungsi negasi
        hasil = ~a;
        System.out.println("Hasil dari ~a : " + hasil);
        
        // fungsi left shift
        hasil = a << 2;
        System.out.println("Hasil dari a << 1 : " + hasil);
        
        // fungsi right shift
        hasil = a >> 1;
        System.out.println("Hasil dari a >> 1 : " + hasil);
        
        // right shift
        hasil = a >>> 2;
        System.out.println("Hasil dari a >>> 1 : " + hasil);

    }

}