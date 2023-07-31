public class day04_미니빙고_번외 {
  public static void main(String[] args) {
    int arr[] = {
      3, 3, 3,
      3, 3, 3,
      3, 3, 3
    };

int cnt=0;
// 가로조건
// for(int i=0; i<arr.length-2;i+=3){
//   if(arr[i]==3 && arr[i+1]==3 && arr[i+2]==3){
//     cnt++;
//   }
// }
// // 세로조건
// for(int i=0;i<arr.length-6;i++){
//   if(arr[i]==3 && arr[i+3]==3 && arr[i+6]==3){
//     cnt++;
//   }  
// }
// // 좌상우하조건
// for(int i=0;i<arr.length-8;i+=4){
//   if(arr[i]==3 && arr[i+4]==3 && arr[i+8]==3){
//     cnt++;
//   }
// }
// // 우상좌하조건_1
// for(int i=2;i<arr.length-6;i+=2){
//   if(arr[2]==3 && arr[4]==3 && arr[6]==3){
//     cnt++;
//   }
// }
// 우상좌하조건_2
for (int i = 0; i < arr.length - 7; i += 2) {
    if (arr[i + 2] == 3 && arr[i + 4] == 3 && arr[i + 6] == 3) {
        cnt++;
    }
}


if(cnt>0){
  System.out.printf("빙고!(갯수: %d)",cnt);
}else{
  System.out.println("빙고 아님..");
}


// 3 0 0 3 0 0 3 0 0 
// 0 3 0 0 3 0 0 3 0
// 0 0 3 0 0 3 0 0 3


  }
}
