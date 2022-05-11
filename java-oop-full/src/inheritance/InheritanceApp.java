package inheritance;

public class InheritanceApp {
    public static void main(String[] args) {

        var dosen = new Dosen();
        dosen.name = "Mr.Alfan";
        dosen.sayHello("Heru");

        var mahasiswa = new Mahasiswa();
        mahasiswa.name = "Herya";
        mahasiswa.sayHello("Heru");
    }
}
