package test04_sub04;

public class Book {
	protected String title;
	protected String author;
	protected String isbn;
	protected boolean isBorrowd ;
	
	
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	
	
	public void borrowBook(){
		
		if(this.isBorrowd  = true) {
			System.out.println(this.title + " 이미 대출됨");
		} else {
			this.isBorrowd = true;
			System.out.println("도서 대출: "+ this.title);
		}
	}
	
	public void returnBook() {
		this.isBorrowd = false;
		System.out.println("도서 반납: " + this.title);
		
	}
	
	public void getBookInfo() {
		System.out.println("도서명: "+title);
		System.out.println("저자: " + author);
		System.out.println("ISBN: "+ isbn);
		System.out.println("대출 여부: "+(isBorrowd?"불가능":"가능"));
	}
	
	public String getTitle() {
		return title;
	}
	
}
