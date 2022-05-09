<h1>Seri Pelajaran OOP(Object Oriented Programming)</h1>

pelajaran pertama tentang super keyword
* untuk mengakses method yang dimiliki class parent, kita bisa menggunakan kata kunci super
* super digunakan untuk mengakses class parent
* tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super

contoh code sebagai berikut:
```java
class parent {
        int getCorner() {
            return 0;
        }
    }
```
-----------------------------------
pada baris code di atas bisa dilihat kalau class parent memiliki corner dengan return 0.
```java
    class child extends parent {
    int getCorner(){
        return 4;
    }
    int getParentCorner(){
        return super.getCorner();
    }
}
```
pada baris code diatas class child extend class parent, dimana class child akan mengakses class parent menggunakan super
keyword.
-----------------------------------
 ```java
 public class ShapeApp {
    public static void main(String[] args) {

        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
```
-----------------------------------
pada baris code class ShapeApp, kita akan menjalankan baris code nya, supaya mengerti result dari hubungan class parent dan class child, yang keduanya terdapat interkasi dari class child untuk bisa mengakses class parent nya.

