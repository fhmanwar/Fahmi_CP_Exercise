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
public class L_Segitiga extends L_Bangun_Datar{
    protected double Luas,alas,tinggi;

    @Override
    protected void set_A(double a) {
        this.alas = a;
    }

    @Override
    protected void set_B(double b) {
        this.tinggi = b;
    }

    @Override
    protected void set_Luas() {
        Luas = (alas * tinggi)/2;
    }

    @Override
    protected double get_A() {
        return alas;
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
            System.out.println("Luas Bangun Datar Segitiga");
            System.out.println("Luas = ("+alas+" * "+tinggi+")/2 = "+Luas+" cm2");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }  
    }
}
