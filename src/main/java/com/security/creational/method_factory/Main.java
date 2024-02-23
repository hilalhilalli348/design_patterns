package com.security.creational.method_factory;

public class Main {
    public static void main(String[] args) {

        Connection connection = ConnectionFactory.create(ConnectionType.MySqlConnection);
        connection.executeQuery("salam");
        System.err.println(connection.getConnectionType());

    }
}
