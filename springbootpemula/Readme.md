#Belajar menggunakan spring boot
<p>
    Ini adalah tutorial untuk membuat aplikasi web dengan spring boot.
</p>

* * *
<p> inversion of control </p>

* inversion of control (IoC) merupakan prinsip dalam pembuatan perangkat lunak, dimana kita melakukan pemindahan kontrol untuk objek atau program ke sebuah container di framework

* Tidak seperti biasanya ketika kita membuat aplikasi, dimana kita selalu melakukannya secara manual, dalam IoC kita menyerahkan banyak pekerjaan ke container IoC
* Container IoC memiliki kontrol untuk melakukan eksekusi program kita, memanajemen object pada program kita dan melakukan abstraction terhadap program kita
* saat menggunakan IoC, kita biasanya akan mengikuti cara kerja framework tersebut.

* * *
<p>Application Context</p>

* ApplicationContext adalah sebuah interface yang representasi container IoC di Spring
* ApplicationContext adalah inti dari Spring Framework
* ApplicationContext banyak sekali class implementasinya, secara garis besar di bagi menjadi 2 jenis implementasi, XML dan Annotation
* Pada versi spring 3, XML masih menjadi pilihan utama, namun sekarang sudah banyak orang beralih dari XML ke Annotation, bahkan spring boot pun merekomendasikan menggunakan Annotation untuk membuat aplikasi spring

<p>Configuration</p>

* untuk membuat ApplicationContext menggunakan annotation, pertama bisa kita perlu membuat Configuration class
* * *