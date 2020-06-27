/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas_bangun_datar;

import java.util.Scanner;

/**
 *
 * @author iBoy
 */
final class Luas_Bangun_Datar {
    
    private void cetak_semua(L_Bangun_Datar L_BD, double a, double b){
        L_BD.set_A(a);
        L_BD.set_B(b);
        L_BD.set_Luas();
        L_BD.Hasil();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Luas_Bangun_Datar Hasil_Luas = new Luas_Bangun_Datar();
        Scanner in = new Scanner(System.in); 
        int pilih;
            
        while(true){
            System.out.println("1. Hitung Luas Persegi");
            System.out.println("2. Hitung Luas Persegi Panjang");
            System.out.println("3. Hitung Luas Segitiga");
            System.out.println("4. Hitung Luas Lingkaran");
            System.out.println("5. Hitung Luas Trapesium");
            System.out.println("6. Keluar Program");
            System.out.print("Masukkan pilihan anda [1-6] : ");
            pilih = in.nextInt();

            try {
                switch(pilih){
                    case 1:
                        L_Persegi persegi = new L_Persegi();

                        System.out.println("========================================");
                        System.out.println("");
                        System.out.print ("Masukan sisi :");
                        Double sisi = in.nextDouble();
                        Hasil_Luas.cetak_semua(persegi, sisi, sisi);
                        System.out.println("");
                        System.out.println("========================================");
                        break;

                    case 2: 
                        L_Persegi_Panjang persegi_panjang = new L_Persegi_Panjang();

                        System.out.println("========================================");
                        System.out.println("");
                        System.out.print ("Masukan Panjang :");
                        Double panjang = in.nextDouble();
                        System.out.print ("Masukan Lebar :");
                        Double lebar = in.nextDouble();
                        Hasil_Luas.cetak_semua(persegi_panjang, panjang, lebar);
                        System.out.println("");
                        System.out.println("========================================");
                        break;

                    case 3:
                        L_Segitiga segitiga = new L_Segitiga();

                        System.out.println("========================================");
                        System.out.println("");
                        System.out.print ("Masukan Alas :");
                        Double alas = in.nextDouble();
                        System.out.print ("Masukan Tinggi :");
                        Double tinggi = in.nextDouble();
                        Hasil_Luas.cetak_semua(segitiga, alas, tinggi);
                        System.out.println("");
                        System.out.println("========================================");
                        break;

                    case 4: 
                        L_Lingkaran lingkaran = new L_Lingkaran();

                        System.out.println("========================================");
                        System.out.println("");
                        System.out.print ("Masukan Jari - Jari :");
                        Double r = in.nextDouble();
                        Hasil_Luas.cetak_semua(lingkaran, r, r);
                        System.out.println("");
                        System.out.println("========================================");
                        break;

                    case 5:
                        L_Trapesium trapesium = new L_Trapesium();

                        System.out.println("========================================");
                        System.out.println("");
                        System.out.print ("Masukan sisi A :");
                        Double sisi_A = in.nextDouble();
                        System.out.print ("Masukan sisi B :");
                        Double sisi_B = in.nextDouble();
                        System.out.print ("Masukan tinggi :");
                        Double tinggi_Trapesium = in.nextDouble();
                        Double jumlah_sisi = sisi_A + sisi_B;
                        Hasil_Luas.cetak_semua(trapesium, jumlah_sisi, tinggi_Trapesium);
                        System.out.println("");
                        System.out.println("========================================");
                        break;

                    case 6: 
                        System.out.println("Exiting Program...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println(pilih + " is not a valid Menu Option! Please Select Another.");
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Input can't use string");

            }

        }
    }
    
}
