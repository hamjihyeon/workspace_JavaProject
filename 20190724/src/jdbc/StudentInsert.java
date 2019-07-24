package jdbc;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class StudentInsert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 >> ");
		String name = sc.next();
		System.out.print("학과를 입력하세요 >> ");
		String dept = sc.next();
		System.out.print("id를 입력하세요 >> ");
		String id = sc.next();
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javap", "root", "mirim2");
			System.out.println("DB 연결 완료");
			String sql = "insert into student (name, dept, id) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, dept);
			pstmt.setString(3, id);
			pstmt.executeUpdate();
			
			sql = "select * from student where id = '0204184'";
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
