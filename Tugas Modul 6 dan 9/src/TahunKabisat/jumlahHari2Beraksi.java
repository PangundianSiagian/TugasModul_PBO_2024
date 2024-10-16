/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TahunKabisat;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class jumlahHari2Beraksi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        JumlahHari2 jumlahHariObjek = new JumlahHari2();

        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();
        
        System.out.print("Masukkan bulan: ");
        int bulan = scanner.nextInt();
        
        int jumlahHari = jumlahHariObjek.hitungHari(tahun, bulan);
        
        if (bulan >= 1 && bulan <= 12) {
            System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah " + jumlahHari + " hari.");
        } else {
            System.out.println("Input bulan tidak valid.");
        }
    }
}
