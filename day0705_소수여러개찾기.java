import java.util.Scanner;

public class day0705_소수여러개찾기 {
    /*
	 * # 소수찾기[2단계]
	 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
	 * 예)
	 * 입력 : 20
	 * 2, 3, 5, 7, 11, 13, 17, 19
	 */
    // 소수: 약수가 1과 자기 자신 두 개인 수

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("입력>");
      int input = scan.nextInt();
      int cnt = 0;
      

      for (int i = 1; i <= input; i++) { // 0부터 입력한 수까지 증가
        for (int j = 1; j <= i; j++) { // i에서 입력한 수와 하나하나 모두 대조하며 나눔. 약수가 두개만 나오는 수
          if (i % j == 0) {
            cnt++;
          }
        }
        if (cnt == 2) { // 약수 두개
          System.out.print(i + " ");
        }
        cnt = 0;
      }

    }
  }
