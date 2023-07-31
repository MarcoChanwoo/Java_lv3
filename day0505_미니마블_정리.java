import java.util.Arrays;
import java.util.Scanner;

public class day0505_미니마블_정리 {
  /*
   * # 미니마블
   * 1. 플레이어는 p1과 p2 2명이다.
   * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
   * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
   * 상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
   * 4. 먼저 3바퀴를 돌면 이긴다.
   * 
   * [p2]1~3
   * 1 2 3 4 5 6 7 8
   * 0 1 0 0 0 0 0 0
   * 0 0 0 2 0 0 0 0
   * 
   * [p1]1~3 입력 : 2
   * [p1]이 p2를 잡았다!
   * 1 2 3 4 5 6 7 8
   * 0 0 0 1 0 0 0 0
   * 2 0 0 0 0 0 0 0
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] game = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] p1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] p2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    int turn = 0;
    int idx1 = 0;
    int idx2 = 0;
    p1[idx1] = 1;
    p2[idx2] = 2;
    int nowPlayer = 0;
    int move = 0; // 이동시킬 인덱스 입력값
    int nowIdx = 0;
    int cnt1 = 0;
    int cnt2 = 0;

    while (true) {
      System.out.println("game : " + Arrays.toString(game));
      System.out.println(" p1  : " + Arrays.toString(p1) + " 회전: " + cnt1);
      System.out.println(" p2  : " + Arrays.toString(p2) + " 회전: " + cnt2);

      // player턴 자동설정
      nowPlayer = (turn % 2 == 0) ? 1 : 2; // turn 전환

      System.out.println("[p" + nowPlayer + "] 입력>");
      move = scan.nextInt();
      if (move >= 1 && move <= 3) {
        int[] nowArray = (nowPlayer == 1) ? p1 : p2; // 배열 전환. turn이 짝수일때 p1, 홀수-p2
        nowIdx = (nowPlayer == 1) ? idx1 : idx2; // 인덱스 전환
        nowArray[nowIdx] = 0;
        nowIdx = nowIdx + move;
        if (nowIdx > 7) {
          nowIdx = nowIdx % 8;
          if (turn % 2 == 0) {
            cnt1++;
          } else if (turn % 2 == 1) {
            cnt2++;
          }
        }
        nowArray[nowIdx] = nowPlayer; // 여기까지 기본 움직임 조건

        // 상대 잡기
        if (turn % 2 == 0 && nowIdx == idx2) {
          System.out.println("[p1]이 [p2]를 잡았다");
          p2[idx2] = 0;
          idx2 = 0;
          p2[idx2] = 2;
        } else if (turn % 2 == 1 && nowIdx == idx1) {
          System.out.println("[p2]가 [p1]을 잡았다");
          p1[idx1] = 0;
          idx1 = 0;
          p1[idx1] = 1;
        }

        if (nowPlayer == 1) {
          idx1 = nowIdx;
        } else {
          idx2 = nowIdx;
        }

      } else {
        System.out.println("유효값이 아닙니다!(1~3사이의 숫자만 입력!)");
        turn--;
      }
      turn++;

      // 승자 판정
      if (cnt1 == 3) {
        System.out.println("[p1] 승리!!"+"회전: "+cnt1+"바퀴 도착!");
        break;
      } else if (cnt2 == 3) {
        System.out.println("[p2] 승리!!"+"회전: "+cnt2+"바퀴 도착!");
        break;
      }

    }
  }
}
