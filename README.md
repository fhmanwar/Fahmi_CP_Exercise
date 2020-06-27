# Fahmi_CP_Exercise

:: PSEUDOCODE Luas_Bangun_Datar ::

    void cetaksemua(L_Bangun_Datar L_BD,double a, double b):
        L_BD.set_A(a)
        L_BD.set_B(b)
        L_BD.set_Luas()
        L_BD.Hasil()

    void main(String[] args):
        int pilih
        while(true)
            output("1. Hitung Luas Persegi")
            output("2. Hitung Luas Persegi Panjang")
            output("3. Hitung Luas Segitiga")
            output("4. Hitung Luas Lingkaran")
            output("5. Hitung Luas Trapesium")
            output("6. Keluar Program")
            output("Masukkan pilihan anda [1-6] : ")

            input(pilih)
            try:
                switch(pilih):
                    case 1:
                        L_Persegi persegi = new L_Persegi()
                        output("========================================")
                        output("")
                        output("Masukan sisi :")
                        Double sisi = in.nextDouble()
                        Hasil_Luas.cetak_semua(persegi, sisi, sisi)
                        output("")
                        output("========================================")
                        break

                    case 2: 
                        L_Persegi_Panjang persegi_panjang = new L_Persegi_Panjang()

                        output("========================================")
                        output("")
                        output("Masukan Panjang :")
                        Double panjang = in.nextDouble()
                        output("Masukan Lebar :")
                        Double lebar = in.nextDouble()
                        Hasil_Luas.cetak_semua(persegi_panjang, panjang, lebar)
                        output("")
                        output("========================================")
                        break

                    case 3:
                        L_Segitiga segitiga = new L_Segitiga()

                        output("========================================")
                        output("")
                        output("Masukan Alas :")
                        Double alas = in.nextDouble()
                        output("Masukan Tinggi :")
                        Double tinggi = in.nextDouble()
                        Hasil_Luas.cetak_semua(segitiga, alas, tinggi)
                        output("")
                        output("========================================")
                        break

                    case 4: 
                        L_Lingkaran lingkaran = new L_Lingkaran()

                        output("========================================")
                        output("")
                        output("Masukan Jari - Jari :")
                        Double r = in.nextDouble()
                        Hasil_Luas.cetak_semua(lingkaran, r, r)
                        output("")
                        output("========================================")
                        break

                    case 5:
                        L_Trapesium trapesium = new L_Trapesium()

                        output("========================================")
                        output("")
                        output("Masukan sisi A :")
                        Double sisi_A = in.nextDouble()
                        output("Masukan sisi B :")
                        Double sisi_B = in.nextDouble()
                        output("Masukan tinggi :")
                        Double tinggi_Trapesium = in.nextDouble()
                        Double jumlah_sisi = sisi_A + sisi_B
                        Hasil_Luas.cetak_semua(trapesium, jumlah_sisi, tinggi_Trapesium)
                        output("")
                        output("========================================")
                        break

                    case 6: 
                        output("Exiting Program...")
                        System.exit(0)
                        break
                    default:
                        output(pilih + " is not a valid Menu Option! Please Select Another.")
                        break
            catch (Exception e) {
                output(e)
                output("Input can't use string")
        
        


:: PSEUDOCODE Persegi ::

    double Luas,sisi_1,sisi_2
    set_A(double a):
        this.sisi_1 = a
    set_B(double b):
        this.sisi_2 = b
    set_Luas():
        Luas = sisi_1 * sisi_2
    Hasil():
        try 
            output("Luas Bangun Datar Persegi")
            output("Luas = "+sisi_1+" * "+sisi_2+" = "+Luas+" cm2")
        catch (ArithmeticException e):
            output(e)


:: PSEUDOCODE Persegi Panjang ::

    double Luas,panjang,lebar

    set_A(double a):
        this.panjang = a
    set_B(double b):
        this.lebar = b
    set_Luas():
        Luas = panjang * lebar
    Hasil():
        try 
            output("Luas Bangun Datar Persegi Panjang")
            output("Luas = "+panjang+" * "+lebar+" = "+Luas+" cm2")
        catch (ArithmeticException e):
            output(e)

:: PSEUDOCODE Segitiga ::

    double Luas,alas,tinggi

    set_A(double a):
        this.alas = a
    set_B(double b):
        this.tinggi = b
    set_Luas():
        Luas = (alas * tinggi)/2
    Hasil():
        try 
            output("Luas Bangun Datar Segitiga")
            output("Luas = ("+alas+" * "+tinggi+")/2 = "+Luas+" cm2")
        catch (ArithmeticException e):
            output(e)

:: PSEUDOCODE Lingkaran ::

    double Luas,r

    set_A(double a):
        this.r = a
    set_B(double b):
        this.r = b
    set_Luas():
        Luas = r * r * 3.14
    Hasil():
        try 
            output("Luas Bangun Datar Lingkaran")
            output("Luas = "+r+" * "+r+" * 3.14 = "+Luas+" cm2")
        catch (ArithmeticException e):
            output(e)

:: PSEUDOCODE Trapesium ::

    double Luas,jumlah_sisi,tinggi

    set_A(double a):
        this.jumlah_sisi = a
    set_B(double b):
        this.tinggi = b
    set_Luas():
        Luas = (jumlah_sisi * tinggi)/2
    Hasil():
        try 
            output("Luas Bangun Datar Trapesium")
            output("Luas = "+jumlah_sisi+" * "+tinggi+" = "+Luas+" cm2")
        catch (ArithmeticException e):
            output(e)

