package com.rafael.curso.factory.app.dbadapter;

import com.rafael.curso.factory.app.dbadapter.db.DB;
import com.rafael.curso.factory.app.dbadapter.factory.DBFactory;
import com.rafael.curso.factory.app.dbadapter.factory.OracleDBFactory;
import com.rafael.curso.factory.app.dbadapter.factory.PostgresDBFactory;

public class Client {

	public static void main(String[] args) {
		DBFactory dbFactory = new OracleDBFactory();
		DB db = dbFactory.getDatabase();
		db.update("update");
		db.query("query");

		dbFactory = new PostgresDBFactory();
		db = dbFactory.getDatabase();
		db.update("update");
		db.query("query");
	}
}
