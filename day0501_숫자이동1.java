import java.util.Arrays;
import java.util.Scanner;

public class day0501_숫자이동1 {
    /*
	 * # 숫자이동[1단계]
	 * 1. 숫자2는 캐릭터이다.
	 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
	 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
	 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
	 * 4. {0, 0, 2, 0, 0, 0, 0};  ==> 왼쪽 ==> {0, 2, 0, 0, 0, 0, 0};
	 * 
	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int[] game = { 0, 0, 2, 0, 0, 0, 0 };

		int player = -1; // 2의 위치를 찾기 위함
        // 만약 0이나 6인덱스 외부의 값이 입력되는 경우 배열 내에 2가 없음을 안내하거나

		boolean run = true;

		while (run) {
			System.out.println(Arrays.toString(game));
			System.out.println("1.왼쪽  2.오른쪽 3.게임 종료");
			int sel = scan.nextInt();
			for (int i = 0; i < 7; i++) {
				if (game[i] == 2) {
					player = i;
				}
			}
			if (sel == 1) {
				if (player > 0) {
					game[player] = 0;
					game[player - 1] = 2;
				} else {
					System.out.println("왼쪽 이동 불가!");
				}
			} else if (sel == 2) {
				if (player < 6) {
					game[player] = 0;
					game[player + 1] = 2;
				} else {
					System.out.println("오른쪽 이동 불가!");
				}
			} else if (sel == 3) {
				System.out.println("게임을 종료합니다.");
				run = false;
			} else {
				System.out.println("1~3 메뉴 중에서만 선택하세요!");
			}

		}

    }
}
