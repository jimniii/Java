package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// 자바 update 테스트


public class UpdateTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jimin7904";
		String pass = "1234";
		
		
		try {
			// DB 접속
			
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			// SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "UPDATE USER1 SET AGE=35 WHERE USER_ID = 'J102'";
			stmt.executeUpdate(sql);
			
			// 결과처리(SELECT 일 때)
			
			// DB 종료
			stmt.close();
			conn.close();
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.print("update 완료!");
		
		
		
		
		
	}
}
