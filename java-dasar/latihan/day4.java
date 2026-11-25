public class day4 {
  public static void main(String[] args) {
    

    /* Soal 1: Cetak isi array dengan for each */
    System.out.println("Soal 1");
    int[] angka = {4, 9, 2, 7};

    for(var value : angka) {
      System.out.println(value);
    }

    /* Soal 2: Jumlahkan angka yang lebih dari 5 */
    System.out.println("\nSoal 2");
    int[] data = {4, 9, 2, 7, 12};
    int total = 0;

    for(var value : data) {
      if(value > 5) {
        total += value;
      }
    }

    System.out.println(total);

    /* Soal 3: Method tanpa parameter */
    System.out.println("\nSoal 3");
    cetakSalam();
    cetakSalam();

    /* Soal 4: Method dengan parameter */
    System.out.println("\nSoal 4");
    cetakNama("Andi");
    cetakNama("Budi");

    /* Soal 5: Method dengan return value */
    System.out.println("\nSoal 5");
    System.out.println(luasPersegiPanjang(8, 5));
    System.out.println(luasPersegiPanjang(3, 4));
 
    /* Soal 6 Method dengan varargs */
    System.out.println("\nSoal 6");
    System.out.println(jumlahkan(1, 2, 3));
    System.out.println(jumlahkan(10, 20));
    System.out.println(jumlahkan(5));

    /* Soal 7: Method overloading */
    System.out.println("\nSoal 7");
    tampilkan(10);
    tampilkan("Java");
    tampilkan(3, 4);

    /* Soal 8: Faktorial dengan recursion */
    System.out.println("\nSoal 8");
    System.out.println(faktorial(5));
    System.out.println(faktorial(1));
    System.out.println(faktorial(6));

    /* Soal 10: Perbaiki kode method dan scope */
    System.out.println("\nSoal 10");
    int hasil = kuadrat(6);
    System.out.println(hasil);
    System.out.println(jumlahDua(4, 5));

    {
      int sisa = 3;
      System.out.println(sisa);
    }

    /* Soal 11: Jumlah angka genap dengan dua method */
    System.out.println("\nSoal 11");

    System.out.println(adalahGenap(8));
    System.out.println(adalahGenap(7));

    int[] data11 = {3, 8, 5, 12, 7, 20};
    System.out.println(jumlahGenap(data11));
  }

  static void cetakSalam() {
    System.out.println("Selamat belajar Java");
  }

  static void cetakNama(String nama) {
    System.out.println(nama);
  }

  static int luasPersegiPanjang(int panjang, int lebar) {
    int luas = panjang * lebar;
    return luas;
  }

  static int jumlahkan(int... angka) {
    int total = 0;

    for(int value : angka) {
      total += value;
    }

    return total;
  }

  static void tampilkan(int angka) {
    System.out.println(angka);
  }

  static void tampilkan(String teks) {
    System.out.println(teks);
  }

  static void tampilkan(int a, int b) {
    System.out.println(a + b);
  }

  static int faktorial(int n) {
    if (n > 0) {
      return n * faktorial(n - 1);
    } else {
      return 1;
    }
  }

  static int kuadrat(int n) {
    int hasil = n * n;
    return hasil;
  }

  static int jumlahDua(int a, int b) {
    return a + b;
  }

  static boolean adalahGenap(int angka) {
    return angka % 2 == 0;
  }

  static int jumlahGenap(int[] data) {
    int total = 0;

    for (int angka : data) {
      if (adalahGenap(angka)) {
        total += 1;
      }
    }

    return total;
  }
}
