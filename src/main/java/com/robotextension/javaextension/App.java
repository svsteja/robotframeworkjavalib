package com.robotextension.javaextension;

import org.json.JSONArray;
import org.json.JSONObject;

public class App {

	public static void main(String[] args) {
		JSONObject json=new JSONObject();
		json.put("key1", "value1");
		json.put("key2", "value2");
		System.out.println(json.toString());
		
		
		JSONObject json2=new JSONObject();
		json2.put("key1", "value1");
		json2.put("key2", "value2");
		JSONArray jsonArr=new JSONArray();
		jsonArr.put(1);
		jsonArr.put(2);
		jsonArr.put(3);
		json2.put("key3", jsonArr);
		System.out.println(json2.toString());
	}
}
