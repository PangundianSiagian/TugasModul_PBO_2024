/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;
/**
 *
 * @author Asus
 */
public class Bank {
    int saldo;
    
    Bank(int saldo) {
        this.saldo = saldo;
    }
    
    public void getSaldo() {
        System.out.println("Saldo saat ini : RP." + saldo);
    }
    
    public void simpanUang(int saldoSimpan) {
        this.saldo += saldoSimpan;
        System.out.println("Berhasil Menyimpan Uang : RP." + saldoSimpan);
        System.out.println("Saldo Anda adalah Rp: " + this.saldo);
    }

    public void ambilUang(int saldoAmbil) {
        if (saldoAmbil > this.saldo) {
            System.out.println("Saldo tidak mencukupi RP." + saldoAmbil);
        } else {
            this.saldo -= saldoAmbil;
            System.out.println("Berhasil Ambil Uang : RP." + saldoAmbil);
            System.out.println("Saldo Anda adalah Rp: " + this.saldo);
        }
    }
}
