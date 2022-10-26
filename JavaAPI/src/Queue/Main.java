package Queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;


public class Main {
	
	
	public static void main(String[] args) {
		
		//PriorityQueue는 데이터를 정렬된 순서로 꺼낼 수 있도록 해주는 클래스
		
		//정수를 저장하는 PriorityQueue를 만들어서 출력
		PriorityQueue<Integer> intQueue = new PriorityQueue<>();
		
		//데이터 저장
		intQueue.offer(100);
		intQueue.offer(70);
		intQueue.offer(90);
		
		//데이터 꺼내기 -> 정렬해서 출력한다. 저장한 데이터 외에 또 출력문을 넣어주면 그뒤부터는 null 값이 나온다
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		
		//PersonVO 클래스를 저장하는 우선순위 큐
		//이 상태에서 만들면 PersonVO의 크기 비교를 할 수 없기 때문에 예외발생
		
		//PersonVO클래스에 comparable 인터페이스를 implements 하고 
		//compareTo 메서드를 재정의해서 해결할 수 있고
		
		//Comparator 인터페이스를 대입받을 수 있는 경우에는 
		//Comparator 인터페이스를 구현한 클래스의 인스턴스를 이용해서 생성해도 된다
		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {

			@Override
			public int compare(PersonVO o1, PersonVO o2) { //앞에가 뒤보다 클 때 양수, 같을 떄 0, 작으면 음수
				return o1.getBirthday().compareTo(o2.getBirthday());
			}
			
		});
		
		persons.offer(new PersonVO(1, "마루", new Date(100,9,10), "01085127498"));
		persons.offer(new PersonVO(1, "다람", new Date(110,7,10), "01066107498"));
		persons.offer(new PersonVO(1, "나나", new Date(107,8,10), "01085237498"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
	}
}
