package com.sample.rest_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class ClientGet {

	public static void main(String[] args) {
		show();
	}

	public static String convertStreamToString(InputStream is){
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String str = null;
		try {
			while((str = br.readLine()) != null){
				sb.append(str).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try{
				is.close();
			} catch (IOException io){
				io.printStackTrace();
			}
		}
		
		return sb.toString();
	}
	
	public static void show() {
		try {
			URL url = new URL(
					"http://172.20.235.24:8080/external/api/hierarchy");
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");

			if (connection.getResponseCode() != 200) {
				throw new RuntimeException("Failed. HTTP error code: "
						+ connection.getResponseCode());
			}

			List<User> users = new ArrayList<User>();
			String output = convertStreamToString(connection.getInputStream());
			connection.disconnect();
			
			System.out.println("\n*** Output from Server ***\n");
			users.addAll(parseJSON(output));
			
			System.out.println(users);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static List<User> parseJSON(String jsonLine) {
		
		JSONArray jsonArray = null;
		try {
			jsonArray = JSONFactoryUtil.createJSONArray(jsonLine);
		} catch (JSONException e) {
			e.printStackTrace();
		} 

		if (jsonArray == null || jsonArray.length() < 1) {
			return null;
		}

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			
			User user = new User();
			user.setId(jsonObject.getInt("id"));
			user.setHierarchyPath(jsonObject.getString("hierarchyPath"));
			user.setCode(jsonObject.getString("code"));
			user.setDeleted(jsonObject.getString("deleted"));
			user.setRole(jsonObject.getInt("role"));
			user.setHeadStaffLineId(jsonObject.getInt("headStaffLineId"));
			user.setName(jsonObject.getString("name"));
			user.setStrategySubdivisionId(jsonObject
					.getInt("strategySubdivisionId"));
			user.setParentId(jsonObject.getInt("parentId"));
			
			userList.add(user);
		}
		
		return userList;
	}
}
