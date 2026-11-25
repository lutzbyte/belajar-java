public class Array {
  public static void main(String[] args) {
    String[] nama = new String[3];

    nama[0] = "Rusmanto";
    nama[1] = "Budi";
    nama[2] = "Joko";
    System.out.println(nama[0]);

    String username[] = {"lutz", "budi123", "jokoway"};

    System.out.println(username[1]);

    int umur[][] = {
      {10, 20, 30, 40},
      {50, 60, 70, 80},
      {90, 100}
    };

    System.out.println(umur[2][1]);

    boolean mahasiswa[] = new boolean[] {
      true,
      false,
      true
    };

    System.out.println(mahasiswa[1]);
  }
}
