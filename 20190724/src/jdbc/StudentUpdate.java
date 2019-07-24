package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentUpdate {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("업데이트할 학과를 입력하세요 >> ");
		String dept = sc.next();
		System.out.print("id를 입력하세요 >> ");
		String id = sc.next();
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javap", "root", "mirim2");
			System.out.println("DB 연결 완료");
			String sql = "update student set dept = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept);
			pstmt.setString(2, id);
			pstmt.executeUpdate();
			
			sql = "select * from student";
			pstmt = conn.prepareStatement(sql);
			ResultSet srs = pstmt.executeQuery();
			System.out.println("Name dept   id");
			while(srs.next()) {
				System.out.print(srs.getString("name")+" ");
				System.out.print(srs.getString("dept")+" ");
				System.out.print(srs.getString("id")+" ");
				System.out.println();
			}
			
		}catch(SQLException ex) {
			System.out.println("SQLException: " + ex);
		}catch(Exception ex) {
			System.out.println("Exception: " + ex);
		} finally {
			if(conn != null) 
				try {
					conn.close();
				}catch(SQLException sqle) {}
		}
	}

}
