package sub02;

	
public class Book {
	// 속성 
	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	
	
	// 생성자
	public Book(String title,String author, String isbn, int availableCopies) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
	}
	
	// 메서드 
	public boolean borrowBook() {
		if(availableCopies>0) {
			availableCopies--;
			return true;
		} else { 
			return false;
		}
		}
	
	public void returnBook() {
		availableCopies++;
	}
	
	public void show() {
		System.out.println("도서명: "+this.title);
		System.out.println("작가: "+this.author);
		System.out.println("도서번호: "+this.isbn);
		System.out.println("이용가능한 복사본: "+this.availableCopies);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getauthor() {
		return author;
	}
	
	public void setauthor(String author) {
		this.author = author;
	}
	public String getisbn() {
		return isbn;
	}
	
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	public int getavailableCopies() {
		return availableCopies;
	}
	
	public void setTitle(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	

	
	
	
}
