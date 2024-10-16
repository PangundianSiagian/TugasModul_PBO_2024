/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatarRuang;

/**
 *
 * @author Asus
 */
public class BangunDatar {
    //Mendeklarasikan Variabel
    float phi;
    float kelilingPersegiPanjang,luasPersegiPanjang;
    float kelilingSegitiga,luasSegitiga;
    float kelilingLingkaran,luasLingkaran;
    float kelilingPersegiEmpat,luasPersegiEmpat;
    
    //Menambahkan Method Menghitung persegi panjang
    public void persegiPanjang(int a, int b){
        kelilingPersegiPanjang = 2*(a+b);
        luasPersegiPanjang = a*b;
        
        System.out.println("Keliling Persegi Panjang = "+kelilingPersegiPanjang );
        System.out.println("Luas Persegi Panjang = "+luasPersegiPanjang );
        System.out.println("");
    }
    //Menambahkan Method Menghitung Segitiga
    public void segitiga(int a, int b, int c){
        kelilingSegitiga = a+b+c;
        
        System.out.println("Keliling Segitiga = "+kelilingSegitiga);
    }
    public void segitiga(int alas, int tinggi){
        luasSegitiga = (alas*tinggi)/2;
        
        System.out.println("Luas Segitiga = "+luasSegitiga);
        System.out.println("");
    }
    //Menambahkan Method lingkaran
    public void lingkaran(float r){
        phi = (float)3.14;
        float d = r*2;
        kelilingLingkaran = phi*d;
        luasLingkaran = phi*r*r;
                
        System.out.println("Keliling Lingkaran = "+kelilingLingkaran );
        System.out.println("Luas Lingkaran = "+luasLingkaran );
        System.out.println("");
    }
    //Menambahkan Method Persegi empat
    public void persegiEmpat(int s){
        kelilingPersegiEmpat = 4*s;
        luasPersegiEmpat = s*s;
                
        System.out.println("Keliling Persegi Empat = "+kelilingPersegiEmpat );
        System.out.println("Luas Lingkaran = "+luasPersegiEmpat );
        System.out.println("");
    }
}
