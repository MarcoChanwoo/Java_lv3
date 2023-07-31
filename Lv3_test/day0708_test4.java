package Lv3_test;

import java.util.Arrays;
import java.util.Scanner;

public class day0708_test4 {
  public static void main(String[] args) {
    int arr[] = { 0, 2, 0, 4, 3, 0, 0, 5, 6 };
    // int arr[] = { 1, 2, 0, 3, 4, 0, 0, 5, 8 };
    // int arr[] = { 1, 5, 0, 3, 0, 0, 0, 0, 0 };

    // 아래 번호를 입력받고 각방향 으로 0 이아닌숫자를 모으시요.
    // 1)left 2)right

    // 예) 1) left ==> arr = [2, 4, 3, 5, 6, 0, 0, 0, 0]
    // 예) 1) right ==> arr = [0, 0, 0, 0, 2, 4, 3, 5, 6]
    Scanner scan = new Scanner(System.in);
    int left[] = new int[9];
    int right[] = new int[9];
    int input = 0; // 입력값

    boolean run = true;
    System.out.println(Arrays.toString(arr));
    while (run) {
      int lIdx = 0;
      int rIdx = 8;
      System.out.println("선택하세요");
      System.out.println("1) left 2) right 3) 종료");
      input = scan.nextInt();
      if (input == 1) { // 왼쪽부터 정렬
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] != 0) {
            left[lIdx++] = arr[i];
          }
        }
        System.out.println("left : "+Arrays.toString(left));
      } else if (input == 2) { // 오른쪽부터 정렬
        for (int i = 8; i >= 0; i--) {
          if (arr[i] != 0) {
            right[rIdx--] = arr[i];
          }
        }
        System.out.println("right : "+Arrays.toString(right));
      } else if (input == 3) {
        System.out.println("프로그램을 종료합니다.");
        run = false;
      } else if (input != 1 || input != 2) {
        System.out.println("유효하지 않은 숫자입니다.");
        continue;
      }
    } // while
  }
}
