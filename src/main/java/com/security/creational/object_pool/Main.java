package com.security.creational.object_pool;

public class Main {

    public static void main(String[] args) {

        OracleDataSource oracleDataSource = new OracleDataSource();

        //put in the pool
        OracleDataSourcePool.putToPool(oracleDataSource);


        // pick up from pool
        OracleDataSource dataSource = OracleDataSourcePool.get();
        System.err.println(dataSource.getDatabaseName());
        System.err.println(dataSource.isConnected());
        System.err.println("size of pool : "+OracleDataSourcePool.getSize());

        // put it back in the pool after finishing work
        OracleDataSourcePool.putToPool(dataSource);
        System.err.println("size of pool : "+OracleDataSourcePool.getSize());

    }
}
