

interface Starcraft{
	public void attack();
}


//인터페이스를 구현한 클래스를 생성
class Protoss implements Starcraft {

	@Override
	public void attack() {
		System.out.println("질럿의 공격");
	}
	
}

public class AnnonymousMain {

	public static void main(String[] args) {
		//인터페이스를 implements한 클래스를 만들고 인스턴스를 만든 후 메서드를 호출
		Starcraft star = new Protoss();
		star.attack();
		
		//인터페이스를 implements한 클래스를 만들지 않고 인스턴스를 바로 생성해서 호출 -> () 후에 {} 또 열어주고 메소드 add
		star = new Starcraft() {

			@Override
			public void attack() {
				System.out.println("저그의 공격");
			}};
			star.attack();
			
			//변수를 만들지 않고 인스턴스만 생성해서 메서드 호출
			new Starcraft() { //변수 안만들고 그냥 바로 부름

				@Override
				public void attack() {
					System.out.println("테란의 공격");
					
				}
				
			}.attack();
	}
}
