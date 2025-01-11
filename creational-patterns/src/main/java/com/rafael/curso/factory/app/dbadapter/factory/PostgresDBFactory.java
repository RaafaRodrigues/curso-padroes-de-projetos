package com.rafael.curso.factory.app.dbadapter.factory;

import com.rafael.curso.factory.app.dbadapter.db.DB;
import com.rafael.curso.factory.app.dbadapter.db.PostgresDB;

public class PostgresDBFactory implements DBFactory {
    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }
}
