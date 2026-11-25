public class SwitchStatement {
  public static void main(String[] args) {
    

    String hari = "senin";

    switch (hari) {
      case "senin":
        System.out.println("Awal minggu");
        break;
      case "selasa":
        System.out.println("Hari kedua");
        break;
      case "rabu":
        System.out.println("Hari ketiga");
        break;
      default:
        System.out.println("Hari tidak ditemukan");
        break;
    }

    int angka1 = 20;
    int angka2 = 5;
    String operator = "+";

    switch (operator) {
      case "+" -> System.out.println("Hasil " + (angka1 + angka2));
      case "-" -> System.out.println("Hasil " + (angka1 - angka2));
      case "*" -> System.out.println("Hasil " + (angka1 * angka2));
      case "/" -> System.out.println("Hasil " + (angka1 / angka2));
      default -> System.out.println("operator tidak dikenal");
    }

    int nilai = 85;

    String hasil = switch (nilai) {
      case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> "E";
      default -> switch (nilai / 10) {
        case 10, 9 -> nilai <= 100 ? "A" : "Nilai tidak valid";
        case 8 -> "B";
        case 7 -> "C";
        case 6 -> "D";
        case 0, 1, 2, 3, 4, 5 -> "E";
        default -> "Nilai tidak valid";
      };
    };

    System.out.println("Predikat: " + hasil);

  }
}
