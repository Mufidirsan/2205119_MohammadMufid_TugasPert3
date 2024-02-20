package tugasdasar;

import java.util.Scanner;

public class OperasiMtk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        float hasil_jumlah, hasil_kurang, hasil_kali, hasil_bagi;

        System.out.print(" bilangan kesatu: ");
        num1 = input.nextInt();
        System.out.print(" bilangan kedua: ");
        num2 = input.nextInt();
        System.out.print(" bilangan ketiga: ");
        num3 = input.nextInt();

        hasil_jumlah = num1 + num2 + num3;
        hasil_kurang = num1 - num2 - num3;
        hasil_kali = num1 * num2 * num3;
        hasil_bagi = (float) num1 / num2 / num3;

        System.out.println("Hasil penjumlahan: " + hasil_jumlah);
        System.out.println("Hasil pengurangan: " + hasil_kurang);
        System.out.println("Hasil perkalian: " + hasil_kali);
        System.out.println("Hasil pembagian: " + hasil_bagi);

        
    }
    
}
