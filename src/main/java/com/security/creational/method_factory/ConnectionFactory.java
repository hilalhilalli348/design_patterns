package com.security.creational.method_factory;

public class ConnectionFactory {
    public static Connection create(ConnectionType connection) {
        Connection conn = null;
        switch (connection){
            case MySqlConnection:
                conn = new MySqlConnection();
                break;
            case OracleConnection:
                conn = new OracleConnection();
                break;
        }
        return conn;
    }
}
