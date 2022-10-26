package api.java.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		//프로퍼티스 인스턴스 생성
		Properties properties = new Properties();
		//없는 키를 사용하면 null이 리턴
		System.out.println(properties.get("name"));
		
		//프로퍼티스에 프로퍼티를 저장
		properties.setProperty("마루", "한국에서 젤 귀여운 댕댕");
		properties.setProperty("다람", "한국에서 두번째로 귀여운 댕댕");
		properties.setProperty("은영", "한국인 96년생 Mia Jo");
		
		
		//텍스트 파일로 저장
		try {
			//현재 작업 디렉토리 파일로 저장
			//git에 연결되면 workspace가 아니고
			//c 드라이브의 사용자 디렉토리 안에 자신의 계쩡 안에 git 디렉토리에 있음
//		properties.store(new FileOutputStream("./myproject.properties"), "텍스트로 저장");
		properties.storeToXML(new FileOutputStream("./myproject.xml"), "xml 로 저장");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
