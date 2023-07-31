import javax.sound.midi.Synthesizer;

public class day0704_삼각형문제 {
    
    public static void main(String[] args) {
    /*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		for (int i = 0; i < 3; i++) {
          for (int j = 0; j <= i; j++) {
            System.out.print("#");
          }
          System.out.println();
        }

        System.out.println();
    /*
     * 논리
     * 1. 바깥의 for문에서는 i변수를 이용해서 총 3줄을 생성한다(행).
     *  i의 초기값은 0이며, i가 3보다 작은 동안에 루프를 반복한다. 
     *  각각의 루프마다 i를 1씩 증가한다.
     * 
     * 2. 안쪽 for문에서는 j변수를 이용하여 현재 줄의 인덱스까지 #을 출력한다.
     *  j의 쵝값은 0이며, j가 i보다 작거나 같은 동안 루프를 반복한다.
     */


		/*
		 * 문제 2)
		 * ###
		 * ##
		 * #
		 */
        for (int i = 0; i <= 2; i++) {
          for (int j = 2; j >= i; j--) {
            System.out.print("#");
          }
          System.out.println();
        }
        System.out.println();

		/*
		 * 문제 3)
		 * @##
		 * @@#
		 * @@@
		 */
        for (int i = 0; i < 3; i++) { // 총 3줄
          for (int j = 0; j <= i; j++) { // i와 같은 수만큼 나열시킴
            System.out.print("@");
          }
          for (int j = 1; j >= i; j--) {
            System.out.print("#");
          }
          System.out.println();
        }

        System.out.println();   


		/*
		 * 문제 4)
		 *   #
		 *  ###
		 * #####
		 */
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j <= i * 2; j++) {
            System.out.print("#");
          }
          System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 3; i++) { // 총 세 줄
          for (int j = 0; j < 2 - i; j++) {
            System.out.print(" ");
          }
          for (int k = 0; k < i * 2 + 1; k++) {
            System.out.print("#");
          }
          System.out.println();
        }

    }
}
