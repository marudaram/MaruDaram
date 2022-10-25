package api.lang.wrapper2;

public class BookInfo implements Comparable<BookInfo>{
	
	private String bookName;
	private int bookNum;
	private String bookLocation;
	
	
	public BookInfo() {
		super();
	}


	public BookInfo(String bookName, int bookNum, String bookLocation) {
		super();
		this.bookName = bookName;
		this.bookNum = bookNum;
		this.bookLocation = bookLocation;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getBookNum() {
		return bookNum;
	}


	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}


	public String getBookLocation() {
		return bookLocation;
	}


	public void setBookLocation(String bookLocation) {
		this.bookLocation = bookLocation;
	}


	@Override
	public String toString() {
		return "BookInfo [bookName=" + bookName + ", bookNum=" + bookNum + ", bookLocation=" + bookLocation + "]";
	}


	@Override
	public int compareTo(BookInfo o) {
		return this.bookName.compareTo(o.bookName);
	}
	
}
