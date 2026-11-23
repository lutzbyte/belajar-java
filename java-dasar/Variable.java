public class Variable {
  public static void main(String[] args) {
    String nama = "Rusmanto";
    System.out.println(nama);

    nama = "Yanto";
    System.out.println(nama);

    var umur = 21;
    System.out.println(umur);

    umur = 22;
    System.out.println(umur);

    final String name = "Rusmanto";
    System.out.println(name);

    // Error
    // name = "Joko";

    final int age;
    age = 25;
    System.out.println(age);
  }
}
