package sub03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub02.User1VO;

// preparedSelect 실습


public class PreparedSelectTest {
	public static void main(String[] args) {
		
		
		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "jimin7904";
		final String PASS = "1234";
		
		
		// 조회 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<User1VO>();
		
		try {
			
			// DB 접속
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			
			// SQL 실행객체 생성(PreparedStatement)
			String sql = "SELECT * FROM USER1 WHERE AGE >=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, 30); // 1번째 쿼리 파라미터(?)에 나이 숫자 30 바인딩
			
			// SQL 실행
			
			ResultSet rs = psmt.executeQuery();
			// SELECT 실행하기 때문에 executeQUery()로 실행해야 ResultSet 반환됨
			
			
			
			// 결과처리(SELECT 경우)
			
			// PK컬럼일때 if문 쓰면 0또는 1 나옴 거짓 or 참 ! 
			while(rs.next()) {
				
				// VO 객체 생성: VO 객체는 데이터 베이스에서 조회된 결과로 초기화된 읽기 전용 객체
				
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);	
			}

			// DB 종료
			
			rs.close();
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		// 리스트 출력
		for(User1VO user: users) {
			System.out.println(user);
		}
		
		System.out.println("select 완료...");

	}
}
