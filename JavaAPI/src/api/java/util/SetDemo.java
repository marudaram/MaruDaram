package api.java.util;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B)); //false -> 부분집합 메서드
		System.out.println(A.containsAll(C)); // true
		
//		A.addAll(B); // 1 2 3 4 5 출력 -> 합집합 메서드
//		A.retainAll(B); // 3 출력 -> 교집합 메서드
		A.removeAll(B); // 1 2 출력 -> 차집합 메서드
		
		
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
	}

}
