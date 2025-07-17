package test04_sub03;

public class MovieTicket {
	protected String movieTitle;
	protected String movieTime;
	protected String seatNumber;
	private boolean isBooked;
	
	
	public MovieTicket(String movieTitle,String movieTime,String seatNumber) {
		this.movieTitle = movieTitle;
		this.movieTime = movieTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	
	public void bookTicket() {
		if(this.isBooked) {
			System.out.println("이미 예매됨");
			return; // 메서드 종료 
		}
		this.isBooked = true;
			System.out.println(movieTitle+" "+movieTime+" "+ seatNumber+" "+"예매 완료");
		}
		

	
	
	public void cancelBook() {
		
		if(this.isBooked == false) {
			System.out.println("아직 예매 안됨");
			return;
		}
		this.isBooked = false;
		System.out.println(movieTitle+" "+movieTime+" "+ seatNumber+" "+"취소 완료");
	}
	
	public void printTicketInfo() {
		System.out.println("영화 제목: "+movieTitle);
		System.out.println("상영 시간: "+ movieTime);
		System.out.println("좌석 번호: "+seatNumber);
		System.out.println("예약 여부: " +(isBooked ? "Yes" : "NO"));
		// 삼항연산자 쓰는거 !! 
		
	}
		
		
	
	public static void main(String[] args) {
		
		MovieTicket ticket = new MovieTicket("타이타닉","19:00","A1");
		
		// 티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("--------------"); 
		
		// 예약 테스트
		ticket.bookTicket();
		System.out.println("--------------");
		
		// 티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("--------------");
		
		// 이미 예약된 경우 
		ticket.bookTicket();
		System.out.println("--------------");
		
		// 취소 테스트
		ticket.cancelBook();
		System.out.println("--------------");
		
		// 티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("--------------");
		
		// 이미 취소된 경우
		ticket.cancelBook();
		System.out.println("--------------");
		
	}
}
