public class day0702_구구단 {
  public static void main(String[] args) {
    // 문제) 구구단 출력 아래와같이 9단까지출력해보세요.
    /*
     * === 2단 ===
     * 2 X 1 = 2
     * 2 X 2 = 4
     * 2 X 3 = 6
     * 2 X 4 = 8
     * 2 X 5 = 10
     * 2 X 6 = 12
     * 2 X 7 = 14
     * 2 X 8 = 16
     * 2 X 9 = 18
     * === 3단 ===
     * 3 X 1 = 3
     * 3 X 2 = 6
     * ...
     * ...
     */

    for (int i = 2; i <= 9; i++) {
      System.out.println("=== " + i + "단 ===");
      for (int j = 1; j <= 9; j++) {
        System.out.println(i + " X " + j + " = " + (i * j));
      }
    }
  }
}
