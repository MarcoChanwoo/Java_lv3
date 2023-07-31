package Lv3_test;

import java.util.Arrays;

public class day0708_test3 {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    int b[] = new int[5];
    int bIdx = 4;

    // arr의 값중 4의 배수만 b에 거꾸로저장
    // 예) b = {0,0,0,40,20};

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 4 == 0) { // 4의 배수 찾기
        b[bIdx--] = arr[i]; // 인덱스 자리에서 직접 증감식 선언
        // b[bIdx] = arr[i];
        // bIdx--;
      }
    }
    System.out.println("b : " + Arrays.toString(b));
  }
}