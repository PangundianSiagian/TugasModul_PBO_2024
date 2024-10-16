/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MatematikaInheritence;

/**
 *
 * @author Asus
 */
public class MatematikaCanggihBangetBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Membuat objek dari kelas MatematikaCanggihBanget
        MatematikaCanggihBanget Mtk = new MatematikaCanggihBanget();
        
        // Memanggil method pertambahan
        Mtk.pertambahan(5, 10);
        // Memanggil method perkalian
        Mtk.perkalian(5, 10);
        // Memanggil method modulus
        Mtk.modulus(10, 3);     
        // Memanggil method pertambahanTiga
        Mtk.pertambahanTiga(1, 2, 3);
    }
}
