package api.lang.wrapper2;

public class PersonVO implements Comparable<PersonVO>{
	
	private int age;
	private String name;
	private String gender;
	
	//매개변수가 없는 생성자 - Default Constructor
	public PersonVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	//속성을 전부 매개변수로 받는 생성자 - 인스턴스 생성 후 값을 빠르게 대입하기 위해서 생성
	public PersonVO(int age, String name, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	// getter & setter : 속성의 값에 접근하고 변경하기 위한 메서드
	//일반적으로 VO 클래스의 경우는 setter를 만들지 않음
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//데이터 출력을 편리하게 하기 위한 메서드
	// 출력하는 메서드에 인스턴스 이름을 대입하면 이 메서드가 호출돼서 출력된다
	@Override
	public String toString() {
		return "PersonVO [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}

	//크기 비교하는 메서드 : 정렬하기 위해서 사용
	@Override
	public int compareTo(PersonVO o) {
		//크기비교 방법 설정
//		return o.age - this.age; // 내림차순으로 
//		return this.age - o.age; // 오름차순으로 
		
//		return this.name.compareTo(o.name);//오름차순
		return o.name.compareTo(this.name); //내림차순
		
		 
	}
	
	
	
	
	

}
