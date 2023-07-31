public class day01_배열기본문제2 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        // 문제1) 4의 배수만 출력
        // 정답1) 20 40
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 4 == 0) {
                System.out.print(arr[i] + " "); // 그것만 출력
            }
        }
        System.out.println();
        // 문제2) 4의 배수의 합 출력
        // 정답2) 60
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 4 == 0) {
                sum += arr[i]; // 더해서 sum에 저장
            }
        }
        System.out.println(sum);
        // System.out.println();
        // 문제3) 4의 배수의 개수 출력
        // 정답3) 2
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 4 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt + "개");

    }
}
