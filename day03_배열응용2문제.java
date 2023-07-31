import java.util.Arrays;
import java.util.Scanner;

public class day03_배열응용2문제 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 문제1) 인덱스(방번호)를 입력하면 값출력
        int a[] = { 10, 20, 30, 40, 50 };
        // 예) 3 ==> 40
        System.out.println("인덱스를 입력하세요>");
        int idxE = scan.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (idxE == i) {
                System.out.println("값: " + a[i]);
            }
        }

        // 문제2) 아래배열중 가장큰값 출력
        int b[] = { 12, 54, 23, 87, 1 };
        // 예) 87
        int max = b[0];
        for (int i = 0; i < b.length; i++) {
            if (max <= b[i]) {
                max = b[i];
            }
        }
        System.out.printf("최대값: %d", max);
        System.out.println();

        // 문제3) 아래 배열중 홀수의 개수 출력
        int c[] = { 12, 54, 23, 87, 1 };
        // 예) 홀수의 개수 : 3
        int count = 0; // 홀수 카운트
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 2 == 1) {
                count++;
            }
        }
        System.out.printf("홀수: %d개", count);
        System.out.println();

        // 문제4) 아래배열을 거꾸로 저장
        int d[] = { 1, 2, 3, 4, 5 };
        int e[] = { 0, 0, 0, 0, 0 };
        // 예) ={5,4,3,2,1};
        int eIdx = 0; // e배열 0번 인덱스부터 입력시키기 위함
        for (int i = 4; i >= 0; i--) {
            e[eIdx] = d[i];
            eIdx++;
        }
        System.out.println("e: " + Arrays.toString(e));
    }
}
