package api.java.util;

import java.util.Arrays;

public class ArraysMain {
	
	public static void main(String[] args) {
		
		//문자열 배열 생성
		String[] doggy = {"마루", "다람", "나나", "초코", "미르", "진주"};
		
		//이분 검색 수행- 이렇게 하면 sort을 안했기 때문에 잘못된 결과가 나온다!
		int result = Arrays.binarySearch(doggy, "마루");
		System.out.println(result); 
		
		//데이터 정렬
		Arrays.sort(doggy);
		result = Arrays.binarySearch(doggy, "마루");
		if(result >= 0) {
			System.out.printf("%s는 %d번째 존재\n", "마루", result+1); // 배열은 0번째부터 시작하기 때문에 result + 1을 해줌(알아보기 편함)
		} else {
			System.out.printf("%s는 존재하지 않음\n", "마루");
		}
		
		
	}
	
	

}
