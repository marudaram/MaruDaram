package api.java.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.SimpleAttributeSet;

public class DateCreate {

	
	public static void main(String[] args) {
		//현재 시간을 갖는 java.util.Date 인스턴스 생성 (sql하면 에러 뜸)
		Date currentTime = new Date();
		//출력 - 년월일 시분초 출력
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성 - 1996.7.7 23시 2분
		Date firstBirthTime = new Date(96, 6, 7, 23, 2, 0);
		//출력 - 년월일 시분초 출력
		System.out.println(firstBirthTime);
		
		//년도만 추출해서 출력
		System.out.println(firstBirthTime.getYear() + 1900);
		
		//원하는 포멧으로 출력
		// 1996년 7월 7일 ?요일 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(firstBirthTime));
		
		
//		//연습해보는 과제 - 년월일을 비교해서 년월일이 같으면 시간과 분을, 그렇지 않으면 년월일을 출력
//		
//		Scanner scan = new Scanner(System.in);
//		int year = scan.nextInt();
//		int month = scan.nextInt();
//		int day = scan.nextInt();
//		
//		SimpleDateFormat sdff = new SimpleDateFormat("HH시 mm분");
//		SimpleDateFormat sdfff = new SimpleDateFormat("yyyy년 M월 d일");
//		
//		if(firstBirthTime.equals(year) && firstBirthTime.equals(month) && firstBirthTime.equals(day)) {
//			System.out.println(sdfff.format(firstBirthTime));
//		} else {
//			System.out.println(sdff.format(firstBirthTime));
//		}
				
		
		
		
		
	}

}
