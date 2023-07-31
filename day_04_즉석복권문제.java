import java.util.Arrays;
import java.util.Scanner;

public class day_04_즉석복권문제 {
  /*
   * # 즉석복권 1. 숫자 7이 연속으로 3번 등장하면, "당첨" 출력.
   * 조건) 중복당첨 없음, 7이 8개 나열되어도 당첨횟수는 한번임
   * 
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] lotto = { 0, 0, 7, 7, 0, 0, 0, 0 };
    // int[] lotto = { 0, 7, 0, 7, 0, 7, 0, 7 };

    int cnt = 0; // 최종 당첨이 확인되는 경우

    boolean run = true; // 7이 3연속 나올 때까지 무한 반복
    while (run) {
      System.out.println("===복권 결과===");
      System.out.print("메뉴를 선택하세요.\n1-결과확인\n2-프로그램 종료 ");
      int sel = scan.nextInt();
      if (sel == 1) { // 당첨결과 확인
        System.out.printf("[%d] 최종 결과 확인\n", sel);
        for (int i = 0; i < lotto.length - 2; i++) {
          if (lotto[i] == 7 && lotto[i + 1] == 7 && lotto[i + 2] == 7) { // 3연속 7
          cnt++;
            continue; // 바로 당첨 확인 시 종료
          } 
          // else if (lotto[i] != 7 || lotto[i + 1] != 7 || lotto[i + 2] != 7) { 
              
          //   continue; // 모든 경우를 다 확인 후 맞으면 당첨 안내
          // }
        }
        System.out.println(cnt);
        // cnt 수를 통해 당첨여부 확인
        // if (cnt > 0) {
        //   System.out.println("최종 당첨!");
        // } else if (cnt == 0) {
        //   System.out.println("꽝");
        // }

      } else if (sel == 2) { // 프로그램 종료
        System.out.printf("[%d] 프로그램 종료", sel);
        run = false;
      }
    }
  }
}