package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCUtil {
public static Connection getConn(){
	
	Connection Conn = null;
	try {
	
		 Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String url ="jdbc:mysql://localhost:3306/db_mysql?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";	
	String username="root";
	String userpwd="root";
	try {
		Conn=DriverManager.getConnection(url,username,userpwd);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	return Conn;

}


public static void closeParam(ResultSet rs,Statement stt,PreparedStatement stmt,Connection conn){
	
		try {
			if(rs!=null){
			rs.close();
			}
			if(stt!=null){
				stt.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}






}
