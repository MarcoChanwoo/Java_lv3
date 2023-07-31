import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// 배열 5단계
public class day0503_1to4문제 {
  /*
	 * #  1 to 4
	 * 1. arr배열에 1~4 사이의 숫자를 중복없이 랜덤으로 저장한다.
	 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
	 * 3. 정답을 맞추면 해당 값은 9로 변경되어 
   * 모든 값이 9가 되면 게임은 종료된다.
	 * 예)
	 * 4 2 3 1
	 * 입력 : 3
	 * 4 2 3 9
	 * 입력 : 1
	 * 4 9 3 9
	 * ...
   *   
	 */
    public static void main(String[] args) {
      Random ran = new Random();
      Scanner scan = new Scanner(System.in);

      int[] arr = { 1, 2, 3, 4 };
      int[] check = new int[4];

      // arr배열의 요소들을 랜덤으로 check배열에 저장하기.
      int arrIdx = 0;//
      while (arrIdx < 4) {
        int r = ran.nextInt(4); // 0~3사이의 인덱스 추첨
        if (check[r] == 0) {
          check[r] = arr[arrIdx];
          arrIdx++;
          // arr배열의 인덱스를 0~3까지 늘림. (arrIdx++)
          // 랜덤으로 추첨되는 숫자를 check배열의 인덱스로 설정하여 int r -> check[r]
          // check배열에 랜덤으로 저장됨..(check[r]=arr[arrIdx])
        }
      }

      // 문제풀이 진행
      boolean run = true; // 완료시키는 조건이 나올 때까지 반복
      int input = 0; // 입력값
      int cnt = 0; // 종료 설정

      while (run) {
        int min = check[0];
        // 1부터 순서대로 4까지 -> 최소값 순서대로 찾기
        System.out.println("check : " + Arrays.toString(check));
        System.out.println("입력:");
        input = scan.nextInt();
        for (int j = 0; j < check.length; j++) { // 최소값 찾기
          if (check[j] < min) {
            min = check[j];
          }
        }

        if (check[input] == min) { // 입력값이 최고값이면 
          check[input] = 9; // 9로 변경
          cnt++;
        } else {
          System.out.println("다시 입력하세요");
        }

        // 종료 설정
        if (cnt == 4) {
          System.out.println("check : " + Arrays.toString(check));
          System.out.println("게임 종료");
          run = false;
        }

      }

    }
  }
