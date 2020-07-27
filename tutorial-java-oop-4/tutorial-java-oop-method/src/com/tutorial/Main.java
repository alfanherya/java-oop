package com.tutorial;

class Mahasiswa {
    String nama;
    String NIM;

    // construktor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // contoh method tanpa returd dan menggunakan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tapi tidak menggunakan parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message) {
        return message + "juga, nama saya adalah " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("herya", "100198");

        // methodnya
        mahasiswa1.show();

        mahasiswa1.setNama("");
        mahasiswa1.show();
        // ===============================================
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        // ================================================
        String data = mahasiswa1.sayHi("terima kasih");
        System.out.println(data);

    }

}