package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jimin7904";
		String pass = "1234";
		
		Connection conn = null;
		
		try {
		// DB 접속
			conn = DriverManager.getConnection(host,user,pass);
		
		
		// SQL 실행객체 생성(Statement, PreparedStatement->얘가 더 많이 쓰임)
			Statement stmt =  conn.createStatement();
		
		
		// SQL 실행
			String sql = "INSERT INTO USER1 VALUES('J102','김춘추','010-1212-2221',30)";
			stmt.executeUpdate(sql);
		
		
		// 결과 처리(SELECT문 일 경우)
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
			// 데이터베이스 접속 종료
		try {
			conn.close();
		} catch(SQLException e) {	
			e.printStackTrace();
		}
	}
	System.out.println("Insert 종료...");
		
		
		
	}
}
