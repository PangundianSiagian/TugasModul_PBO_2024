/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author Asus
 */
//java class ini merupakan pewarisan dari class matematika
public class MatematikaCanggih extends Matematika{
    String NIM;
    String Nama;
    
    MatematikaCanggih(String NIM, String Nama){
        NIM = NIM;
        Nama = Nama;
        
        System.out.println("NIM : "+NIM);
        System.out.println("Nama : "+Nama);
        System.out.println("");
    }
}
