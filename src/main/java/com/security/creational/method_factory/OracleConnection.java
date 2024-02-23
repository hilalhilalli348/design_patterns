package com.security.creational.method_factory;

public class OracleConnection implements Connection {
    @Override
    public boolean isActiive() {
        return false;
    }
    @Override
    public void executeQuery(String sql) {
        System.err.println(sql);
    }
    @Override
    public ConnectionType getConnectionType() {
        return ConnectionType.OracleConnection;
    }
}
