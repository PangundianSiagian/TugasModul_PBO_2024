/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mahasiswa;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Mahasiswa3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        Mahasiswa2 mahasiswa = new Mahasiswa2();

        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = masukan.nextLine();

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = masukan.nextLine();

        System.out.print("Masukkan Nilai Absen (10%): ");
        double nilaiAbsen = masukan.nextDouble();

        System.out.print("Masukkan Nilai Tugas (20%): ");
        double nilaiTugas = masukan.nextDouble();

        System.out.print("Masukkan Nilai UTS (30%): ");
        double nilaiUTS = masukan.nextDouble();

        System.out.print("Masukkan Nilai UAS (40%): ");
        double nilaiUAS = masukan.nextDouble();

        double na = mahasiswa.nilaiAkhir(nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS);
        String grade = mahasiswa.Grade(na);

        System.out.println("\n=====SELAMAT KEPADA MAHASISWA=====");
        System.out.println("NIM Mahasiswa  : "+ nim);
        System.out.println("Nama Mahasiswa : "+ nama);
        System.out.println("Nilai Akhir    : "+ na);
        System.out.println("Grade          : "+ grade);
    }
}
