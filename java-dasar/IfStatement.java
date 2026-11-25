public class IfStatement {
  public static void main(String[] args) {
    

    var nama = "Rusmanto";
    int umur = 21;

    if (nama == "Rusmanto" && umur >= 18) {
      System.out.println("Kamu sudah dewasa");
    } else {
      System.out.println("Kamu masih kecil");
    }

    // tenary operator
    System.out.println(umur >= 18 ? "Sudah dewasa" : "Masih kecil");

    boolean punyaSim = true;
    String res;

    if (umur >= 18 && punyaSim) {
      res = "Kamu boleh mengemudi";
    } else {
      res = "Kamu tidak boleh mengemudi";
    }

    System.out.println(res);

    int nilai = 80;
    char grade;

    if (nilai >= 90) {
      grade = 'A';
    } else if (nilai >= 80) {
      grade = 'B';
    } else if (nilai >= 75) {
      grade = 'C';
    } else {
      grade = 'E';
    }

    System.out.println(grade);

  }
}
