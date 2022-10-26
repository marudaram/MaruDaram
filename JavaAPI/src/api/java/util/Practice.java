package api.java.util;

import java.util.ArrayList;

public class Practice {
	
	
	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList 생성
		ArrayList<String> al = new ArrayList<>();
		
		//샘플 데이터 추가
		al.add("Maru");
		al.add("Daram");
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			al.add(1, "Nana");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(start - end);
		
		
	}

}
