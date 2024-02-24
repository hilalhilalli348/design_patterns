package com.security.creational.object_pool;

import java.util.Locale;
import java.util.Stack;

public class OracleDataSourcePool {

   static final Stack<OracleDataSource> stack = new Stack<>();


   public static OracleDataSource get(){
      if (stack.size()>0){
         return stack.pop();
      }
      return new OracleDataSource();
   }

   public static  void putToPool(OracleDataSource oracleDataSource){
      stack.push(oracleDataSource);
   }

   public static long getSize(){
      return stack.size();
   }

}
