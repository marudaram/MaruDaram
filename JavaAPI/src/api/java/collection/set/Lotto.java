package api.java.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		//ArrayList 활용 -> 중복이 생김
		ArrayList<Integer> al = new ArrayList<>();
		
		//ArrayList의 사이즈가 6보다 작을때까지
		while(al.size() < 6) {
			//1~45까지의 숫자를 랜덤하게 추출
			int su = r.nextInt(45) + 1;
			//중복검사를 해서 통과하면 add하고 통과하지 못하면 add 수행하지 않음
			if(al.contains(su)) {
				continue;
			}
			al.add(su);
		}
		//출력하기 전에 정렬
		al.sort(null); //comparator 안써줘도 된다! 왠지는 모름,, ㅋ
		System.out.println(al);
		
		//TreeSet : 중복된 데이터를 저장하지 않고 저장된 순서를 기억한다
		TreeSet<Integer> treeSet = new TreeSet<>();
		while(treeSet.size() < 6) {
			//1~45까지의 숫자를 랜덤하게 추출
			int su = r.nextInt(45) + 1;
			//TreeSet은 중복된 데이터를 저장하지 않기 때문에 검사할 필요가 없음
			treeSet.add(su);
		}
		for(Integer i : treeSet) {
			System.out.printf(i + "\t");
		}
		
	
		
	}

}
