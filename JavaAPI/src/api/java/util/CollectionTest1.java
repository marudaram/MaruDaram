package api.java.util;

import java.util.Arrays;

public class CollectionTest1 {

	
	public static void main(String[] args) {
		
		String[] arr = {"List", "Set", "Map" };
		//배열의 데이터를 수정하는 것은 가능
		arr[2] = "HashTable";
		System.out.println(Arrays.toString(arr));
		
		//arr배열에 데이터를 추가
		//arr배열보다 1개 더 큰 공간을 갖는 배열을 생성
		String[] brr = new String[arr.length + 1];
		//arr의 내용을 복사
		for(int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];
		}
		//brr의 마지막에 데이터 추가
		brr[brr.length - 1] = "Properties";
		//brr이 가리키는 곳을 arr이 가리키도록 한다
		arr = brr;
		System.out.println(Arrays.toString(arr));
		
		//연습: Set을 삭제하기
		
		String[] crr = new String[arr.length - 1];
		for(int i = 0; i < arr.length; i++) {
			
		}
		
		
	}
	
}
