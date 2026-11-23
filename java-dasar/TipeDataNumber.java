public class TipeDataNumber {
  public static void main(String[] args) {
    byte iniByte = 120; // 1 byte
    short iniShort = 1_000; // 2 byte
    int iniInt = 100_000; // 4 byte
    long iniLong = 1000_000_000; // 8 byte
    long iniLongLong = 1000_000_000_00L; // 8 byte
  
    System.out.println(iniByte);
    System.out.println(iniShort);
    System.out.println(iniInt);
    System.out.println(iniLong);
    System.out.println(iniLongLong);

    float iniFloat = 3.14F; // 4 byte
    double iniDouble = 3.14159; // 8 byte
    
    System.out.println(iniFloat);
    System.out.println(iniDouble);

    int a = (int) iniByte;
    System.out.println(a);
  }
}
