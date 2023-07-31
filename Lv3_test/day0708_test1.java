package Lv3_test;

public class day0708_test1 {
  // for를 사용해서 풀어보세요
  // 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)
  // 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
  // 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
  public static void main(String[] args) {
    // 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)
    int cnt = 0; // 9의 갯수 카운트
    int num = 0; // 9의 배수 나열
    for (int i = 50; i <= 100; i++) {
      if (i % 9 == 0) { // 그 중 9의 배수가 있다면
        System.out.print(i + " "); // 9의 배수 출력
        cnt++;
      }
    }
    System.out.printf("\n9의 배수 : %d개\n", cnt);

    // 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
    int num2 = 0; // 가장 큰 수를 저장
    for (int i = 0; i < 1000; i += 28) {
      // System.out.print(i+" ");
      num2 = i;// 최근 숫자를 저장함
    }
    System.out.printf("\n가장 큰 세자리 수: %d \n\n", num2);

    // 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
    int cnt2 = 1;// 카운트
    for (int i = 0; cnt2 <= 5; i++) { 
      if (i % 8 == 0) {
        System.out.print(i + " ");
        cnt2++;
      }
    }
    // while문 안쓰고 for문으로 해결하기

  }
}
