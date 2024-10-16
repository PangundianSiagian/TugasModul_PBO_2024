/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pangundian siagian
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        
        bank.getsaldo();
        System.out.println("                    ");
        bank.simpanUang(500000);
        bank.getsaldo();
        System.out.println("                    ");
        bank.ambilUang(150000);
        bank.getsaldo();
    }
    
}
