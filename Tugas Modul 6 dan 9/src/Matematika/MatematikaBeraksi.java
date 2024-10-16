/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matematika;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class MatematikaBeraksi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        Matematika matematika = new Matematika();
            System.out.println("Selamat Datang Di Aplikasi Matematika");
            System.out.println("Menu Aplikasi Matematika");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Pilih Menu(1-4) : ");
            int pilihan = masukan.nextInt();

            System.out.print("\nMasukkan Angka Pertama : ");
            double angkaPertama = masukan.nextDouble();
            System.out.print("Masukkan Angka Kedua   : ");
            double angkaKedua = masukan.nextDouble();
            
            switch (pilihan) {
                case 1:
                    matematika.pertambahan(angkaPertama, angkaKedua);
                    break;
                case 2:
                    matematika.pengurangan(angkaPertama, angkaKedua);
                    break;
                case 3:
                    matematika.perkalian(angkaPertama, angkaKedua);
                    break;
                case 4:
                    matematika.pembagian(angkaPertama, angkaKedua);
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                      break;
            }
    }
}
