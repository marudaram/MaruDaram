package Stack;

import java.util.Date;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		//PersonVO 클래스의 인스턴스를 저장할 수 있는 Stack을 생성
		Stack <PersonVO> stack = new Stack<>();
		//Stack에 데이터 저장 - push
		stack.push(new PersonVO(1, "마루", new Date(105, 6, 21), "01085127498"));
		stack.push(new PersonVO(2, "다람", new Date(96, 5, 18), "01066107498"));
		
		//Stack에서 데이터 꺼내기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		// 데이터가 2개 존재해서 2번 pop을 하면 모두 제거된 상태인데
		//pop을 수행해서 Underflow가 발생 -> 프로그램에서는 예외 발생
//		System.out.println(stack.pop()); -> EmptyStackException 이라고 오류발생, 이를 Underflow라고 한다.
		
	}

}
