package 继承;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

class A1{
	 public void show() throws FileNotFoundException, SQLException {
	  BufferedInputStream in=new BufferedInputStream(new FileInputStream("ad.dat"));
	 }
	}
	class B1 extends A1{
	 public void show() throws FileNotFoundException, SQLException{
		 
		 
	  BufferedInputStream in=new BufferedInputStream(new FileInputStream("ad.dat"));
//	  Connection conn=JdbcUtils.getConnection();
	 }
	}
