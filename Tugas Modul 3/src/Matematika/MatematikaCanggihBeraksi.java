/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matematika;

/**
 *
 * @author Asus
 */
public class MatematikaCanggihBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek baru Mtk
        MatematikaCanggih Mtk = new MatematikaCanggih ();
        //Memanggil method Pertambahan
        Mtk.pertambahan(50, 50);
        //Memanggil method Perkurangan
        Mtk.pengurangan(20, 15);
        //Memanggil method Perkalian
        Mtk.perkalian(40, 2);
        //Memanggil Method Pembagian
        Mtk.pembagian(24, 2);
        //Memanggil Method Modulus
        Mtk.modulus(9, 2);
    }
}
