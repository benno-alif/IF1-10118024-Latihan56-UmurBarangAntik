package com.benno;

public class BarangAntik {
    protected int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun");
    }
}
