package api.java.util;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {
	
	public static void main(String[] args) {
		
		//100000개의 데이터를 가진 ArrayList와 LinkedList 생성
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 100000; i++) {
			al.add(i);
		}
		
		LinkedList<Integer> li = new LinkedList<>();
		for(int i = 0; i< 100000; i++) {
			li.add(i);
		}
		
		//ArrayList에서 100000개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드는 get(인덱스)
		//실행해서 가장 마지막에 나오는 숫자를 확인 후 al을 li로 변경해서 실행하고 숫주 확인
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			System.out.println(al.get(i));
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
//		start = System.currentTimeMillis();
//		
//		for(int i = 0; i < 100000; i++) {
//			System.out.println(li.get(i));
//		}
//		
//		end = System.currentTimeMillis();
//		
//		System.out.println(end - start); 
		// li로 하려면 이렇게 li만 바꿔주면 된다
		//따라서 위를 통해 조회는 ArrayList가 훨씬 빠르게 된다는 것을 확인할 수 있다
	}

}
