package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Umur Barang Antik
     */

public class Main {

    public static void main(String[] args) {
        BarangAntik obj = new Radio(234);
        ((Radio) obj).setName("Radio AM");
        System.out.println("Nama barang Antik : " + ((Radio) obj).getName());
        obj.tampilUmur();
    }
}
