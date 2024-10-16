/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Looping;
/**
 *
 * @author Asus
 */
public class PernyataanFor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Bilangan Genap antara 1 sampai 20 menggunakan Pernyataan FOR:");
        for (int i = 1; i <= 20; i++) {
           if(i % 2 == 0){
                System.out.println("\n"+i+" Adalah Bilangan Genap ");
           }
        }
        System.out.println(); 
    }  
}