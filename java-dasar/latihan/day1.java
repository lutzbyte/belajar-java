public class day1 {
  public static void main(String[] args) {
    // buat program yang menyimpan dan mencetak data satu mahasiswa.
    String nama = "Budi";
    int umur = 20;
    double tinggiBadan = 170.5;
    char golonganDarah = 'O';
    boolean statusAktif = true;

    System.out.println(nama);
    System.out.println(umur);
    System.out.println(tinggiBadan);
    System.out.println(golonganDarah);
    System.out.println(statusAktif);

    System.out.println("\n==== Soal 1: Hello World ====");
    System.out.println("Halo, Java");
    System.out.println("Nama saya Andi");
    System.out.println("Saya sedang belajar Java");

    System.out.println("\n==== Soal 2: Tipe data number ====");
    byte jumlahRoda = 4;
    short tahunProduksi = 2019;
    int jarakTempuh = 150000;
    long hargaMobil = 350000000;
    float kapasitasTangki = 45.5F;
    double konsumsiBBM = 12.75;

    System.out.println(jumlahRoda);
    System.out.println(tahunProduksi);
    System.out.println(jarakTempuh);
    System.out.println(hargaMobil);
    System.out.println(kapasitasTangki);
    System.out.println(konsumsiBBM);

    System.out.println("\n==== Soal 3: Char, boolean, nilai variable berubah ====");
    char golongan = 'C';
    boolean terdaftar = true;

    System.out.println(golongan);
    System.out.println(terdaftar);

    golongan = 'D';
    terdaftar = false;

    System.out.println(golongan);
    System.out.println(terdaftar);

    System.out.println("\n==== soal 4: Prediksi output ====");
    String kota = "Jakarta";
    String kotaLain = kota;
    kota = "Bandung";
    int a = 7;
    int b = a;
    a = 9;
    char huruf = 'x';
    boolean cek = true;
    cek = false;

    System.out.println(kota); // Bandung
    System.out.println(kotaLain); // Jakarta
    System.out.println(a); // 9
    System.out.println(b); // 7
    System.out.println(huruf); // x
    System.out.println(cek); // false

    System.out.println("\n==== soal 5: Perbaiki kode ====");
    long populasi = 7500000000L;
    float berat = 65.5F;
    char inisial = 'R';
    String kotaAsal = "Medan";
    boolean aktif = true;
    int jumlahSiswa = 30;

    System.out.println(populasi);
    System.out.println(berat);
    System.out.println(inisial);
    System.out.println(kotaAsal);
    System.out.println(aktif);
    System.out.println(jumlahSiswa);

    System.out.println("\n==== soal 6: Tulis dari nol ====");
    // Buat data satu buku dengan tipe yang paling tepat dan nama berikut:
    var judul = "Pemrograman Java";
    var jumlahHalaman = 350;
    var harga = 89900.5;
    var kategori = 'T';
    var tersedia = true;

    System.out.println(judul);
    System.out.println(jumlahHalaman);
    System.out.println(harga);
    System.out.println(kategori);
    System.out.println(tersedia);

    jumlahHalaman = 400;
    tersedia = false;

    System.out.println(jumlahHalaman);
    System.out.println(tersedia);
  }
}
