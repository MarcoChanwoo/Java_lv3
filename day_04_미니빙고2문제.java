public class day_04_미니빙고2문제 {
  // 제출완료
  public static void main(String[] args) {
    int arr[] = {
        0, 0, 0,
        0, 0, 3,
        3, 3, 0
    };
    // 문제2) 만약에 가로에 3이 연속으로 3개있으면 "빙고" 출력

    int cnt = 0;
    for (int i = 0; i < arr.length - 2; i += 3) {
      if (arr[i] == 3 && arr[i + 1] == 3 && arr[i + 2] == 3) {
        cnt++;
      }
    }

    if (cnt > 0) {
      System.out.printf("빙고(갯수: %d)", cnt);
    } else {
      System.out.println("빙고 없음..");
    }
  }
}
