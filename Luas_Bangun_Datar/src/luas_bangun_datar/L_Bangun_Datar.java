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
public abstract class L_Bangun_Datar {
    protected double Luas,a,b;
    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_Luas();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_Luas();
    protected abstract void Hasil();
}
