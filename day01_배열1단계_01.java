
public class day01_배열1단계_01 {
    /*
	 * # 배열(array)
	 * 1. "같은 종류"의 데이터를 "여러개" 저장하기 위한 기술
	 *      -> 같은 종류, 여러개 저장
	 * 2. 사용법
	 * 		int num = 10;
	 * 		int[] arr = new int[방의 개수]; // arr: 배열 변수명
	 * 		int arr[] = new int[방의 개수];
	 * 
	 * 3. 인덱스(index)
	 * 		0부터 시작하는 방번호(index)가 부여된다.
	 */
    public static void main(String[] args) {
        // 1.일반변수(값 저장)
		int num = 0;
		num = 10;
		System.out.println("num = " + num);
		System.out.println("------------------------------");
		// 2.배열
		int[] arr = null;	// 배열은 null 을 0 대신 사용함 
		arr = new int[5]; // 변수 5개가 생겨나고 기본값 0 이 저장됨.
		
		System.out.println(arr[0]);				// 0
		System.out.println(arr[1]);				// 0
		System.out.println(arr[2]);				// 0
		System.out.println(arr[3]);				// 0
		System.out.println(arr[4]);				// 0
		System.out.println("------------------------------");		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
    }
}