package org.atomsk.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

import lombok.Data;
import lombok.extern.log4j.Log4j;
@Log4j
@Data
public class JDBCTests {


			

	
	@Test
	public void testConnection() throws Exception {
		String url = "jdbc:mysql://10.10.10.101:3306/honeyrock?useSSL=false&serverTimezone=Asia/Seoul"; 
		String id = "honeyrock";      
		String pw = "12345678";   
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, id, pw);
		log.info(con);
		Statement stmt = null;
		String sql = "select count(*) from tbl_board";
		stmt = con.createStatement();
		stmt.executeQuery(sql);
		stmt.close();
		con.close();
	}

}
