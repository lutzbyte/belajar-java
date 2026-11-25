# Belajar Java

Repository ini adalah catatan perjalanan saya belajar bahasa pemrograman Java dari dasar, dengan fokus pada pemahaman konsep dan latihan praktik, bukan sekadar menyelesaikan video.

## Sumber Belajar

Materi mengikuti sembilan seri video Java dari channel **Programmer Zaman Now (PZN)**, dengan latihan soal tambahan dari mentor pembelajaran.

## Kurikulum

| # | Tahap | Status |
|---|---|---|
| 1 | Java Dasar | Sedang dipelajari |
| 2 | Java OOP | Belum dimulai |
| 3 | Java Standard Classes | Belum dimulai |
| 4 | Java Generic | Belum dimulai |
| 5 | Java Collection | Belum dimulai |
| 6 | Java Lambda | Belum dimulai |
| 7 | Java Stream | Belum dimulai |
| 8 | Apache Maven | Belum dimulai |
| 9 | Java Unit Test | Belum dimulai |

Urutan belajar dibuat bertahap karena tiap tahap menjadi fondasi tahap berikutnya (misalnya Generic sebelum Collection, lalu Lambda sebelum Stream).

## Progres Java Dasar

- [x] Hari 1: Hello World, tipe data number, char, boolean, String, variable
- [x] Hari 2: Tipe data bukan primitif, array, operasi matematika, perbandingan, boolean, expression, statement, dan block
- [x] Hari 3: If, switch, ternary, for, while, do while, break dan continue
- [ ] Hari 4: For each, method (parameter, return value, varargs, overloading), recursion, scope, komentar

## Struktur Folder

```
belajar-java/
├── README.md
└── java-dasar/
    ├── latihan/
    │   ├── day1.java
    │   ├── day2.java
    │   └── day3.java
    ├── HelloWorld.java
    ├── TipeDataNumber.java
    ├── TipeDataChar.java
    ├── TipeDataBoolean.java
    ├── TipeDataString.java
    ├── TipeDataBukanPrimitif.java
    ├── Variable.java
    ├── Array.java
    ├── IfStatement.java
    ├── SwitchStatement.java
    ├── ForLoop.java
    └── ...
```

- File di root `java-dasar/` adalah praktik yang saya ketik mengikuti video, satu file per topik.
- Folder `latihan/` berisi jawaban latihan soal, satu file per hari (`day1.java`, `day2.java`, dan seterusnya).

## Cara Menjalankan

Pastikan JDK sudah terpasang (disarankan JDK 17 atau lebih baru), lalu dari folder `java-dasar`:

```bash
javac HelloWorld.java
java HelloWorld
```

Atau langsung tanpa langkah kompilasi manual (Java 11 ke atas):

```bash
java HelloWorld.java
```

Untuk file latihan:

```bash
java latihan/day1.java
```

## Catatan

Repository ini terus diperbarui seiring progres belajar. Struktur folder akan bertambah di setiap tahap (misalnya `java-oop`, `java-collection`, dan seterusnya).
