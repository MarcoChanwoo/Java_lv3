import java.util.Scanner;

public class day0707_반복문응용 {
   /*
    * [반복문 심화예제]
    * 
    * 1. -1이 나올 때까지 일련의 수를 입력받는다.
    * 2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
    * 3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
    * 4. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
    * 
    * 예)
    * result 값 입력 : 99
    * 
    * 입력 : 10
    * 입력 : 99
    * 입력 : 20
    * 입력 : 99
    * 입력 : 30
    * 입력 : 99
    * 입력 : 10
    * 입력 : -1
    * 
    * 결과 : key값 99가 첫번재 나타난 것은 2번째 이다.
    */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int key = 99;
      int input = 0; // 입력값
      int totalCnt = 1; // 전체 입력수 카운트
      int keyCnt = 0; // 99가 입력될 시의 카운트 저장
      int recount = 1; // 첫 99가 나오는 순간부터 카운트

      boolean run = true;
      while (run) {
         if (input != -1) {
            System.out.printf("입력: ");
            input = scan.nextInt();
            if (input == key) {
               keyCnt = totalCnt;
            }
            if (input != -1 && keyCnt >= 1) {
               recount++;
            }
            totalCnt++;
         } else if (input == -1) {
            if (keyCnt > 0) {
               System.out.printf("key값 99가 첫번째로 나타난 것은 %d번째이다", totalCnt - recount);
               run = false;
            } else if (input != key) {
               System.out.printf("not found");
               run = false;
            }
         }
      } // while
   }
}
