package api.lang.wrapper;

public class Autoboxing {
	
	public static void main(String[] args) {
		
		//Autoboxing -> 자동형변환
		int a = 100;
		Integer val = a; //자동형변환
		a = val; //다시 형변환하고 싶을 때
		
		Object[] arr = {1,2,3};
		
		int v1 = Integer.parseInt("3"); //문자를 정수로 바꿔준다
		int v2 = Integer.parseInt("34");
		double v3 = Double.parseDouble("3.1");
		long v4 = Long.parseLong("2342352345325");
		
		
		System.out.println(v4 + v3 + v2 + v1);
		
		
	}

}
