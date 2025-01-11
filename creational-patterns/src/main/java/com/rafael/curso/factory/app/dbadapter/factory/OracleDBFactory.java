package com.rafael.curso.factory.app.dbadapter.factory;

import com.rafael.curso.factory.app.dbadapter.db.DB;
import com.rafael.curso.factory.app.dbadapter.db.OracleDB;

public class OracleDBFactory implements DBFactory {
    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
