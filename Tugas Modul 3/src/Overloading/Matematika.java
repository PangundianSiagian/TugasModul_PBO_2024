/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author Asus
 */
public class Matematika {
    //Mendeklarasikan Variabel
    int a, b;
    int tambah, kurang, kali, bagi, modulus;
    //Overloading dari pertambahan dan pengurangan
    double tambah1, kurang1;
    
    //Menambahkan Method untuk pertambahan
    public void pertambahan(int a, int b) {
        tambah = a+b;
        System.out.println("Hasil pertambahan "+a+ "+" +b+" = "+tambah);
        System.out.println("");
    }
    //Menambahkan Method untuk Pertambahan Overloading
    public void pertambahan (double a, double b, double c) {
        tambah1 = a+b+c;
        System.out.println("Hasil pertambahan "+a+ " + " +b+ " + " +c+ " = " +tambah1);
        System.out.println("");
    }
    //Menambahkan Method untuk Pengurangan
    public void pengurangan(int a, int b){
        kurang = a-b;
        System.out.println("Hasil pengurangan "+a+ " - " +b+" = "+kurang);
        System.out.println("");
    }
    //Menambahkan Method untuk Pengurangan Overloading
    public void pengurangan(double a, double b, double c){
        kurang1 = a-b-c;
        System.out.println("Hasil pengurangan "+a+ " - " +b+ " - " +c+ " = "+kurang1);
        System.out.println("");
    }
    //Menambahkan Method untuk Perkalian
    public void perkalian(int a, int b){
        kali = a*b;
        System.out.println("Hasil Perkalian "+a+ " * " +b+ " = "+kali );
        System.out.println("");
    }
    //Menambahkan Method untuk pembagian
    public void pembagian(int a, int b){
        bagi = a/b;
        System.out.println("Hasil Pembagian "+a+ " / " +b+ " = "+bagi );
        System.out.println("");
    }
    //Menambahkan Method untuk modulus
    public void modulus(int a, int b){
        modulus = a%b;
        System.out.println("Hasil Modulus "+a+ " % " +b+ " = "+modulus );
        System.out.println("");
    }
}
