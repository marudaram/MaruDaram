package api.lang.wrapper2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		PersonVO [] persons = {
				new PersonVO(27, "유린", "female"),
				new PersonVO(28, "지혜" , "female"),
				new PersonVO(26, "지은", "female"),
				new PersonVO(29, "은영", "female")
		};
		
		//배열의 데이터 출력
//		System.out.println(Arrays.toString(persons));
		
		//Arrays.sort 메서드는 배열을 대입하면 부등호 또는 compareTo라는 메서드를 호출해서
		//크기 비교를 한 후 정렬을 수행해준다
//		Arrays.sort(persons); //실행하면 에러발생 -> PersonVO에는 크기 비교를 할 수 있는 메서드가 존재하지 않기 때문!
		
		//동적으로 크기 비교하는 메서드를 설정
////		Arrays.sort(persons, new Comparator<PersonVO>() {
//		@Override
//		public int compare(PersonVO o1, PersonVO o2) {
//			// TODO Auto-generated method stub
//			return o1.getAge() - o2.getAge();
//			
//		}
//		
//	});

		//동적으로 정렬하기
		/*
		 * 1. 이름의 오름차순
		 * 2. 이름의 내림차순
		 * 3. 나이의 오름차순
		 * 4. 나이의 내림차순
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 이름의 오름차순 2. 이름의 내림차순 3. 나이의 오름차순 4. 나이의 내림차순" );
		String menu = scan.nextLine();
		
		switch (menu.trim()) {
		case "1":
			System.out.println("이름의 오름차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {

				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o1.getName().compareTo(o2.getName());
				}
				
			});
			break;
		case "2":
			System.out.println("이름의 내림차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {

				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o2.getName().compareTo(o1.getName());
				}
				
			});
			break;
		case "3":
			System.out.println("나이의 오름차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {

				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o1.getAge() - o2.getAge();
				}
				
			});
			break;
		case "4":
			System.out.println("나이의 내림차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {

				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o2.getAge() - o1.getAge();
				}
				
			});
			break;
		default:
			System.out.println("메뉴는 1~4번만 선택하세요");
			break;
		}
		scan.close();
		
		
		//배열의 데이터 출력
		//Arrays.toString은 배열의 각 요소의 toString을 전부 호출해서 
		//하나의 문자열로 리턴하는 메서드이다
		System.out.println(Arrays.toString(persons));
		
//		System.out.println(System.identityHashCode(persons)); -> 정확한 해시코드 구하는 법
	}

}
