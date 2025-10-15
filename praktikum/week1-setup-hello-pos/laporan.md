# Laporan Praktikum Minggu 1 
Topik: "Pengenalan Paradigma dan Setup Proyek"

## Identitas
- Nama  : Aisyah Intan Nurjannah
- NIM   : 240202894
- Kelas : 3IKRB

---

## Tujuan
- Mahasiswa mampu mendefinisikan paradigma prosedural, OOP, dan fungsional.
- Mahasiswa mampu membandingkan kelebihan dan keterbatasan tiap paradigma.
- Mahasiswa mampu memberikan contoh program sederhana untuk masing-masing paradigma.
- Mahasiswa aktif dalam diskusi kelas (bertanya, menjawab, memberi opini).


---

## Dasar Teori
Paradigma pemrograman adalah cara pandang dalam menyusun program:

- Prosedural: program dibangun sebagai rangkaian perintah (fungsi/prosedur).
- OOP (Object-Oriented Programming): program dibangun dari objek yang memiliki data (atribut) dan perilaku (method).
- Fungsional: program dipandang sebagai pemetaan fungsi matematika, lebih menekankan ekspresi dan transformasi data.
Dalam konteks Agri-POS, OOP membantu memodelkan entitas nyata seperti Produk, Transaksi, dan Pembayaran sebagai objek. Dengan demikian, sistem lebih mudah dikembangkan dan dipelihara.



---

## Langkah Praktikum
1. Setup Project

   Pastikan sudah menginstall JDK (Java Development Kit), IDE (misal: IntelliJ IDEA, VS Code, NetBeans), Git, PostgreSQL, dan JavaFX di      komputer. Buat folder project oop-pos-. Inisialisasi repositori Git. Buat struktur awal src/main/java/com/upb/agripos/. Pastikan semua    tools dapat berjalan (uji dengan membuat dan menjalankan program Java sederhana). Program Sederhana dalam 3 Paradigma

2. Prosedural: program untuk menghitung total harga dua produk. OOP: class Produk dengan atribut nama dan harga, buat minimal tiga objek,    lalu hitung total. Fungsional: gunakan Stream atau lambda untuk menghitung total harga dari minimal tiga objek. Commit dan Push

3. Commit dan Push Commit dengan pesan: week1-setup-hello-pos.
---

## Kode Program
1. Prosedural

// HelloProcedural.java
public class HelloProcedural {
    public static void main(String[] args) {
        String nim = "240202894";
        String name = "Aisyah";

        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}



2. OOP (Object-Oriented Programming)

// HelloOOP.java
class Student {
    String nim;
    String name;

    Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        Student s = new Student("240202894", "Aisyah");
        s.introduce();
    }
}

---

3. Fungsional

// HelloFunctional.java
import java.util.function.BiConsumer;

public class HelloFunctional {
    public static void main(String[] args) {
        BiConsumer<String, String> introduce =
            (nim, name) -> System.out.println("Hello World, I am " + name + " - " + nim);

        introduce.accept("240202894", "Aisyah");
    }
}


## Hasil Eksekusi
Sertakan screenshot hasil eksekusi program.  

<img width="1366" height="768" alt="HelloOOP java" src="https://github.com/user-attachments/assets/16fb5c95-8b1e-4132-8204-e9235cf1ee60" />


<img width="1366" height="768" alt="HelloFunctional java" src="https://github.com/user-attachments/assets/5ce8de07-5206-481c-b1c8-76910e65f3cb" />


<img width="1366" height="768" alt="HelloProcedural java" src="https://github.com/user-attachments/assets/234748c9-d3df-4e1d-8634-cc883456bc23" />




---

## Analisis
(
- Jelaskan bagaimana kode berjalan.

   1. Procedural a. Program Java selalu mulai dari metode main(). b. Dua variabel dibuat: c. nim menyimpan "240202894" d. nama menyimpan        "Aisyah" e. System.out.println(...) mencetak teks ke layar. f. Output yang dihasilkan Hello World, I am Aisyah-240202894

2.  OOP a. Program tetap mulai dari main() di kelas HelloOOP. b. Baris Mahasiswa m = new Mahasiswa("Aisyah", "240202894"); Membuat objek      baru dari kelas Mahasiswa. Konstruktor Mahasiswa(...) dijalankan untuk mengisi nilai nama dan NIM. c. Lalu m.sapa(); Memanggil metode     sapa() dari objek m. Metode ini mencetak: Hello World, I am Aisyah-240202894

3. Functional a. Program tetap mulai dari main(). BiConsumer<String, String> sapa = ... Membuat fungsi anonim (tanpa nama) menggunakan       lambda expression. BiConsumer artinya fungsi yang menerima dua parameter (String, String) dan tidak mengembalikan nilai. b. Baris         sapa.accept("Aisyah", "240202894"); Memanggil fungsi sapa dan mengisi parameter nama dan NIM. c. Fungsi langsung mencetak hasil: Hello    World, I am Aisyah-240202894
  
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.
  Jadi minggu ini mulai diperkenalkan perbedaan paradigma, tidak hanya menulis instruksi sederhana.
  Juga membahas tentang Pendekatan OOP membuat program lebih terstruktur, sedangkan functional membuat kode lebih ringkas.

 
- Kendala yang dihadapi dan cara mengatasinya.  
  Terjadi eror saat run program. Cara mengatasinya harusnya pada bagian Start Debugging bukan Run Code.
  dan membaca dokumentasi Java tentang java.util.function dan contoh penggunaan OOP sederhana.

---

## Kesimpulan
   Dari praktikum ini aku jadi paham kalau tiap paradigma punya cara kerja yang beda-beda. Paradigma prosedural fokusnya ke urutan           langkah program, OOP lebih ke pengelompokan data dan perilaku lewat objek, sedangkan fungsional pakai cara berpikir berbasis fungsi       yang lebih ringkas.
  Dengan mencoba semua, aku bisa lihat kelebihan dan kekurangan masing-masing. Setup awal seperti install JDK, IDE, dan tools lainnya       juga penting banget supaya program bisa dijalankan tanpa error dan siap dipakai buat project berikutnya.

---

## Quiz
1. Apakah OOP selalu lebih baik dari prosedural?
   Jawaban: Tidak. OOP memang lebih terstruktur, tapi kalau programnya kecil dan tidak terlalu kompleks, pendekatan prosedural justru        lebih cepat dibuat dan mudah dipahami. Jadi, tergantung kebutuhan dan skala proyeknya.

2. Kapan functional programming lebih cocok digunakan dibanding OOP atau prosedural?
   Jawaban: Functional lebih cocok dipakai saat butuh pengolahan data yang banyak dan cepat, seperti analisis data atau sistem yang butuh    perhitungan paralel. Karena di paradigma ini, fungsi bisa jalan tanpa mengubah data lain.

3. Bagaimana paradigma memengaruhi maintainability dan scalability aplikasi?
   Jawaban: Setiap paradigma ngaruh ke cara perawatan dan pengembangan aplikasi. Prosedural biasanya gampang di awal tapi sulit              diperluas. OOP lebih rapi karena berbasis objek, dan fungsional lebih mudah diuji karena tidak bergantung pada variabel global.

4. Mengapa OOP lebih cocok untuk aplikasi POS dibanding prosedural?
   Jawaban: Karena OOP bisa menggambarkan sistem kasir dengan lebih nyata lewat objek seperti produk, transaksi, dan pelanggan. Jadi         kalau nanti ada tambahan fitur, tinggal nambah class atau method tanpa ubah seluruh program.

5. Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (boilerplate code)?
   Jawaban: Karena di paradigma fungsional, kita bisa pakai fungsi seperti map(), filter(), dan reduce() yang langsung bisa dipakai ulang    tanpa harus bikin loop panjang. Jadi kode lebih singkat dan gampang dibaca.
