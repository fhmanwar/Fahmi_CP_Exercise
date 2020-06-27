/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas_bangun_datar;

/**
 *
 * @author iBoy
 */
public class L_Trapesium extends L_Bangun_Datar{
    protected double Luas,jumlah_sisi,tinggi;

    @Override
    protected void set_A(double a) {
        this.jumlah_sisi = a;
    }

    @Override
    protected void set_B(double b) {
        this.tinggi = b;
    }

    @Override
    protected void set_Luas() {
        Luas = (jumlah_sisi * tinggi)/2;
    }

    @Override
    protected double get_A() {
        return jumlah_sisi;
    }

    @Override
    protected double get_B() {
        return tinggi;
    }

    @Override
    protected double get_Luas() {
        return Luas;
    }

    @Override
    protected void Hasil() {
        try {
            System.out.println("Luas Bangun Datar Trapesium");
            System.out.println("Luas = "+jumlah_sisi+" * "+tinggi+" = "+Luas+" cm2");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }  
    }
}
