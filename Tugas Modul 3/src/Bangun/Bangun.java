/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bangun;
import BangunDatarRuang.BangunRuang;
/**
 *
 * @author Asus
 */
public class Bangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek baru Br dari BangunRuang
        BangunRuang Br = new BangunRuang();
        //Memanggil Method Persegi panjang
        Br.persegiPanjang(4, 6);
        //Memanggil Method segitiga
        Br.segitiga(5, 2, 6);
        Br.segitiga(5, 8);
        //Memanggil Method Lingkaran
        Br.lingkaran((float) 3.5);
        //Memanggil Method Persegi Empat
        Br.persegiEmpat(6);
        //Memanggil Method Balok
        Br.balok(10, 2, 5);
        //Memanggil Method Prima
        Br.prisma(5, 8, 3);
        //Memanggil Method Tabung
        Br.tabung((float) 3.5, 5);
        //Memanggil Method Kubus
        Br.kubus(10);
    }
}
