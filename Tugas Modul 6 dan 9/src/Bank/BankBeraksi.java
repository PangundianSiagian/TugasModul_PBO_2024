/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bank;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        Bank rekening = new Bank(100000);
        int menu;
        System.out.println("\n=====SELAMAT DATANG DI BANK ABC=====");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Simpan Uang");
        System.out.println("3. Ambil Uang");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        menu = masukan.nextInt();
        
            switch (menu) {
                case 1:
                    rekening.getSaldo();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah uang yang ingin disimpan: RP.");
                    int simpan = masukan.nextInt();
                    rekening.simpanUang(simpan);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah uang yang ingin diambil: RP.");
                    int ambil = masukan.nextInt();
                    rekening.ambilUang(ambil);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan bank.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-4.");
            }
    }
}