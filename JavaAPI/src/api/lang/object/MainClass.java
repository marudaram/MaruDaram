package api.lang.object;

public class MainClass {
	public static void main(String[] args) {

		Person p = new Person("홍길동");

		//	String str = p.toString();
		//	System.out.println(str);
		//toString()
		System.out.println(p.toString());//반환 ok 출력문에 바로 넣어도 된다

		//equals()
		Person p2 = new Person("홍길동");
		System.out.println(p.equals(p2)); //p랑 p2는 다른 주소를 갖고 있기 때문에 false가 나온다. p를 넣으면 true가 나옴
		
		
		//clone() - 객체복사 -> 오버라이딩 하면 p.했을 때 보인다
		try {
			Object obj = p.clone();
			Person p3 = (Person)obj;
			
			
			System.out.println("복사된 객체의 name: " + p3.getName());
			
			System.out.println(p3 == p); //false 둘은 다른 객체다
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
