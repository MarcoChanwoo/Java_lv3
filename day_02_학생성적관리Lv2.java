import java.util.Scanner;

public class day_02_학생성적관리Lv2 {
    public static void main(String[] args) {
		int[] arr = { 87, 11, 45, 98, 23 };
		Scanner scan = new Scanner(System.in);

		// 문제1) 인덱스를 입력받아 성적 출력 // 완료
		// 정답1) 인덱스 입력 : 1 성적 : 11점
		int idx = 0; // 입력값
		for (int i = 0; true; i++) { // 제한없이 배열을 검색하도록 설정
			System.out.println("인덱스를 입력하세요(종료는 5)>");
			idx = scan.nextInt();
			if (idx < 0 || idx > 5) { // 입력한 인덱스의 범위 설정
				System.out.println("유효하지 않은 범위입니다.");
				continue;
			} else if (idx >= 0 && idx <= 4) { // 유효 범위라면
				i = idx; // 인덱스 값을 i로 저장
				System.out.println(arr[i]); // 저장된 i인덱스의 배열값 출력
				continue;
			} else if (idx == 5) {
				System.out.println("종료합니다.");
				break;
			}
		}

		// 문2) 성적을 입력받아 성적 출력 // 완료

		int score = 0;
		int a = 0;
		System.out.println("점수 입력하세요>");
		score = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			if (score == arr[i]) {
				System.out.println(i + "번 인덱스");
			}
		}

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점

		// 학번 숫자입력 -> 인덱스 추출 -> 인덱스 번호를 점수 배열에 적용 -> 인덱스 값 출력
		int hak = 0;// 학번 입력
		int b = 0; // 학번 인덱스 저장 용도
		System.out.println("학번을 입력하세요>");
		hak = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			if (hak == hakbuns[i]) {
				b = i; // 학번 인덱스 a에 저장
				if (b == i) {
					System.out.printf("%d점", scores[i]);
				}
			}
        }
    }
		
}
