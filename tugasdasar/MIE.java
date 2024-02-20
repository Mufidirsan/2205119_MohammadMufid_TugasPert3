package tugasdasar;

import java.util.Scanner;

public class MIE {
    public static void main(String[] args) {
        Scanner msk = new Scanner(System.in);

        System.out.println("Masukkan uang Anda: ");
        double uang = msk.nextDouble();

        System.out.println("Apakah ada kelas kuliah? (y untuk ada, n untuk tidak)");
        String kelasKuliah = msk.next();

        if (uang > 10000 && kelasKuliah.equals("n")) { 
            System.out.println("Anda bisa membeli migacoan!");
        } else {
            System.out.println("Anda tidak bisa membeli migacoan saat ini.");
        }
        
    } 
}


