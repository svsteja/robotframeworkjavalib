package com.robotextension.javaextension;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonJavaUtil {

	public int JSONKeyAggregateTestIntegers(String jsonString, String jsonArrayKey) {
		JSONObject json = new JSONObject(jsonString);
		JSONArray jsonArr = json.getJSONArray(jsonArrayKey);
		int sum = 0;
		for (int i = 0; i < jsonArr.length(); i++) {
			sum = sum + jsonArr.getInt(i);
		}
		return sum;
	}

	public String GETValueForKey(String jsonString, String key) {
		JSONObject json = new JSONObject(jsonString);
		return json.getString(key);
	}
}
