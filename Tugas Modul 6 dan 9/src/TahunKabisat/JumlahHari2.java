/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TahunKabisat;

/**
 *
 * @author Asus
 */
public class JumlahHari2 {
    
    public int hitungHari(int tahun, int bulan) {
        int jumlahHari = 0;
        switch (bulan) {
            case 1:
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case 2:
                if ((tahun % 400 == 0) || ((tahun % 4 == 0) && (tahun % 100 != 0))) {
                    jumlahHari = 29; // Februari pada tahun kabisat
                } else {
                    jumlahHari = 28; // Februari pada tahun non-kabisat
                }
                break;
            case 3:
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case 4:
                jumlahHari = 30; // Bulan dengan 30 hari
                break;
            case 5:
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case 6:
                jumlahHari = 30; // Bulan dengan 30 hari
                break;
            case 7:
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case 8:
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case 9:
                jumlahHari = 30; // Bulan dengan 30 hari
                break;
            case 10:
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            case 11:
                jumlahHari = 30; // Bulan dengan 30 hari
                break;
            case 12:
                jumlahHari = 31; // Bulan dengan 31 hari
                break;
            default:
                System.out.println("Bulan tidak valid.");
                break;
        }
        return jumlahHari;
    }
}

