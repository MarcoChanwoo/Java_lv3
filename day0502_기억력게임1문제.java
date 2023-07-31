import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// 배열 5단계
// 최종 제출 답안
public class day0502_기억력게임1문제 {
    /*
	 * # 기억력 게임
	 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
	 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
	 *    back에 모든 수가 채워지면 게임은 종료된다.
	 * 예)
	 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
	 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	 * 입력1 : 0
	 * 입력2 : 1
	 * 
	 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
	 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
	 */
    public static void main(String[] args) {
      Random ran = new Random();
      Scanner scan = new Scanner(System.in);

      int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
      int[] back = new int[10];

      // 셔플(shuffle)
      int i = 0;
      while (i < 1000) {
        int r = ran.nextInt(10);
        int temp = front[0];
        front[0] = front[r];
        front[r] = temp;

        i += 1;
      }

      boolean run = true; // 올바른 back이 채워질 때까지 반복하도록 설정
      int cnt = 0; // 맞춘개수 카운트

      while (run) {
        System.out.println(Arrays.toString(front));
        System.out.println(Arrays.toString(back));
        System.out.println("입력1: ");
        int num1 = scan.nextInt();
        System.out.println("입력2: ");
        int num2 = scan.nextInt();

        if (num1 == num2) { // 같은 인덱스를 두번 입력할때
          System.out.println("같은 숫자는 입력 불가!");
          continue;
        } else if (front[num1] != front[num2]) { // 숫자를 맞히지 못했을때
          System.out.println("다시 생각해 보세요.");
          continue;
        } else if (back[num1] == 0 && back[num2] == 0) { // 정확하게 맞힐 때
          back[num1] = front[num1];
          back[num2] = front[num2];
          cnt++;
          System.out.println("정답!");
        } else if (back[num1] != 0 || back[num2] != 0) { // 이미 맞힌 경우에
          System.out.println("이미 맞힌 숫자입니다!");
        }

        if (cnt == 5) { // 최종 판정
          System.out.println(Arrays.toString(front));
          System.out.println(Arrays.toString(back));
          System.out.println("게임 완성!");
          run = false;
        }

      }

    }
}
