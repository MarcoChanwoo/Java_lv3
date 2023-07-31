import java.util.Arrays;
import java.util.Random;

public class day04_중복숫자금지Lv1_배열Lv4 {
    /*
     * # 중복숫자 금지[1단계]
     * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
     * 2. 단, 중복되는 숫자는 없어야 한다.
     * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
     * 
     * 예) 랜덤숫자 : 1
     * check = {0, 1, 0, 0, 0}
     * arr = {1, 0, 0, 0, 0}
     * 랜덤숫자 : 3
     * check = {0, 1, 0, 1, 0}
     * arr = {1, 3, 0, 0, 0}
     * 랜덤숫자 : 2
     * check = {0, 1, 1, 1, 0}
     * arr = {1, 3, 2, 0, 0}
     * 
     * 랜덤 수가 중복되어 나오면 다시 실행함
     * 
     */
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] check = new int[5];

        Random rd = new Random();
        int rNum = 0;
        for (int i = 0; i < check.length; i++) {
            rNum = rd.nextInt(5); // 0부터 4까지의 랜덤수 생성

            while (check[rNum] == 1) { // 이미 선택된 숫자인 경우 다시 랜덤수 생성
                rNum = rd.nextInt(5);
            }
            check[rNum] = 1; // 해당 숫자를 선택됨으로 표시
            arr[i] = rNum; // 선택된 숫자를 배열에 저장

            System.out.println("랜덤숫자 : " + arr[i]);
            System.out.println("check = " + Arrays.toString(check));
            System.out.println("arr   = " + Arrays.toString(arr));
        }

    }
}
