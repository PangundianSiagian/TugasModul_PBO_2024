/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasMandiri43;

/**
 *
 * @author Asus
 */
public class PembandingUsia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Memberikan nilai
        int age = 36;
        
        // Melakukan perbandingan apakah age < 25
        // Hasilnya akan disimpan dalam variabel hasilBanding1
        boolean hasilBanding1 = age <25;
        
        // Melakukan perbandingan apakah age tidak sama dengan 26
        // Hasilnya akan disimpan dalam variabel hasilBanding2
        boolean hasilBanding2 = age != 26;
        
        System.out.println("Menampilkan Hasil Banding 1 apakah umur < 25 "+hasilBanding1);
        System.out.println("Menampilkan Hasil Banding 2 apakah umur tidak sama dengan 26? "+hasilBanding2);
    }  
}
