package api.java.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			//인스턴스 단위에 파일에 기록할 수 있는 객체 생성
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializable.txt"));
			
			//기록할 인스턴스 생성
			StudentDTO dto = new StudentDTO(1, "마루", new Date());
			
			//기록
			oos.writeObject(dto);
			
			oos.close();
			
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}

}
