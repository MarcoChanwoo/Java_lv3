import java.util.Arrays;
import java.util.Scanner;

public class day_0602_회원가입문제 {
  /*
   * # 회원가입
   * 1. 가입
   * . 아이디 와 비밀번호를 입력받아 가입
   * . 아이디 중복검사
   * 2. 탈퇴
   * . 아이디 를 입력받아 탈퇴
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] ids = { 1001, 1002, 0, 0, 0 };
    int[] pws = { 1111, 2222, 0, 0, 0 };
    int[] idUpdate = new int[5];
    int[] pwUpdate = new int[5]; // 탈퇴 후 새로운 배열에 업데이트
    int cnt = 2;
    int inputId;
    int inputPw;
    int nIdx = 0; // 새 인덱스 설정

    boolean run = true;
    while (run) {
      System.out.println("1.가입");
      System.out.println("2.탈퇴");

      System.out.print("메뉴 선택(종료는 3) : ");
      int sel = scan.nextInt();

      // 가입
      if (sel == 1) {
        if (cnt > 4) {
          System.out.println("죄송합니다. 더 이상 가입은 불가합니다.");
        }
        System.out.println(Arrays.toString(ids));
        System.out.println(Arrays.toString(pws));

        System.out.println("이용하실 아이디를 입력하세요.");
        inputId = scan.nextInt();
        if (inputId > 999 && inputId < 10000) {
          System.out.println("비밀번호를 등록하세요>");
          inputPw = scan.nextInt();
          boolean found = false; // 배열 내부에 입력한 값의 유무를 찾을 것이므로 boolean
          for (int i = 0; i < ids.length; i++) {
            if (inputId == ids[i]) {
              found = true;
            }
          }
          if (!found) {
            System.out.println("등록되었습니다!");
            for (int i = 0; i < ids.length; i++) { // cnt번호가 해당 아이디의 인덱스가 됨
              int tmp = ids[cnt];
              ids[cnt] = inputId;
              inputId = tmp;
            }
            for (int i = 0; i < pws.length; i++) {
              int tmp2 = pws[cnt];
              pws[cnt] = inputPw;
              inputPw = tmp2;
            }
            cnt++;
            System.out.println(Arrays.toString(ids));
            System.out.println(Arrays.toString(pws));
          } else {
            System.out.println("이미 존재하는 아이디입니다. 다시 선택하세요");
          }
        } else {
          System.out.println("아이디는 네 자리로만 등록하세요!");
        }

        // 탈퇴
      } else if (sel == 2) {
        System.out.println("탈퇴를 진행합니다. 아이디를 입력해주세요>");
        inputId = scan.nextInt();
        System.out.println("비밀번호를 입력해주세요>");
        inputPw = scan.nextInt();

        int remove = -1; // 탈퇴할 계정 인덱스 검색

        for (int i = 0; i < ids.length; i++) {
          if (inputId == ids[i] && inputPw == pws[i]) {
            remove = i; 
          }
        }

        if (remove != -1) { // 인덱스가 있다면
          for (int i = remove; i < ids.length - 1; i++) { // i=remove: 삭제된 자리부터 정리
            ids[i] = ids[i + 1];
            pws[i] = pws[i + 1];
          }
          ids[ids.length - 1] = 0;
          pws[pws.length - 1] = 0; // 앞당기고 마지막 자리 0처리

          System.out.println("탈퇴가 완료되었습니다.");
        } else {
          System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
        }
        System.out.println(Arrays.toString(ids));
        System.out.println(Arrays.toString(pws));

      } else if (sel == 3) {
        System.out.println("프로그램을 종료합니다.");
        run = false;
      } else {
        System.out.println("유효하지 않은 번호입니다.");
      }
      if (cnt > 4) {
        System.out.println("모든 가입이 마감되었습니다.");
      }

    }

  }
}
