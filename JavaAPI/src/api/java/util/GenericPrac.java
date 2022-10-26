package api.java.util;

//class Person<T> {
//	public T info;
//
//}

public class GenericPrac {

	public static void main(String[] args) {

	Person<String> p1 = new Person<String>(); // 이렇게 쓰게 되면 <> 사이에 들어가있는 데이터 타입이 T로 들어가게 된다.
	
	Person<StringBuilder> p2 = new Person<StringBuilder>();

	}

}



