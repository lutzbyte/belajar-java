public class day3 {
  public static void main(String[] args) {
    /* soal 1: If, else if, else */
    int[] nilaiSiswa = {95, 85, 78, 50};

    for (int i = 0; i < nilaiSiswa.length; i++) {
      if (nilaiSiswa[i] >= 90) {
        System.out.println("A");
      } else if (nilaiSiswa[i] >= 80) {
        System.out.println("B");
      } else if (nilaiSiswa[i] >= 70) {
        System.out.println("C");
      } else {
        System.out.println("D");
      }
    }

    /* soal 2: Switch */
    int hari = 9;

    String ucapan = switch (hari) {
      case 1 -> "Senin";
      case 2 -> "Selasa";
      case 3 -> "Rabu";
      default -> "Hari lain";
    };

    System.out.println(ucapan);

    /* soal 3: Ternary */
    // int bilangan = 7;
    int bilangan = 10;

    String jenis = bilangan % 2 == 0 ? "Genap" : "Ganjil";
    System.out.println(jenis);

    /* soal 4: For loop */
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }

    for (int j = 10; j >= 1; j -= 2) {
      System.out.println(j);
    }

    /* soal 5: While loop */
    int hitung = 3;

    while (hitung >= 1) {
      System.out.println(hitung);
      hitung--;
    }

    /* soal 6: Do while */
    int n = 10;
    int m = 1;

    do {
      System.out.println(n);
      n++;
    } while (n < 5);

    do {
      System.out.println(m);
      m++;
    } while (m <= 3);

    /* soal 7: Break */
    for (int i = 1; i <= 10; i++) {

      if (i > 5) {
        break;
      }

      System.out.println(i);
    }

    /* soal 8: Continue */
    for (int i = 1; i <= 8; i++) {

      if (i % 3 == 0) {
        continue;
      }

      System.out.println(i);
    }

    /* soal 9: Prediksi output */
    // 4
    // 27
    
    /* soal 10: Perbaiki kode */
    int umur = 20;

    if (umur >= 17 && umur < 60) {
      System.out.println("Dewasa");
    } else {
      System.out.println("Bukan dewasa");
    }

    int j = 1;

    while (j <= 3) {
      System.out.println(j);
      j++;
    }

    String hasil = umur > 18 ? "Dewasa" : "Anak";
    System.out.println(hasil);

    /* soal 11: Tulis dari nol */
    int[] harga = {15000, 8000, 22000, 5000, 30000};
    int jumlahHarga = 0;
    int jumlahItem = 0;

    for (int i = 0; i < harga.length; i++) {
      if (harga[i] < 10000) {
        continue;
      }

      if (harga[i] > 25000) {
        break;
      }

      jumlahHarga += harga[i];
      jumlahItem++;
    }

    String ongkir = jumlahHarga >= 30000
      ? "Gratis ongkir"
      : "Bayar ongkir";
    System.out.println(jumlahHarga);
    System.out.println(jumlahItem);
    System.out.println(ongkir);
  }
}
