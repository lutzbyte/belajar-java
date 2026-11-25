# Soal Latihan Java: Hari 1 sampai 3

Format tiap soal: Tugas, Data awal, Wajib dipakai, Boleh dipakai, Output.
Soal bertipe "tebak output" tidak menampilkan outputnya. Tulis tebakan Anda dulu sebagai komentar.

---

# HARI 1 (file: latihan/day1.java)

## Soal Awal: Cetak data satu mahasiswa

**Tugas:** Simpan data satu mahasiswa di variable, lalu cetak satu nilai per baris.

**Data awal:** nama `Budi`, umur `20`, tinggi badan `170.5`, golongan darah `O`, status aktif `true`.

**Wajib dipakai:**
- Variable dengan tipe data yang paling tepat untuk tiap data.
- Nilai disimpan di variable dulu, baru dicetak dengan `System.out.println`.

**Boleh dipakai:** Komentar, nama variable bebas yang sesuai aturan penamaan.

**Output:**
```
Budi
20
170.5
O
true
```

## Soal 1: Hello World

**Tugas:** Cetak tiga baris teks.

**Data awal:** Tidak ada.

**Wajib dipakai:** `System.out.println`.

**Boleh dipakai:** Komentar.

**Output:**
```
Halo, Java
Nama saya Andi
Saya sedang belajar Java
```

## Soal 2: Tipe data number

**Tugas:** Buat variable dengan tipe dan nama berikut, lalu cetak satu nilai per baris sesuai urutan tabel.

**Data awal:**

| Tipe | Nama | Nilai |
|---|---|---|
| `byte` | `jumlahRoda` | 4 |
| `short` | `tahunProduksi` | 2019 |
| `int` | `jarakTempuh` | 150000 |
| `long` | `hargaMobil` | 350000000 |
| `float` | `kapasitasTangki` | 45.5 |
| `double` | `konsumsiBBM` | 12.75 |

**Wajib dipakai:** Tipe dan nama variable persis seperti tabel.

**Boleh dipakai:** Komentar.

**Output:**
```
4
2019
150000
350000000
45.5
12.75
```

## Soal 3: Char, boolean, dan nilai variable berubah

**Tugas:** Cetak nilai awal, ubah nilainya, lalu cetak lagi.

**Data awal:**
```java
char golongan = 'C';
boolean terdaftar = true;
```
Urutan: cetak `golongan`, cetak `terdaftar`, ubah menjadi `D` dan `false`, cetak `golongan`, cetak `terdaftar`.

**Wajib dipakai:** Mengubah nilai variable yang sudah ada (tanpa deklarasi ulang).

**Boleh dipakai:** Komentar.

**Output:**
```
C
true
D
false
```

## Soal 4: Tebak output (variable dan salinan nilai)

**Tugas:** Tebak 6 baris output kode di bawah tanpa menjalankannya dulu. Tulis tebakan sebagai komentar, lalu jalankan untuk memeriksa.

**Data awal:**
```java
String kota = "Jakarta";
String kotaLain = kota;
kota = "Bandung";
int a = 7;
int b = a;
a = 9;
char huruf = 'x';
boolean cek = true;
cek = false;
System.out.println(kota);
System.out.println(kotaLain);
System.out.println(a);
System.out.println(b);
System.out.println(huruf);
System.out.println(cek);
```

**Wajib dipakai:** Tebak dulu, baru jalankan.

**Boleh dipakai:** Komentar.

**Output:** Tulis tebakan Anda sendiri (6 baris).

## Soal 5: Perbaiki kode tipe data

**Tugas:** Perbaiki kode agar bisa dikompilasi dan outputnya sesuai.

**Data awal:**
```java
long populasi = 7500000000;
float berat = 65.5;
char inisial = "R";
String kotaAsal = 'Medan';
boolean aktif = TRUE;
int jumlah-siswa = 30;
System.out.println(populasi);
System.out.println(berat);
System.out.println(inisial);
System.out.println(kotaAsal);
System.out.println(aktif);
System.out.println(jumlah-siswa);
```

**Wajib dipakai:** Tipe variable tidak boleh diubah.

**Boleh dipakai:** Mengubah nilai (literal) dan mengganti nama variable yang tidak valid. Cetak variable yang sama dengan nama barunya.

**Output:**
```
7500000000
65.5
R
Medan
true
30
```

## Soal 6: Data satu buku

**Tugas:** Buat data satu buku, cetak kelima nilainya, ubah dua nilai, lalu cetak hanya dua nilai itu.

**Data awal:**
- `judul`: `Pemrograman Java`
- `jumlahHalaman`: `350`
- `harga`: `89900.5`
- `kategori`: `T`
- `tersedia`: `true`

Urutan: cetak kelima nilai, ubah `jumlahHalaman` menjadi `400` dan `tersedia` menjadi `false`, cetak hanya `jumlahHalaman` dan `tersedia`.

**Wajib dipakai:** Tipe data yang paling tepat dan nama variable persis seperti di atas.

**Boleh dipakai:** `var`, komentar.

**Output:**
```
Pemrograman Java
350
89900.5
T
true
400
false
```

---

# HARI 2 (file: latihan/day2.java)

## Soal 1: String dan array String

**Tugas:** Cetak sebuah String, lalu cetak tiap elemen array String berurutan.

**Data awal:** `String kota` bernilai `Bandung`, `String[] hobi` berisi `membaca`, `coding`, `olahraga`.

**Wajib dipakai:** Array dan akses elemen lewat indeks 0 sampai 2.

**Boleh dipakai:** Komentar.

**Output:**
```
Bandung
membaca
coding
olahraga
```

## Soal 2: Mengisi dan mengubah array

**Tugas:** Buat array kosong berukuran 4, isi, ubah satu elemen, lalu cetak.

**Data awal:**
- `int[] nilai` dengan panjang 4 (belum diisi).
- Isi indeks 0 sampai 3 dengan: 80, 75, 90, 85.
- Ubah indeks 1 menjadi 95.

**Wajib dipakai:** Array dengan panjang tetap dan properti `length`.

**Boleh dipakai:** Komentar.

**Output:** (empat elemen berurutan, lalu panjang array)
```
80
95
90
85
4
```

## Soal 3: Operasi matematika

**Tugas:** Cetak hasil enam ekspresi berurutan.

**Data awal:**
```java
int a = 17;
int b = 5;
double c = 17.0;
```
Cetak: `a + b`, `a - b`, `a * b`, `a / b`, `a % b`, `c / b`.

**Wajib dipakai:** Operator `+`, `-`, `*`, `/`, `%`.

**Boleh dipakai:** Komentar.

**Output:**
```
22
12
85
3
2
3.4
```

## Soal 4: Operasi perbandingan

**Tugas:** Cetak hasil enam perbandingan berurutan.

**Data awal:**
```java
int x = 10;
int y = 20;
```
Cetak: `x == y`, `x != y`, `x < y`, `x > y`, `x <= 10`, `y >= 25`.

**Wajib dipakai:** Operator perbandingan persis seperti daftar.

**Boleh dipakai:** Komentar.

**Output:**
```
false
true
true
false
true
false
```

## Soal 5: Operasi boolean

**Tugas:** Cetak hasil enam ekspresi boolean berurutan.

**Data awal:**
```java
boolean hujan = true;
boolean bawaPayung = false;
int umur = 17;
boolean punyaKtp = false;
```
Cetak: `hujan && bawaPayung`, `hujan || bawaPayung`, `!hujan`, `!bawaPayung`, `(umur >= 17) && punyaKtp`, `(umur >= 17) || punyaKtp`.

**Wajib dipakai:** `&&`, `||`, `!`.

**Boleh dipakai:** Operator perbandingan, tanda kurung.

**Output:**
```
false
true
false
true
false
true
```

## Soal 6: Tebak output (pembagian dan boolean)

**Tugas:** Tebak 5 baris output kode di bawah tanpa menjalankannya dulu. Tulis tebakan sebagai komentar, lalu jalankan untuk memeriksa.

**Data awal:**
```java
int p = 7;
int q = 2;
double r = p / q;
double s = p / 2.0;
boolean t = (p % q == 1) && (r < s);
System.out.println(p / q);
System.out.println(p % q);
System.out.println(r);
System.out.println(s);
System.out.println(t);
```

**Wajib dipakai:** Tebak dulu, baru jalankan.

**Boleh dipakai:** Komentar.

**Output:** Tulis tebakan Anda sendiri (5 baris).

## Soal 7: Expression, statement, dan block

**Tugas:** Tulis kode di bawah, lalu beri dua komentar pada baris `luas = panjang * lebar;`.

**Data awal:**
```java
int panjang = 8;
int lebar = 5;
int luas;
{
  luas = panjang * lebar;
  System.out.println(luas);
}
```

**Wajib dipakai:**
- Block `{ }` seperti di atas.
- Komentar `// expression: ...` berisi bagian yang menghasilkan nilai.
- Komentar `// statement: ...` berisi seluruh baris statement itu.

**Boleh dipakai:** Komentar tambahan.

**Output:**
```
40
```

---

# HARI 3 (file: latihan/day3.java)

## Soal 1: Nilai huruf dengan if, else if, else

**Tugas:** Cetak huruf untuk tiap nilai siswa: `>= 90` jadi `A`, `>= 80` jadi `B`, `>= 70` jadi `C`, selain itu `D`.

**Data awal:**
```java
int[] nilaiSiswa = {95, 85, 78, 50};
```

**Wajib dipakai:** `for` sepanjang array, `if`, `else if`, `else`.

**Boleh dipakai:** Operator perbandingan, `nilaiSiswa.length`.

**Output:**
```
A
B
C
D
```

## Soal 2: Nama hari dengan switch

**Tugas:** Untuk tiap variable `hari`, cetak nama harinya: `1` jadi `Senin`, `2` jadi `Selasa`, `3` jadi `Rabu`, selain itu `Hari lain`. Cetak `hari1` dulu, lalu `hari2`.

**Data awal:**
```java
int hari1 = 3;
int hari2 = 9;
```

**Wajib dipakai:** `switch` dengan `default`.

**Boleh dipakai:** Variable penampung hasil, `println`.

**Output:**
```
Rabu
Hari lain
```

## Soal 3: Genap atau ganjil dengan ternary

**Tugas:** Untuk tiap bilangan, isi `String` dengan `Genap` atau `Ganjil`, lalu cetak. Cetak untuk `bilangan1` dulu, lalu `bilangan2`.

**Data awal:**
```java
int bilangan1 = 7;
int bilangan2 = 10;
```

**Wajib dipakai:** Operator ternary (`? :`).

**Boleh dipakai:** Operator `%`, operator perbandingan, variable `String`.

**Output:**
```
Ganjil
Genap
```

## Soal 4: Dua perulangan for

**Tugas:** Cetak angka 1 sampai 5 naik, lalu cetak 10, 8, 6, 4, 2 turun dua-dua.

**Data awal:** Tidak ada.

**Wajib dipakai:** Dua perulangan `for`.

**Boleh dipakai:** `i++`, `i--`, `i -= 2`, operator perbandingan.

**Output:**
```
1
2
3
4
5
10
8
6
4
2
```

## Soal 5: Hitung mundur dengan while

**Tugas:** Cetak `hitung` selama nilainya `>= 1`, dan kurangi satu tiap putaran.

**Data awal:**
```java
int hitung = 3;
```

**Wajib dipakai:** `while`.

**Boleh dipakai:** `hitung--` atau `hitung = hitung - 1`.

**Output:**
```
3
2
1
```

## Soal 6: Dua perulangan do-while

**Tugas:** Jalankan dua perulangan `do-while`. Pertama: cetak `n`, tambah 1, ulangi selama `n < 5`. Kedua: cetak `m`, tambah 1, ulangi selama `m <= 3`.

**Data awal:**
```java
int n = 10;
int m = 1;
```

**Wajib dipakai:** `do-while` (dua kali).

**Boleh dipakai:** `n++`, `m++`.

**Output:**
```
10
1
2
3
```

## Soal 7: Berhenti di tengah perulangan

**Tugas:** Cetak angka 1 sampai 10, tetapi hentikan perulangan saat angkanya 6. Angka 6 tidak dicetak.

**Data awal:** Tidak ada.

**Wajib dipakai:** `for` dan `break`.

**Boleh dipakai:** `if`, operator perbandingan.

**Output:**
```
1
2
3
4
5
```

## Soal 8: Lewati kelipatan 3

**Tugas:** Cetak angka 1 sampai 8, lewati angka kelipatan 3.

**Data awal:** Tidak ada.

**Wajib dipakai:** `for` dan `continue`.

**Boleh dipakai:** `if`, operator `%`, operator perbandingan.

**Output:**
```
1
2
4
5
7
8
```

## Soal 9: Tebak output (continue, break, while)

**Tugas:** Tebak 2 baris output kode di bawah tanpa menjalankannya dulu. Tulis tebakan sebagai komentar, lalu jalankan untuk memeriksa.

**Data awal:**
```java
int total = 0;
for (int i = 1; i <= 6; i++) {
  if (i % 2 == 0) {
    continue;
  }
  if (i == 5) {
    break;
  }
  total = total + i;
}
System.out.println(total);

int k = 1;
while (k < 20) {
  k = k * 3;
}
System.out.println(k);
```

**Wajib dipakai:** Tebak dulu, baru jalankan.

**Boleh dipakai:** Komentar.

**Output:** Tulis tebakan Anda sendiri (2 baris).

## Soal 10: Perbaiki kode percabangan dan perulangan

**Tugas:** Perbaiki 3 kesalahan di kode ini (dua error kompilasi dan satu perulangan yang tidak berhenti) tanpa mengubah tujuan kodenya.

**Data awal:**
```java
int umur = 20;
if (umur >= 17 and umur < 60) {
  System.out.println("Dewasa");
} else {
  System.out.println("Bukan dewasa");
}
int j = 1;
while (j <= 3) {
  System.out.println(j);
}
int hasil = umur > 18 ? "Dewasa" : "Anak";
System.out.println(hasil);
```

**Wajib dipakai:** Tetap memakai `if-else`, `while`, dan ternary.

**Boleh dipakai:** Mengganti tipe variable, operator, dan menambah baris yang diperlukan.

**Output:**
```
Dewasa
1
2
3
Dewasa
```

## Soal 11: Hitung belanja dengan batas harga

**Tugas:** Proses harga berurutan: harga di bawah `10000` dilewati, harga di atas `25000` menghentikan perulangan, selain itu ditambahkan ke `jumlahHarga` dan `jumlahItem` bertambah satu. Lalu isi `ongkir` dengan `Gratis ongkir` jika `jumlahHarga >= 30000`, selain itu `Bayar ongkir`. Cetak `jumlahHarga`, `jumlahItem`, lalu `ongkir`.

**Data awal:**
```java
int[] harga = {15000, 8000, 22000, 5000, 30000};
int jumlahHarga = 0;
int jumlahItem = 0;
```

**Wajib dipakai:** `for` sepanjang array, `continue`, `break`, ternary.

**Boleh dipakai:** `if`, operator perbandingan, `+=`, `++`, `harga.length`.

**Output:**
```
37000
2
Gratis ongkir
```

