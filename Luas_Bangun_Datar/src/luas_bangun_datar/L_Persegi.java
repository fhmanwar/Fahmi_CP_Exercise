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
public class L_Persegi extends L_Bangun_Datar {
    protected double Luas,sisi_1,sisi_2;

    @Override
    protected void set_A(double a) {
        this.sisi_1 = a;
    }

    @Override
    protected void set_B(double b) {
        this.sisi_2 = b;
    }

    @Override
    protected void set_Luas() {
        Luas = sisi_1 * sisi_2;
    }

    @Override
    protected double get_A() {
        return sisi_1;
    }

    @Override
    protected double get_B() {
        return sisi_2;
    }

    @Override
    protected double get_Luas() {
        return Luas;
    }

    @Override
    protected void Hasil() {
        try {
            System.out.println("Luas Bangun Datar Persegi");
            System.out.println("Luas = "+sisi_1+" * "+sisi_2+" = "+Luas+" cm2");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }  
    }
    
}
