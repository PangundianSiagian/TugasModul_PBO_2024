/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatarRuang;

/**
 *
 * @author Asus
 */
//java class ini merupakan pewarisan dari class BangunDatar
public class BangunRuang extends BangunDatar {
    float luasPermukaan, volume;
    //Menambahkan Method menghitung Balok
    public void balok (int p, int l, int t){
        luasPermukaan = 2*((p*1)+(l*t)+(p*t));
        volume = p*l*t;
        
        System.out.println("Luas Permukaan Balok = "+luasPermukaan);
        System.out.println("Volume Balok = "+volume);
        System.out.println("");
    }
    //Menambahkan Method menghitung prisma
    public void prisma (int alas, int tinggi, int tinggiprisma){
        luasPermukaan = (2*luasSegitiga)+(kelilingSegitiga*tinggi);
        volume = (alas*tinggi)/2*tinggiprisma;
        
        System.out.println("Luas Permukaan prisma = "+luasPermukaan);
        System.out.println("Volume prisma = "+volume);
        System.out.println("");
    }
    //Menambahkan Method menghitung tabung
    public void tabung (float r, int tinggi){
        luasPermukaan = (2*phi*r*tinggi)+luasLingkaran;
        volume = luasLingkaran*tinggi;
        
        System.out.println("Luas Permukaan Tabung = "+luasPermukaan);
        System.out.println("Volume Tabung = "+volume);
        System.out.println("");
    }
    //Menambahkan Method menghitung kubus
    public void kubus (int s){
        luasPermukaan = 6*luasPersegiEmpat;
        volume = luasPersegiEmpat*s;
        
        System.out.println("Luas Permukaan Kubus = "+luasPermukaan);
        System.out.println("Volume Kubus = "+volume);
        System.out.println("");
    }
}
