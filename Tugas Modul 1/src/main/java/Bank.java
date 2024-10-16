/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pangundian siagian
 */
public class Bank {
    //Mendeklarasikan atribut 
    int saldo;
    
    Bank(int saldo){
        this.saldo=saldo;
    
}
public void getsaldo(){
    System.out.println("Saldo saat ini : RP."+saldo);
}

public void simpanUang(int saldoSimpan){
    this.saldo+=saldoSimpan;
    System.out.println("Simpan Uang : RP."+saldoSimpan);
}

public void ambilUang(int saldoAmbil){
    this.saldo-=saldoAmbil;
    System.out.println("Ambil Uang : RP."+saldoAmbil);
}

}