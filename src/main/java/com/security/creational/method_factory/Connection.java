package com.security.creational.method_factory;

public interface Connection{
    boolean isActiive();
    void executeQuery(String sql);
    ConnectionType getConnectionType();
}
