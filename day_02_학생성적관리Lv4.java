public class day_02_학생성적관리Lv4 {
    public static void main(String[] args) {
        int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
        int[] scores = { 87, 88, 100, 98, 99 };

        // 문제) 1등학생의 학번과 성적 출력
        // 정답) 1004번(98점)

        int max = scores[0]; // 임의로 최대값 변수 지정(0번 인덱스)
        int a = 0; //score
        int b = 0; // 학번
        for (int i = 0; i < 5; i++) {
            if (max < scores[i]) { // 임의의 i인덱스가 max보다 크면
                max = scores[i]; // max에 큰 값을 담음
                a=scores[i];
                b=hakbuns[i];
            }
        }
        System.out.printf("%d, %d",a,b);

    }
}
