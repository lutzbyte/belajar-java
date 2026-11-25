# Soal Latihan Java: Hari 4 (file: latihan/day4.java)

Format tiap soal: Tugas, Data awal, Wajib dipakai, Boleh dipakai, Output.

Aturan umum Hari 4:
- Semua method ditulis di dalam class `day4`, sejajar dengan `main`, dan diberi kata `static` di depannya.
- Pakai persis nama method dan parameter yang tertulis di soal.
- Soal bertipe "tebak output" tidak menampilkan outputnya. Tulis tebakan Anda dulu sebagai komentar.
- Belum ada penggabungan teks dengan `+`. Cetak nilai satu per baris dengan `println`.

---

## Soal 1: Cetak isi array dengan for each

**Tugas:** Cetak semua elemen array, satu per baris.

**Data awal:**
```java
int[] angka = {4, 9, 2, 7};
```

**Wajib dipakai:** `for each` (bukan `for` biasa).

**Boleh dipakai:** `System.out.println`.

**Output:**
```
4
9
2
7
```

## Soal 2: Jumlahkan angka yang lebih dari 5

**Tugas:** Jumlahkan hanya elemen yang lebih besar dari 5, lalu cetak totalnya.

**Data awal:**
```java
int[] data = {4, 9, 2, 7, 12};
int total = 0;
```

**Wajib dipakai:** `for each` dan `if`.

**Boleh dipakai:** Operator perbandingan, `+=`.

**Output:**
```
28
```

## Soal 3: Method tanpa parameter

**Tugas:** Buat method `cetakSalam()` yang mencetak satu baris teks, lalu panggil dua kali dari `main`.

**Data awal:** Teks yang dicetak: `Selamat belajar Java`.

**Wajib dipakai:** Method tanpa parameter dan tanpa return value (`void`).

**Boleh dipakai:** `System.out.println`.

**Output:**
```
Selamat belajar Java
Selamat belajar Java
```

## Soal 4: Method dengan parameter

**Tugas:** Buat method `cetakNama(String nama)` yang mencetak nama yang diberikan. Panggil dengan `Andi`, lalu dengan `Budi`.

**Data awal:** Tidak ada.

**Wajib dipakai:** Method dengan satu parameter `String`.

**Boleh dipakai:** `System.out.println`.

**Output:**
```
Andi
Budi
```

## Soal 5: Method dengan return value

**Tugas:** Buat method `luasPersegiPanjang(int panjang, int lebar)` yang mengembalikan luasnya. Panggil dengan `(8, 5)` lalu `(3, 4)`, dan cetak hasil yang dikembalikan.

**Data awal:** Tidak ada.

**Wajib dipakai:** Method dengan dua parameter dan return value bertipe `int`.

**Boleh dipakai:** Operator `*`, variable penampung hasil.

**Output:**
```
40
12
```

## Soal 6: Method dengan varargs

**Tugas:** Buat method `jumlahkan(int... angka)` yang mengembalikan jumlah semua angka yang diberikan. Cetak hasil dari tiga pemanggilan berikut:
- `jumlahkan(1, 2, 3)`
- `jumlahkan(10, 20)`
- `jumlahkan(5)`

**Data awal:** Tidak ada.

**Wajib dipakai:** Parameter varargs (`int...`) dan return value.

**Boleh dipakai:** `for` atau `for each` di dalam method, `+=`.

**Output:**
```
6
30
5
```

## Soal 7: Method overloading

**Tugas:** Buat tiga method bernama sama, `tampilkan`:
- `tampilkan(int angka)` mencetak angka itu.
- `tampilkan(String teks)` mencetak teks itu.
- `tampilkan(int a, int b)` mencetak hasil `a + b`.

Panggil: `tampilkan(10)`, `tampilkan("Java")`, `tampilkan(3, 4)`.

**Data awal:** Tidak ada.

**Wajib dipakai:** Tiga method dengan nama sama dan daftar parameter berbeda.

**Boleh dipakai:** `System.out.println`, operator `+` untuk menjumlahkan dua `int`.

**Output:**
```
10
Java
7
```

## Soal 8: Faktorial dengan recursion

**Tugas:** Buat method `faktorial(int n)` yang mengembalikan hasil faktorial `n`. Cetak hasil `faktorial(5)`, `faktorial(1)`, lalu `faktorial(6)`.

**Data awal:** Tidak ada.

**Wajib dipakai:** Recursion (method memanggil dirinya sendiri) dan return value `int`. Tidak boleh memakai perulangan.

**Boleh dipakai:** `if`, operator `*`, operator `-`, operator perbandingan.

**Output:**
```
120
1
720
```

## Soal 9: Tebak output (scope dan nilai parameter)

**Tugas:** Tebak 4 baris output kode di bawah tanpa menjalankannya dulu. Tulis tebakan sebagai komentar, lalu jalankan untuk memeriksa.

**Data awal:**
```java
static void ubah(int x) {
  x = 99;
  System.out.println(x);
}
```
Di dalam `main`:
```java
int a = 10;
{
  int b = 5;
  System.out.println(a + b);
}
System.out.println(a);

int angka = 10;
ubah(angka);
System.out.println(angka);
```

**Wajib dipakai:** Tebak dulu, baru jalankan.

**Boleh dipakai:** Komentar.

**Output:** Tulis tebakan Anda sendiri (4 baris).

## Soal 10: Perbaiki kode method dan scope

**Tugas:** Perbaiki 3 kesalahan di kode ini agar bisa dikompilasi dan outputnya sesuai, tanpa mengubah tujuan kodenya.

**Data awal:**
```java
static int kuadrat(int n) {
  int hasil = n * n;
}

static void jumlahDua(int a, int b) {
  return a + b;
}
```
Di dalam `main`:
```java
int hasil = kuadrat(6);
System.out.println(hasil);
System.out.println(jumlahDua(4, 5));

{
  int sisa = 3;
}
System.out.println(sisa);
```

**Wajib dipakai:** Method `kuadrat` dan `jumlahDua` tetap ada, dan blok `{ }` tetap ada.

**Boleh dipakai:** Mengubah tipe return, menambah `return`, memindahkan baris deklarasi variable.

**Output:**
```
36
9
3
```

## Soal 11: Jumlah angka genap dengan dua method

**Tugas:** Buat dua method, lalu cetak tiga hasil berurutan:
1. `adalahGenap(int angka)` mengembalikan `true` jika angka genap, selain itu `false`.
2. `jumlahGenap(int[] data)` mengembalikan jumlah elemen genap di array, dan harus memanggil `adalahGenap`.

Cetak: `adalahGenap(8)`, `adalahGenap(7)`, lalu `jumlahGenap(data)`.

**Data awal:**
```java
int[] data = {3, 8, 5, 12, 7, 20};
```

**Wajib dipakai:**
- Method dengan return value `boolean` dan `int`.
- `for each` di dalam `jumlahGenap`.
- Komentar `//` di atas tiap method yang menjelaskan fungsinya.

**Boleh dipakai:** `if`, operator `%`, operator perbandingan, `+=`.

**Output:**
```
true
false
40
```

## Soal 12: Tebak output (komentar)

**Tugas:** Tebak 2 baris output kode di bawah tanpa menjalankannya dulu. Tulis tebakan sebagai komentar, lalu jalankan untuk memeriksa.

**Data awal:**
```java
System.out.println("A");
// System.out.println("B");
/* System.out.println("C");
   System.out.println("D"); */
System.out.println("E");
```

**Wajib dipakai:** Tebak dulu, baru jalankan.

**Boleh dipakai:** Komentar.

**Output:** Tulis tebakan Anda sendiri (2 baris).

---

## Cakupan materi

| Topik Hari 4 | Soal |
|---|---|
| For Each | 1, 2, 11 |
| Method | 3, 4, 5, 6, 7, 8, 11 |
| Method Parameter | 4, 5, 6, 7, 9, 11 |
| Method Return Value | 5, 6, 8, 10, 11 |
| Method Variable Argument | 6 |
| Method Overloading | 7 |
| Recursive Method | 8 |
| Scope | 9, 10 |
| Komentar | 11, 12 |

