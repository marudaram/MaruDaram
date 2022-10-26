package api.java.util;

import java.util.ArrayList;

public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		
		String[] arrayObj = new String[2]; // 배열은 크기를 지정해줘야한다
		arrayObj[0] = "One";
		arrayObj[1] = "Two";
//		arrayObj[2] = "Three"; //크기가 2라고 지정해줬기 때문에 오류가 발생한다 -> ArrayIndexOutOfBoundException
//		for(int i = 0; i < arrayObj.length; i++) {
//			System.out.println(arrayObj[i]);
//		}
		
		ArrayList al = new ArrayList<>(); //ArrayList는 크기를 지정해주지 않아도 됨
		al.add("One");
		al.add("Two");
		al.add("Three");
		for(int i = 0; i < al.size(); i++) {
			String value = (String)al.get(i);
			System.out.println(value);
//			System.out.println(al.get(i));
		}
	}

}
