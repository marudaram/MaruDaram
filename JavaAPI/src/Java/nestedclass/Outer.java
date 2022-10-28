package Java.nestedclass;

public class Outer {
	//내포 클래스 - 다른 클래스 안에 만들어진 클래스
	
	class Inner{
		public int num;
		
	}
	//내포 클래스 안에 static 맴버가 있으면 인스턴스 생성없이 사용할 수 있도록 클래스 앞에 static을 추가 - 버전 업데이트로 안붙여도 에러 안됨
	static class StaticInner {
		public int num;
		public static int share;
	}
	
	public void method() {
		//메서드 안에 만들어진 클래스 - Local Inner
		//메서드 안에서만 사용이 가능한 클래스
		class LocalInner {
			public int num;
		}
	}

}
