package sub03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// preparedStatement 실습하기


public class PreparedInsertTest {
	public static void main(String[] args) {
		
		
		
		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "jimin7904";
		final String PASS = "1234";
		
		
		try {
			
			// DB 접속
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			
			
			// SQL 실행객체 생성(preparedState로 실행)
			
			
			// 							쿼리 템플릿 
			String sql = "INSERT INTO USER1 VALUES(?,?,?,?)"; // 쿼리 파라미터를 사용한 템플릿 SQL(준비된 쿼리)
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 각 쿼리 파라미터를 바인딩
			psmt.setString(1, "P101"); 
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1222-3333");
			psmt.setInt(4, 34);
			
			
			// SQL 실행
			
			psmt.executeUpdate(); // INSERT,DELETE,UPDATE는 excuteUpdate() !!!!
			
			
			
			
			// 결과처리(SELECT 경우)
			
			
			
			
			// DB 종료
			psmt.close();
			conn.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("insert 완료...");
		
		
		
		
	}
}
