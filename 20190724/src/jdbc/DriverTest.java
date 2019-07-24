package jdbc;

import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

public interface DriverTest {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javap", "root", "mirim2");
			System.out.println("DB 연결 완료");
			String sql = "select * from student";
			pstmt = conn.prepareStatement(sql);
			ResultSet srs = pstmt.executeQuery();
			System.out.println("Name dept   id");
			while(srs.next()) {
				System.out.print(srs.getString("name")+" ");
				System.out.print(srs.getString("dept")+" ");
				System.out.print(srs.getString("id")+" ");
				System.out.println();
			}
			//System.out.println("Success");
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
