package superconstructor;

class Dosen {
    String nama;
    String kelas;

    Dosen(String nama){
        this.nama = nama;
    }
    Dosen(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    void sayHello(String nama){
        System.out.println("Hello " + nama + " , My Dosen name is " + this.nama);
    }
}
