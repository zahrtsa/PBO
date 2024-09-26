package com.handphone;

public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Sedang Mengirim Pesan ke " + nomorTujuan + " dengan isi pesan: " + pesan);
    }

    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirim e-Mail ke " + emailTujuan);
        System.out.println("Subjek : " + subjek);
        System.out.println("Isi Pesan : ");
        System.out.println(pesan);
    }


    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}
