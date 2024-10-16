/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Overloading;

/**
 *
 * @author Asus
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menambahkan objek baru Mc dari MatematikaCanggih
        MatematikaCanggih Mc = new MatematikaCanggih("202163","Kelompok 3");
        //Memanggil Method Pertambahan
        Mc.pertambahan(4, 5);
        //Memanggil Method Pertambahan overloading
        Mc.pertambahan(12.5, 28.7, 14.2);
        //Memanggil Method Pengurangan
        Mc.pengurangan(10, 3);
        //Memanggil Method Pengurangan Overloading
        Mc.pengurangan(12.6, 28, 14);
        //Memanggil Method Perkalian
        Mc.perkalian(4, 10);
        //Memanggil Method Pembagian
        Mc.pembagian(10, 5);
        //Memanggil Method Modulus
        Mc.modulus(9, 2);
    }   
}
