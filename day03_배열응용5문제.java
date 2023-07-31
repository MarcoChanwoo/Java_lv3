import java.util.Arrays;

public class day03_배열응용5문제 {
    public static void main(String[] args) {
        // 문제1) a의 값과 b의 값을 번갈아가면서 c에 저장
		// 예) c = {10,40,20,50,30,60}
		int a[] = { 10, 20, 30 };
		int b[] = { 40, 50, 60 };
		int c[] = { 0, 0, 0, 0, 0, 0 };

		int cIdx = 0;
		for (int i = 0; i < a.length; i++) {
			c[cIdx] = a[i];
			cIdx++;
			c[cIdx] = b[i];
			cIdx++;
		} // 위에서부터 순서대로 저장됨
		System.out.println("c: " + Arrays.toString(c));

		// 문제 2) aa 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 bb의 값을 저장
		int aa[] = { 10, 20, 30, 40, 50 };
		int bb = 90;
		// 예) aa = {20,30,40,50,90};
		for (int i = 0; i < aa.length - 1; i++) { // 요소는 5개이나 인덱스는 4번까지이므로
			aa[i] = aa[i + 1];
		}
		aa[aa.length - 1] = bb; // aa.length-1: 마지막 인덱스
		System.out.println("aa: " + Arrays.toString(aa));

		// 문제 3) cc 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 dd의 값을 저장
		int cc[] = { 10, 20, 30, 40, 50 };
		int dd = 60;
		// 예) cc[] = {60,10,20,30,40};
		for (int i = cc.length - 1; i > 0; i--) { // 위와 반대
			cc[i] = cc[i - 1];
		}
		cc[0] = dd;
		System.out.println("cc: " + Arrays.toString(cc));

    }
}
