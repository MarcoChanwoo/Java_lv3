public class day02_학생성적관리Lv1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
        // 예 1) 87, 11, 92, 14, 47
        arr[0] = 87;
        arr[1] = 11;
        arr[2] = 92;
        arr[3] = 14;
        arr[4] = 47;
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 문제2) 전교생의 총점과 평균 출력
        // 예 2) 총점(251) 평균(50.2)
        // 2-1 총점
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.printf("총점: %d", (int) sum);
        System.out.println();
        // 2-2 평균
        double avg = 0;
        for (int i = 0; i < 5; i++) {
            avg = sum / 5;
        }
        System.out.printf("평균: %.1f", avg);
        System.out.println();
        // 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
        // 예 3) 2명
        int pass = 0; // 합격자수
        for (int i = 0; i < 5; i++) {
            if (arr[i] >= 60) {
                pass++;
            }
        }
        System.out.println("성적이 60점 이상인 학생: " + pass + "명");
    }
}
