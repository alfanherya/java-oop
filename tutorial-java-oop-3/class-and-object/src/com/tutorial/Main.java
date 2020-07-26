package com.tutorial;

class Mahasiswa {
    String nama;
    String NIM;
    String Jurusan;
    double IPK;
    Integer umur;

}

public class Main {
    public static void main(String[] args) throws Exception {

        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "alfan";
        mahasiswa1.NIM = "123456";
        mahasiswa1.Jurusan = "fisika";
        mahasiswa1.IPK = 3.9;
        mahasiswa1.umur = 25;

        // code untuk menampilkan hasil
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
    }

}