/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Segitiga;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class LuasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PROGRAM MENGHITUNG LUAS SEGITIGA");
        System.out.print("\nMasukan Nilai Alas Segitiga : ");
        double alas = masukan.nextDouble();
        
        System.out.print("\nMasukkan Nilai Tinggi Segitiga : ");
        double tinggi = masukan.nextDouble();
        
        double luas = (alas * tinggi) / 2;
        System.out.println("\nLuas Segitiga Adalah : " + luas);
    }
}
