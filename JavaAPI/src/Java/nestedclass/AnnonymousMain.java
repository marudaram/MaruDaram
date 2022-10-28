package Java.nestedclass;

import java.util.Arrays;
import java.util.Comparator;

//메서드가 1개인 인터페이스
interface Sample {
	//추상 메서드 선언
	public void display();
}

//인터페이스를 구현한 클래스
class SampleImpl implements Sample {

	@Override
	public void display() {
		System.out.println("클래스를 만들어서 사용");
	}
	
}

public class AnnonymousMain {
	
	public static void main(String[] args) {
		
		//인터페이스를 구현한 클래스의 인스턴스를 생성해서 메서드 호출
		Sample sample = new SampleImpl();
		sample.display();
		
		
		//Sample 인터페이스를 annonymous로 사용
		//인스턴스가 1개만 필요하다면 클래스를 만들지 않는 것이 효율적
		new Sample() {

			@Override
			public void display() {
				System.out.println("클래스를 생성하지 않고 사용");
			}
		}.display();
		
		//배열의 정렬
		String[] arr = {"마루", "다람", "나나", "으녕"};
		
		//배열의 내림차순 정렬
		//Arrays.sort(배열, 비교를 위한 Comparator<T> 인터페이스를 구현한 클래스의 객체)를 호풀해야 한다
		
		Arrays.sort(arr, new Comparator<String> () {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
			
		});
		
		//배열의 요소를 빠르게 확인
		 System.out.println(Arrays.toString(arr));
		 
		 //하나씩 확인
		 for(String brr : arr) {
			 System.out.println(brr);
		 }
		
		
		
	}

}
