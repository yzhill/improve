package com.huayu.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
	private final String DBDRIVER="oracle.jdbc.driver.OracleDriver";
	private final String DBURL="jdbc:oracle:thin:@localhost:1521:orcl";
	private final String DBUSER="scott";
	private final String PASSWORD="111";
	private Connection conn=null;
	
	public DatabaseConnection(){
		try {
			Class.forName(DBDRIVER); //��������
			try {
				this.conn=DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection(){ //��ȡ���Ӷ���
		  
		 return this.conn;
	 }
	
	public void close(){   //�ر����ݿ�
		
		if(this.conn!=null){
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 }
		
	 }
	
}
	
	


