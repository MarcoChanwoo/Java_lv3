import java.util.Arrays;
import java.util.Scanner;

public class day03_배열응용4문제 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장
        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = { 0, 0, 0, 0, 0 };
        // 예) 30 ==> b[] = {10,20,40,50,0};
        System.out.println("a: "+Arrays.toString(a));
        System.out.println("제외할 값 입력>");
        int num = scan.nextInt();
        int bIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (num != a[i]) {
                b[bIdx++] = a[i];
            }
        }
        System.out.println("b: " + Arrays.toString(b));
        System.out.println();

        // 문제 2) 아래 배열에서 내가 입력한 번호의 "번호와 값" 만 빼고 d 에 저장
        int c[] = { 1001, 40, 1002, 65, 1003, 70, 1004, 85 };
        int d[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
        // 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
        System.out.println("c: "+Arrays.toString(c));
        System.out.println("제외할 학번 입력");
        int num2 = scan.nextInt();
        int dIdx = 0;
        int odd = 0; // 홀수번째 인덱스 제외 용도
        for (int i = 0; i < c.length; i += 2) { // 연속된 두 인덱스가 한 묶음이므로 i += 2
            if (num2 != c[i]) {
                d[dIdx++] = c[i];
                if (i + 1 <= c.length) { // 위의 조건이면서 다음 인덱스가 bound를 넘지 않는다면
                    d[dIdx++] = c[i + 1];
                }
            }
            if (num2 == c[i + 1]) { // 입력된 값이 홀수번째 인덱스에 해당되면 학번이므로 제외
                odd = num2;
            }
        }
        if (num2 == odd) {
            System.out.printf("%d는 학번이 아닙니다.", num2);
        } else {
            System.out.println("d: " + Arrays.toString(d));
        }

    }
}
