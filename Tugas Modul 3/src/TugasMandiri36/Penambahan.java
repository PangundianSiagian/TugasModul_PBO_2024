/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasMandiri36;

/**
 *
 * @author Asus
 */
public class Penambahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mendeklarasikan Variabel
        int x, y, z;
        //Memberikan Nilai X adalah 42
        x = 42;
        // Nilai saat ini dari x (42) pertama kali diberikan ke y,
        // kemudian x ditambahkan 1 (x menjadi 43).
        y = x++;
        
        System.out.println("Menampilkan Nilai dari variabel x = "+ x);
        System.out.println("Menampilkan Nilai dari variabel y = "+ y);
        
        // x ditambahkan terlebih dahulu (x menjadi 44) dan kemudian nilainya diberikan ke z.
        z = ++x;
        System.out.println("Menampilkan Nilai dari Variabel z = "+ z);
    }
}
