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
public class L_Lingkaran extends L_Bangun_Datar{
    protected double Luas,r;

    @Override
    protected void set_A(double a) {
        this.r = a;
    }

    @Override
    protected void set_B(double b) {
        this.r = b;
    }

    @Override
    protected void set_Luas() {
        Luas = r * r * 3.14;
    }

    @Override
    protected double get_A() {
        return r;
    }

    @Override
    protected double get_B() {
        return r;
    }

    @Override
    protected double get_Luas() {
        return Luas;
    }

    @Override
    protected void Hasil() {
        try {
            System.out.println("Luas Bangun Datar Lingkaran");
            System.out.println("Luas = "+r+" * "+r+" * 3.14 = "+Luas+" cm2");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }  
    }
}
