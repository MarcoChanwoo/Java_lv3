import java.util.Arrays;
import java.util.Scanner;

// 배열 6단계
public class day_0601_배열컨트롤러1문제 {
  public static void main(String[] args) {
    // 문제1) 추가 를 선택하고 값을 입력하면 10 , 20 뒤에 저장한다.
    // 최대 5개까지 저장
    Scanner scan = new Scanner(System.in);

    int[] arr = { 10, 20, 0, 0, 0 };
    int cnt = 2;

    boolean run = true;
    while (run) {

      for (int i = 0; i < cnt; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();

      System.out.print("메뉴 선택 : \n");
      System.out.println("[1]추가\n[2]프로그램 종료");
      int sel = scan.nextInt();

      if (sel == 1) {
        if (cnt > 4) {
          System.out.println("더 이상 추가할 수 없습니다.");
          continue;
        }
        System.out.print("추가할 값 입력 : ");
        int data = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
          int tmp = arr[cnt];
          arr[cnt] = data;
          data = tmp;
        }
        cnt++; // 카운트를 증가하며 새 인덱스에 값 저장

      } else if (sel == 2) {
        System.out.println("프로그램을 종료합니다.");
        run=false;
      }

    }
  }
}
