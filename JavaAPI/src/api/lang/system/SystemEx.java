package api.lang.system;

public class SystemEx {
	
	public static void main(String[] args) {
		
		System.out.println("출력");
		
//		System.exit(0); 종료
//		System.gc();
		
		long start = System.currentTimeMillis();
//		System.out.println(start);//1970.1.1 이후부터 현재까지 지나온 시간을 밀리초로 나타낸 것
		
		long sum = 0;
		for(long i = 1; i <= 10000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
//		System.out.println(end);
		
		System.out.println((end - start) * 0.001 + "초 소요됨");
		
	}

}
