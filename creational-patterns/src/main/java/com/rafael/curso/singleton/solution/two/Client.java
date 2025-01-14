package com.rafael.curso.singleton.solution.two;


import com.rafael.curso.singleton.solution.two.conn.Connection;
import com.rafael.curso.singleton.solution.two.conn.ConnectionPool;

public class Client {
	public static void doQuery1() {
		Connection conn = ConnectionPool.SINGLETON.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
	}
	
	public static void doQuery2() {
		Connection conn = ConnectionPool.SINGLETON.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
	}
	
	public static void doQuery3() {
		Connection conn = ConnectionPool.SINGLETON.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
	}

	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
	}
}
