/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasMandiri37;

/**
 *
 * @author Asus
 */
public class Penambahan2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mendeklarasikan Variabel
        int w,x,y,z;
        //Memberikan Variabel w dan x
        w = 5;
        x = 5;
        
        // y = 8 - x (nilai x sebelum peningkatan)
        // Kemudian, x akan bertambah 1 (x = x + 1)
        y = 8 - x++;
        
        // w akan bertambah 1 terlebih dahulu (w = w + 1)
        // Kemudian, z = 8 - w (nilai w setelah peningkatan)
        z = 8 - ++w;
        
        System.out.println("Menampilkan Nilai dari variabel w = "+w);
        System.out.println("Menampilkan Nilai dari variabel x = "+x);
        System.out.println("Menampilkan Nilai dari variabel y = "+y);
        System.out.println("Menampilkan Nilai dari variabel z = "+z);   
    }
}
