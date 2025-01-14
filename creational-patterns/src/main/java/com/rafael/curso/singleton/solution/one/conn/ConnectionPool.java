package com.rafael.curso.singleton.solution.one.conn;

public class ConnectionPool {
	private static final ConnectionPool singleton = new ConnectionPool();
	private final static int POOL_SIZE = 2;
	private final Connection[] connectionsPool;

	public static ConnectionPool getInstance() {
		return singleton;
	}


	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new Connection[POOL_SIZE];
		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool[i] = new Connection();
		}
	}
	
	public Connection getConnection() {
		Connection avaiable = null;
		for(Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				avaiable = conn;
				break;
			}
		}
		if(avaiable == null) {
			System.out.println("No Connections available");
			return null;
		}
		avaiable.setInUse(true);
		return avaiable;
	}
	
	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
