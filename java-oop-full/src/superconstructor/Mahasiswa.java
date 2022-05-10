package superconstructor;

class Mahasiswa extends Dosen{

    Mahasiswa(String nama){
        super(nama);
    }

    void sayHello(String nama){
        System.out.println("Hi " + nama + " My Name is " + this.nama);
    }
}
