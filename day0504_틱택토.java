import java.util.Scanner;
// 배열 5단계
// 23/06/25 14:00 제출
// 연습 및 복습 많이 할 것!
public class day0504_틱택토 {
  /* 
	* # 틱택토
	* === 틱택토 ===
	* [X][X][O]
	* [ ][O][ ]
	* [ ][ ][ ]
	* [p1]인덱스 입력 : 6
	* === 틱택토 ===
	* [X][X][O]
	* [ ][O][ ]
	* [O][ ][ ]
	* [p1]승리
	* 
	*/
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] game = new int[9];
    int player = 1;
    int turn = 1;
    int count = 0; // 게임 진행횟수

    while (true) {
      // 기본 게임판
      System.out.println("==틱택토==");
      for (int i = 0; i < game.length; i++) {
        if (i % 3 == 0 && i != 0) {
          System.out.println();
        }
        if (game[i] == 0) {
          System.out.print("[ ]");
        } else if (game[i] == 1) {
          System.out.print("[O]");
        } else if (game[i] == 2) {
          System.out.print("[X]");
        }
      }

      // 승부 판정
      boolean winner = false; // 쉽게 생각하면, winner가 정해졌는가? 아직 아니니 false로 기본 설정
      // 1) 가로
      for (int i = 0; i < game.length - 2; i += 3) {
        if (game[i] == player && game[i + 1] == player && game[i + 2] == player) {
          winner = true;
          break;
        }
      }
      // 2) 세로
      for (int i = 0; i < game.length - 6; i++) {
        if (game[i] == player && game[i + 3] == player && game[i + 6] == player) {
          winner = true;
          break;
        }
      }
      // 3) 대각선 - 좌상우하, 우상좌하 모두 한개씩의 경우의 수이므로 직접 인덱스 번호로 설정
      if ((game[0] == player && game[4] == player && game[8] == player)
          || (game[2] == player && game[4] == player && game[6] == player)) {
        winner = true;
        // break;
      }

      System.out.println();
      if (winner) {
        System.out.println("[p" + player + "]의 승리!");
        break;
      } else if (count == 9) {
        System.out.println("무승부..!");
        break;
      }

      // player 턴전환 설정
      player = (turn % 2 == 1) ? 1 : 2; // 홀수턴-1, 짝수턴-2
      // if(turn%2==1){
      //   player=1;
      // }else{
      //   player=2;
      // }
      // 삼항연산자를 자주 활용하는 버릇을 들이자(매우 유용함)

      System.out.println("[p" + player + "] 인덱스 입력: ");
      int in = scan.nextInt();

      if (in >= 0 && in <= 8) {
        if (game[in] == 0) {
          game[in] = player;
          turn++;
          count++;
        } else {
          System.out.println("이미 선택된 자리입니다.");
        }
      } else {
        System.out.println("유효하지 않은 숫자입니다.\n0~8사이의 숫자만 입력하세요!");
        continue;
      }

    } // while

  }
}