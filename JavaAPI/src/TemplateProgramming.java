
// 로직은 같은데 매개변수의 자료형이 달라서 Overloading 
//class Algorithm {
//	//정수 2개를 더해서 결과를 리턴하는 메서드
//	public static int add(int n1, int n2) {
//		return n1 + n2;
//	}
//	
//	//실수 2개를 더해서 결과를 리턴하는 메서드
//	public static double add(double n1, double n2) {
//		return n1 + n2;
//	}
//	
//}

//자료형의 이름을 임시로 만들어놓고 내부에서 임시로 만든 자료형을 사용한 후
//인스턴스를 생성할 때(static은 불가능) 자료형을 결정하는 방식을 이용
//단 인스턴스를 만들 때 또는 메서드를 호출할 때 실제 자료형을 기재해야한다
//이때 사용되는 자료형은 Object로부터 상속받은 클래스의 자료형만 가능하다
//int와 primitive type의 경우는 Integer와 같은 wrapper클래스를 이용해야한다
//미지정 자료형의 개수는 제한이 없다
//인스턴스를 만들 때 자료형을 설정하지 않으면 경고가 발생한다

class Algorithm<T> {
	//2개의 데이터를 받아서 내용을 변경하는 메서드
	public void swap(T n1, T n2) {
		T imsi = n1;
		n1 = n2;
		n2 = imsi;
	}
}

public class TemplateProgramming {
	public static void main(String[] args) {
		//제너릭이 적용된 클래스의 인스턴스를 만들 때는 자료형을 기재해야 한다
		//자료형을 기재하지 않으면 경고가 발생하고, Object타입으로 간주한다
		Algorithm<Integer> algorithm = new Algorithm<>();
		Integer n1 = 20;
		Integer n2 = 30;
		algorithm.swap(n1, n2);
		System.out.println(n1);
		System.out.println(n2);
		
	}
	

}
