public class day01_배열1단계_02 {
    public static void main(String[] args) {
        // 1.배열 사용법(1)
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------");
		// 2.배열 사용법(2) : 축약형
		int[] temp = { 10, 20, 30 }; // 위와 동일하다. temp: 배열 변수명

		for (int i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}

    }
}
