import java.util.*;

public class day03_배열응용1문제 {
    public static void main(String[] args) {
        int a[] = { 10, 49, 51, 36, 17 };

        // 문제 1) 다음 리스트를 값을 입력하면 번호 출력
        // 예) 51 ==> 2
        // 예) 10 ==> 0

        Scanner scan = new Scanner(System.in);
        System.out.println("값을 입력하세요>");
        int search = scan.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (search == a[i]) {
                System.out.println("인덱스: " + i);
            }
        }

        // 문제 2) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
        // 예) b = [0, 49, 51, 0, 17] <- 이렇게 만들기

        int b[] = { 0, 0, 0, 0, 0 };

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                b[i] = a[i];
            }
        }
        System.out.println("b = " + Arrays.toString(b));

        // 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터 저장)
        // 2번문제와 조금 다름
        // 예) c = [49, 51, 17, 0, 0]
        int c[] = { 0, 0, 0, 0, 0 };
        int cIdx = 0; // c인덱스를 0번부터
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                c[cIdx] = a[i];
                cIdx++;
            }
        }
        System.out.println(Arrays.toString(c));

        // -------------------------------------------------
        int arr[] = { 1001, 20, 1002, 45, 1003, 54 };
        // 학번과 점수가 한쌍이다. ==> 1001:20 , 1002:45 , 1003:54

        // 문제4) 학번을 입력하면 점수 출력
        // 예) 1001==>20 , 1003 ==> 54

        System.out.println("학번을 입력하세요>");
        int hak = scan.nextInt();
        int cnt1 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (hak == arr[i] && i % 2 == 0) {
                System.out.printf("점수: %d점", arr[i + 1]);
                cnt1++;
            }
        }
        if (cnt1 < 0) {
            System.out.println("학번이 아닙니다.");
        }

        // 문제5) 점수를 입력하면 학번 출력
        // 예) 20 ==> 1001 , 45 ==> 1002
        System.out.println("점수를 입력하세요>");
        int score = scan.nextInt();
        int cnt2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (score == arr[i] && i % 2 == 1) {
                System.out.printf("학번: %d", arr[i - 1]);
                cnt2++;
            }
        }
        if (cnt2 < 0) {
            System.out.println("점수가 아닙니다.");
        }

    }
}
