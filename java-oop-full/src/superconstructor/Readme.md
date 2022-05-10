<h1>Seri Pelajaran OOP java Programming (Super Constructor)</h1>

pelajaran kedua super Construktor
* Tidak hanya untuk mengakses method atau field yang ada di parent class, tapi bisa digunakan untuk mengakses constructor
* Syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class child constructor
* jika sebuah class parent tidak memiliki constructor yang tidak ada parameternya (tidak memiliki default constructor), maka class child wajib mengakses constructor class parent tersebut.

pada code di dalam package superconstructor yang sebagai class parent adalah : class Dosen, dan untuk class child adalah class Mahasiswa.

Analisis dari code class child di bawah ini :

```java
class Mahasiswa extends Dosen{

    Mahasiswa(String nama){
        super(nama);
    }

    void sayHello(String nama){
        System.out.println("Hi " + nama + " My Name is " + this.nama);
    }
}

```
pada code di atas ada keyword extends, fungsi dari keyword ini menunjukkan bahwa kelas diwarisi dari kelas lain. atau secara konsep bisa masuk kedalam metode inheritance(pewarisan sifat) 