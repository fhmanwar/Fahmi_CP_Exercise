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
public class L_Persegi_Panjang extends L_Bangun_Datar{

    protected double Luas,panjang,lebar;

    @Override
    protected void set_A(double a) {
        this.panjang = a;
    }

    @Override
    protected void set_B(double b) {
        this.lebar = b;
    }

    @Override
    protected void set_Luas() {
        Luas = panjang * lebar;
    }

    @Override
    protected double get_A() {
        return panjang;
    }

    @Override
    protected double get_B() {
        return lebar;
    }

    @Override
    protected double get_Luas() {
        return Luas;
    }

    @Override
    protected void Hasil() {
        try {
            System.out.println("Luas Bangun Datar Persegi Panjang");
            System.out.println("Luas = "+panjang+" * "+lebar+" = "+Luas+" cm2");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }  
    }
    
}
