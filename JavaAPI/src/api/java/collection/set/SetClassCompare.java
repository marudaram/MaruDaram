package api.java.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.xml.sax.HandlerBase;

public class SetClassCompare {
	
	public static void main(String[] args) {
		
		//문자열을 저장하는 Set 인스턴스를 3개 생성
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		//샘플 데이터 삽입
		hashSet.add("마루 귀요미");
		linkedHashSet.add("마루 귀요미");
		treeSet.add("마루 귀요미");
		
		hashSet.add("다람 차도녀");
		linkedHashSet.add("다람 차도녀");
		treeSet.add("다람 차도녀");
		
		hashSet.add("나나 애교쟁이");
		linkedHashSet.add("나나 애교쟁이");
		treeSet.add("나나 애교쟁이");
		
		hashSet.add("77");
		linkedHashSet.add("1107");
		treeSet.add("1123");
		
		//데이터 출력
		//HashSet : 어떤 순서로 출력될지 예측할 수 없음
		for(String doggy : hashSet) {
			System.out.printf(doggy + "\t");
		}
		System.out.println();
		//LinkedHashSet : add한 순서대로 출력
		for(String doggy : linkedHashSet) {
			System.out.printf(doggy + "\t");
		}
		System.out.println();
		//TreeSet : 정렬한 순서대로 출력되는데 숫자가 영문자보다 작고 대문자가 소문자보다 작음
		for(String doggy : treeSet) {
			System.out.printf(doggy + "\t");
		}
		System.out.println();
	}

}
