public class day01_배열기본문제1 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 5개의 인덱스가 있음
        // 문제1) 10부터 50까지 arr 배열에 저장
        // 정답1) 10 20 30 40 50
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 문제2) 전체 합 출력
        // 정답2) 150
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
