public class day2 {
  public static void main(String[] args) {
    String soal1 = "==== soal 1: Tipe data bukan primitif ====";
    System.out.println(soal1);

    String kota = "Bandung";
    String[] hobi = {"membaca", "coding", "olahraga"};

    System.out.println(kota);
    System.out.println(hobi[0]);
    System.out.println(hobi[1]);
    System.out.println(hobi[2]);

    System.out.println("\n==== soal 2: Array ====");

    int[] nilai = new int[4];
    nilai[0] = 80;
    nilai[1] = 75;
    nilai[2] = 90;
    nilai[3] = 85;
    nilai[1] = 95;

    System.out.println(nilai[0]);
    System.out.println(nilai[1]);
    System.out.println(nilai[2]);
    System.out.println(nilai[3]);
    System.out.println(nilai.length);

    System.out.println("\n==== soal 3: Operasi matematika ====");
    int a = 17;
    int b = 5;
    double c = 17.0;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
    System.out.println(c / b);

    System.out.println("\n==== soal 4: Operasi perbandingan ====");
    int x = 10;
    int y = 20;

    System.out.println(x == y);
    System.out.println(x != y);
    System.out.println(x < y);
    System.out.println(x > y);
    System.out.println(x <= 10);
    System.out.println(y >= 25);

    System.out.println("\n==== soal 5: Operasi boolean ====");
    boolean hujan = true;
    boolean bawaPayung = false;
    int umur = 17;
    boolean punyaKtp = false;

    System.out.println(hujan && bawaPayung);
    System.out.println(hujan || bawaPayung);
    System.out.println(!hujan);
    System.out.println(!bawaPayung);
    System.out.println((umur >= 17) && punyaKtp);
    System.out.println((umur >= 17)|| punyaKtp);

    System.out.println("\n==== soal 6: Prediksi output ====");
    int p = 7;
    int q = 2;
    double r = p / q;
    double s = p / 2.0;
    boolean t = (p % q == 1) && (r < s);
    System.out.println(p / q); // 3
    System.out.println(p % q); // 1
    System.out.println(r); // 3.0
    System.out.println(s); // 3.5
    System.out.println(t); // true

    System.out.println("\n==== soal 7: Expression, statement, block ====");
    int panjang = 8;
    int lebar = 5;
    int luas;
    { // block
      luas = panjang * lebar; // expression: panjang * lebar | statement: luas = panjang * lebar;
      System.out.println(luas);
    } // block
  }
}
