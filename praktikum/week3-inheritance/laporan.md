# Laporan Praktikum Minggu 3
Topik: Inheritance (Kategori Produk)
## Identitas
- Nama  : Aisyah Intan Nurjannah
- NIM   : 240202894
- Kelas : 3IKRB

---

## Tujuan
Mahasiswa memahami konsep dasar inheritance (pewarisan class) dalam pemrograman berorientasi objek (OOP).

Mahasiswa mampu membuat relasi antar class melalui pewarisan (superclass dan subclass).

Mahasiswa dapat menggunakan keyword super untuk memanggil konstruktor dan method dari parent class.

Mahasiswa dapat membandingkan penggunaan inheritance dengan pendekatan class tunggal.t class Produk dengan enkapsulasi.*)

---

## Dasar Teori
Inheritance atau pewarisan adalah salah satu pilar utama dalam OOP yang memungkinkan suatu class (subclass) mewarisi atribut dan method dari class lain (superclass).

Superclass adalah class induk yang berisi atribut dan method umum.

Subclass adalah class turunan yang mewarisi sifat dari superclass dan dapat menambahkan fitur baru.

Keyword super digunakan untuk mengakses konstruktor atau method milik superclass.


---

## Langkah Praktikum
1.Membuat Superclass Produk
Class Produk berisi atribut umum: kode, nama, harga, dan stok.

2.Membuat Subclass

Benih.java → menambahkan atribut varietas.

Pupuk.java → menambahkan atribut jenis.

AlatPertanian.java → menambahkan atribut material.

3.Membuat Class MainInheritance
Menginstansiasi objek dari setiap subclass dan menampilkan informasinya.

4.Menambahkan CreditBy
Class CreditBy menampilkan identitas mahasiswa pembuat program.

5.Commit dan Push ke GitHub
Dengan pesan commit: week3-inheritance.
---

## Kode Program
(Tuliskan kode utama yang dibuat, contoh:  

```java
// Contoh
Produk p1 = new Produk("BNH-001", "Benih Padi", 25000, 100);
System.out.println(p1.getNama());
```
)
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
Program ini menampilkan penerapan konsep inheritance dalam pembuatan sistem manajemen produk pertanian. Superclass Produk berperan sebagai class umum yang menyimpan atribut dasar seperti kode, nama, harga, dan stok.
Subclass Benih, Pupuk, dan AlatPertanian mewarisi semua atribut dan method dari Produk, namun menambahkan atribut baru yang spesifik sesuai kebutuhan.

Pemanggilan super() di setiap subclass berfungsi untuk menginisialisasi atribut dari superclass sebelum menambahkan atribut baru. Ketika method tampilkanInfo() dijalankan, data umum dari superclass akan ditampilkan terlebih dahulu melalui super.tampilkanInfo(), lalu data tambahan dari subclass akan ditampilkan setelahnya.

Perbedaan utama dibanding praktikum sebelumnya terletak pada struktur program. Pendekatan inheritance membuat program lebih modular dan mudah dikembangkan. Jika nanti ditambah jenis produk baru, cukup membuat subclass baru tanpa harus mengubah class lain. Hal ini mendukung prinsip reusability dan maintainability dalam OOP.

Selama proses pengerjaan, sempat terjadi error “constructor Produk in class Produk cannot be applied” karena urutan parameter konstruktor tidak sesuai. Setelah diperbaiki sesuai urutan parameter di superclass, program dapat dijalankan dengan hasil sesuai harapan.
---

## Kesimpulan
Melalui praktikum ini, saya memahami bahwa inheritance memungkinkan pengembang untuk membuat struktur class yang lebih efisien dan terorganisir. Dengan menjadikan Produk sebagai superclass, kita dapat menampung semua atribut dan perilaku umum, sementara subclass cukup menambahkan atribut spesifik.
Penerapan inheritance membantu mengurangi pengulangan kode, memudahkan pemeliharaan sistem, serta memperjelas hubungan hierarki antar class dalam OOP.
---

## Quiz
1. Apa keuntungan menggunakan inheritance dibanding membuat class terpisah tanpa hubungan?
Jawaban:
Inheritance membuat kode lebih efisien karena atribut dan method yang umum cukup ditulis sekali di superclass, lalu dapat digunakan oleh seluruh subclass. Dengan demikian, pengelolaan kode menjadi lebih mudah, struktur program lebih rapi, dan mengurangi potensi error akibat duplikasi kode. …  

2. Bagaimana cara subclass memanggil konstruktor superclass?
Jawaban:
Subclass memanggil konstruktor superclass dengan menggunakan super(parameter), dan pemanggilan ini harus berada pada baris pertama konstruktor subclass. Hal ini dilakukan agar atribut di superclass terinisialisasi lebih dulu sebelum atribut tambahan di subclass. …  

3. Berikan contoh kasus di POS pertanian selain Benih, Pupuk, dan Alat Pertanian yang bisa dijadikan subclass.
Jawaban:
Contoh subclass baru adalah HasilPanen, yang merepresentasikan produk hasil pertanian seperti beras, jagung, atau kedelai. Class ini dapat menambahkan atribut seperti tanggalPanen dan asalLahan. …  
