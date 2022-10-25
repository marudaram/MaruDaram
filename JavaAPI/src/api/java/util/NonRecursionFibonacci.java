package api.java.util;

public class NonRecursionFibonacci {

	public static int fibonacci(int n) {
		//이전 항의 값과 이전의 이전 항의 값을 저장할 변수
		int f1 = 1;
		int f2 = 1;

		//피보나치 값을 저장할 변수
		int fibo = 1;

		//첫번째와 두번째는 처리할 필요가 없어서 반복문을 세번째부터 적용
		for(int i = 3; i <= n; i++) {
			fibo = f1 + f2; //두개를 더해서 피보에 저장, f1을 f2에 저장, 그 다응 피보를 f1에 저장하면서 점점 한칸씩 이동시킴 
			f2 = f1;
			f1 = fibo;
		}
		return fibo;

	}

	public static void main(String[] args) {
		System.out.println(fibonacci(100));	


	}

}
