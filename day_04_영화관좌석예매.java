import java.util.Arrays;
import java.util.Scanner;

// 배열 4단계 
public class day_04_영화관좌석예매 {
	/*
	 * # 영화관 좌석예매
	 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
	 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
	 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
	 * 4. 한 좌석당 예매 가격은 12000원이다.
	 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
	 * 예)
	 * seat = 0 0 0 0 0 0 0
	 * 
	 * 좌석선택 : 1
	 * seat = 0 1 0 0 0 0 0
	 * 
	 * 좌석선택 : 3
	 * seat = 0 1 0 1 0 0 0
	 * 
	 * 좌석선택 : 3
	 * seat = 0 1 0 1 0 0 0
	 * 이미 예매가 완료된 자리입니다.
	 * ----------------------
	 * 매출액 : 24000원
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[7]; // 좌석 배열, 초기값은 0

		int price = 12000;
		int cnt = 0; // 예약 인원수
		int seatNum = 0;
		int money = 0; // 합산
		boolean run = true;
		while (run) {
			System.out.println("=영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.예매종료");

			System.out.print("메뉴 선택: ");
			int sel = scan.nextInt();

			if (sel == 1) {
				// System.out.println();
				System.out.println("좌석예매를 선택하셨습니다!\n원하시는 좌석을 고르세요");
				System.out.println(Arrays.toString(seat));
				for (int i = 0; i < seat.length; i++) {
					System.out.print("좌석선택: ");
					seatNum = scan.nextInt(); // 좌석 선택(인덱스 번호 입력)
					if (seatNum < 0 || seatNum > 6) {
						System.out.println("유효하지 않습니다!");
					} else if (seat[seatNum] == 1) {
						System.out.println(Arrays.toString(seat));
						System.out.printf("%d번은 이미 예매가 완료된 자리입니다.\n다른 자리로 선택하세요.\n", seatNum);
						break; // 재예약 안하고 그냥 결제하러 갈 수도 있으므로 메인메뉴로 회귀
					} else {
						seat[seatNum] = seatNum;
						seat[seatNum] = 1;
						System.out.println(Arrays.toString(seat));
						System.out.printf("예약 성공! %d번이 예약되었습니다!", seatNum);
						cnt++;
						break;
					}
				}
				System.out.println();
			} else if (sel == 2) {
				System.out.println(Arrays.toString(seat));
				System.out.printf("예약하신 좌석은 총 %d석 입니다.\n", cnt);
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						money = cnt * price;
					}
				}
				System.out.printf("금액은 %d원 입니다.\n이용해주셔서 감사합니다.\n", money);
				System.out.println("-----------------");
				System.out.printf("매출액: %d원", money);
				run = false;
			}
		}
	}
}
