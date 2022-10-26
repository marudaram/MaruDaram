package api.java.util;

public class Person<T> {
	public T info; //Person을 인스턴스화 할 때 

	Person<String> p1 = new Person<String>();
}