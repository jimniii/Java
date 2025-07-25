package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		
		
		
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jimin7904";
		String pass = "1234";
		
		try {
			// DB 연결
			Connection conn = DriverManager.getConnection(host,user,pass);

			// SQL 실행 객체 생성
			Statement stmt = conn.createStatement();

			// SQL 실행 
			String sql = "DELETE FROM USER1 WHERE USER_ID = 'J102'";
			stmt.executeUpdate(sql);


			// 결과처리(SELECT 일 때)
			
			
			// DB 종료
			
			stmt.close();
			conn.close();

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("delete 완료...");
		
		
		
		
		
		
		
		
		
		
		
	}
}
