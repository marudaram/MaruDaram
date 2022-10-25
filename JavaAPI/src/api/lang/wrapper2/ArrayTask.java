package api.lang.wrapper2;

import java.util.Arrays;

public class ArrayTask {
	
	public static void main(String[] args) {
		
		//문자열 배열 생성
		String[] arr = {"마루", "다람", "나나", "초코", "미르", "진주"};
		
//		//배열을 순회하면서 출력
//		for(String doggy : arr) {
//			System.out.println(doggy);
//		}
		//문자열의 크기 비교하는 메서드: compareTo, compareToIgnorecase
//		System.out.println(arr[1].compareTo(arr[0]));
		//compareTo 사용할 시 양수면 0이면 같음, 음수면
		
		//선택 정렬
		//배열의 복제
		String[] copyArr = Arrays.copyOf(arr, arr.length);
//		for(String doggy : copyArr) {
//			System.out.println(doggy);
//		}
		//선택정렬
		//첫번째부터 n-1 번째 데이터까지 
		for(int i = 0; i < copyArr.length; i++) {
			//자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j = i+1; j < copyArr.length; j++) {
				//뒤에 있는 데이터가 더 크다면 교환
				if(copyArr[i].compareTo(copyArr[j]) > 0) { // 부등호의 방향으로 오름차순, 내림차순 바꿀 수 있다
					String temp = copyArr[i];
					copyArr[i] = copyArr[j];
					copyArr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(copyArr));
		
	}
	
}
