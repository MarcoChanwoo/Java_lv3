import java.util.Scanner;

public class day_02_학생성적관리Lv3 {

    public static void main(String[] args) {
        int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
        int[] scores = { 87, 11, 45, 98, 23 };

        // 문제) 학번을 입력받아 성적 출력
        // 단, 없는학번 입력 시 예외처리
        // 예)
        // 학번 입력 : 1002 성적 : 11점
        // 학번 입력 : 1000 해당학번은 존재하지 않습니다.

        Scanner scan = new Scanner(System.in);

        int idx = -1; // 범주에 없는 인덱스를 걸러냄
        System.out.println("학번을 입력하세요>");
        int hak = scan.nextInt();

        for (int i = 0; i < 5; i++) {
            if (hak == hakbuns[i]) {
                System.out.println(scores[i] + "점");
                idx++;
            }
        }
        if (idx < 0) {
            System.out.println("없는 학번입니다.");
        }
    }
}