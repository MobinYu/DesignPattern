package com.yu.gof.actionpattern.interpreter.other;

import java.util.HashMap;
import java.util.Map;

public class TestMain {

	public static void main(String[] args) {
		Context context = new Context();
		context.setTableName("user");
		
		//1、Insert SQL
		Map<String, Object> insertParams = new HashMap<>();
		insertParams.put("name", "小明");
		insertParams.put("job", "Java 工程师");
		context.setParams(insertParams);
		Expression insertSql = new ExpressionInsert();
		String sql1 = insertSql.interpret(context);
		System.out.println("INSERT SQL : " + sql1);
		
		//2、Update SQL
		Map<String, Object> updateParams = new HashMap<>();
		updateParams.put("job", "C++ 工程师");
		context.setParams(updateParams);
		
		Map<String, Object> wheres = new HashMap<>();
		wheres.put("name", "小明");
		context.setWheres(wheres);
		
		Expression updateSql = new ExpressionUpdate();
		String sql2 = updateSql.interpret(context);
		
		System.out.println("UPDATE SQL : " + sql2);
	}
}
