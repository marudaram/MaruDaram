package api.lang.wrapper2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		BookInfo [] books = {
				new BookInfo("데미안", 87521, "2F library"),
				new BookInfo("마당을 나온 암탉", 96678, "1F kids' library"),
				new BookInfo("그리스 로마 신화", 11225, "2F library"),
				new BookInfo("쇼코의 미소", 75689, "2F library")
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 이름의 오름차순 2. 이름의 내림차순 3. 등록번호의 오름차순 4. 등록번호의 내림차순");
		String menu = scan.nextLine();
		
		switch (menu.trim()) {
		case "1":
			System.out.println("이름의 오름차순");
			Arrays.sort(books, new Comparator<BookInfo>() {

				@Override
				public int compare(BookInfo o1, BookInfo o2) {
					return o1.getBookName().compareTo(o2.getBookName());
				}
				
			});
			break;
		case "2":
			System.out.println("이름의 내림차순");
			Arrays.sort(books, new Comparator<BookInfo>() {

				@Override
				public int compare(BookInfo o1, BookInfo o2) {
					return o2.getBookName().compareTo(o1.getBookName());
				}
				
			});
			break;
		case "3":
			System.out.println("등록번호의 오름차순");
			Arrays.sort(books, new Comparator<BookInfo>() {

				@Override
				public int compare(BookInfo o1, BookInfo o2) {
					return o1.getBookNum() - o2.getBookNum();
				}
				
			});
			break;
		case "4":
			System.out.println("등록번호의 내림차순");
			Arrays.sort(books, new Comparator<BookInfo>() {

				@Override
				public int compare(BookInfo o1, BookInfo o2) {
					return o2.getBookNum() - o1.getBookNum();
				}
				
			});
			break;

		default:
			break;
		}
		scan.close();
		
		System.out.println(Arrays.toString(books));
		
	}

}
