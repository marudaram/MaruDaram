package api.lang.math;

public class MathEx {
	
	public static void main(String[] args) {
		
		//Math m = new Math(); 안됨
		
		//올림
		double d = Math.ceil(1.3); 
		System.out.println(d);
		
		//내림
		double d2 = Math.floor(1.3);
		System.out.println(d2);
		
		//반올림
		double d3 = Math.round(3.14);
		System.out.println(d3);
		
		//루트값
		double d4 = Math.sqrt(16); 
		System.out.println(d4);
		
		//절대값
		double d5 = Math.abs(-4);
		System.out.println(d5);
		
		//큰값
		int d6 = Math.max(5, 3);
		System.out.println(d6);
		
		//작은값
		int d7 = Math.min(5, 3);
		System.out.println(d7);
		
	}
	
}
