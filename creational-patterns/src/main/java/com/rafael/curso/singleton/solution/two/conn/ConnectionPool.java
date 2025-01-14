package com.rafael.curso.singleton.solution.two.conn;

public enum ConnectionPool {
	SINGLETON;
	private static final int POOL_SIZE = 2;
	private final Connection[] connectionsPool;


	ConnectionPool() {
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
