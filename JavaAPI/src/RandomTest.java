import java.util.Random;
import java.util.UUID;

public class RandomTest {
	
	public static void main(String[] args) {
		
		//seed를 사용하지 않는 경우와 사용하는 경우의 차이
		//여러번 시행해보고 확인
		//자바에서는 seed를 설정하지 않으면 seed가 랜덤
		Random r = new Random();
		System.out.println(r.nextInt());
		//seed를 설정하면 고정된 패턴의 숫자가 리턴
		 r = new Random(42);
		System.out.println(r.nextInt());
		
		r = new Random();
//		int[] ar = {-1,1,2,3,4,5};
		String[] ar = {"오미크론", "오미크론", "오미크론", "다크스펙터", "다크스펙터", "라투"}; 
		for(int i = 0; i < 10; i++) {
			System.out.println(ar[(r.nextInt(ar.length))]); //0을 안나오게 함
		}
		
		//랜덤한 문자열 추출
		System.out.println(UUID.randomUUID().toString());
	}

}
