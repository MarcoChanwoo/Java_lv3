import java.util.Arrays;
import java.util.Scanner;

public class day0706_배열응용_답없음 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int arr[] = { 10, 20, 30, 40, 50 };
    int b[] = new int[5];
    int input = 0; // 입력값
    int count = 0;
    int idx = 0; // b배열에 차례대로 입력

    // 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다
    // b배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다.
    // 조건) 만약에 입력한 숫자가 arr 에 없으면 인덱스 대신 -1 저장

    // 예) 10, 20, 10, 1, 50
    // b ={0,1,0,-1,4}

    // 예) 30, 40, 1, 10, 2

    // b = {2,3,-1,0,-1}

    boolean run = true;
    while (run) {
      if (count >= 5) {
        run = false; // 5번째 입력 이후에는 더 이상 입력을 받지 않음
        break;
      }
      System.out.println("숫자를 입력하세요>");
      input = scan.nextInt();
      int existNum = -1; // 배열 내에 숫자 존재 확인
      for (int i = 0; i < arr.length; i++) {
        if (input == arr[i]) {
          existNum = i;
          break;
        }
      }
      b[count] = existNum; // 인덱스 또는 -1 저장
      count++;
    }
    System.out.println(Arrays.toString(b));
  } // while
}
