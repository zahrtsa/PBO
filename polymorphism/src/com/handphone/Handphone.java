package com.handphone;

public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Sedang Mengirim Pesan ke " + nomorTujuan + " dengan isi pesan: " + pesan);
    }

    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("Sedang Mengirim Pesan ke " + nomorTujuan1 + " dan " + nomorTujuan2 + " dengan isi pesan: ");
        System.out.println(pesan);
    }
    
    public void kirimPesan(String[] daftarNomor, String pesan) {
        for (String nomor : daftarNomor) {
            System.out.println("Mengirim pesan ke " + nomor  + pesan);
        }
    }
}
