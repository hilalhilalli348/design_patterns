package com.security.creational.object_pool;

public class OracleDataSource{

    public boolean isConnected() {
        return true;
    }

    public String getDatabaseName() {
        return "Oracle";
    }
}
