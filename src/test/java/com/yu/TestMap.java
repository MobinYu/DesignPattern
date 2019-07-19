package com.yu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("A", 111);
		map.put("B", 222);
		map.put("C", 333);
		
		//keySet()遍历key/value
		loopMap1(map);
		
		//entrySet()遍历key/value
		loopMap2(map);
		
		//Iterator+keySet()遍历key/value
		loopMap3(map);
		
		//Iterator+entrySet()遍历key/value
		loopMap4(map);
		
		//values()遍历value
		loopMap5(map);
		
	}
	
	public static void loopMap1(Map<String, Object> map) {
		//keySet()遍历key/value
		for (String key : map.keySet()) {
			System.out.println("key= "+ key + " and value= " + map.get(key));
		}
	}
	
	public static void loopMap2(Map<String, Object> map) {
		//entrySet()遍历key/value
		for (Entry<String, Object> entry : map.entrySet()) {
			System.out.println("key= "+ entry.getKey() + " and value= " + entry.getValue());
		}
	}
	
	public static void loopMap3(Map<String, Object> map) {
		//Iterator遍历key/value
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("key= " + key + " and value= " + map.get(key));
		}
	}
	
	public static void loopMap4(Map<String, Object> map) {
		//Iterator遍历key/value
		Iterator<Entry<String, Object>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Object> next = it.next();
			System.out.println("key= " + next.getKey() + " and value= " + next.getValue());
		}
	}
	
	public static void loopMap5(Map<String, Object> map) {
		//values()遍历value
		for (Object value : map.values()) {
			System.out.println("value= " + value);
		}
	}
}
