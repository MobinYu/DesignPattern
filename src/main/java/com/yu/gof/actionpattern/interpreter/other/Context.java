package com.yu.gof.actionpattern.interpreter.other;

import java.util.HashMap;
import java.util.Map;

public class Context {

	private String tableName; //表名
	private Map<String, Object> params = new HashMap<>(); //更新参数
	private Map<String, Object> wheres = new HashMap<>(); //条件参数
	
	public String getTableName() {
		return tableName;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public Map<String, Object> getParams() {
		return params;
	}
	
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	
	public Map<String, Object> getWheres() {
		return wheres;
	}
	
	public void setWheres(Map<String, Object> wheres) {
		this.wheres = wheres;
	}
	
}
