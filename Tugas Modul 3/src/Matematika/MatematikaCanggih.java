/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Asus
 */
//Kelas Inherit dari Matematika dan Menambahkan Method Modulus
public class MatematikaCanggih extends Matematika{
    
   //Membuat Method Modulus
    public void modulus (int a, int b){
        System.out.println(+ a + " % "+ b + " = "+(a%b));
    }
}
