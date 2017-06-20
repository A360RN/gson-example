package com.fisi.gson_example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class App2 {
	public static void main(String[] args) {
		Staff staff = createDummyObject();
		Gson gson = new Gson();
		
		// Simulating a json 
		String json = gson.toJson(staff);
		
		System.out.println(json);
		
		// Getting json element from json string
		JsonElement jsonElement = gson.fromJson(json, JsonElement.class);
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		
		// Getting json array from json element
		JsonArray skillsArray = jsonObject.get("skills").getAsJsonArray();
		Iterator<JsonElement> skillsIt = skillsArray.iterator();
		
		// Iterating over jsonArray
		while(skillsIt.hasNext()){
			System.out.println(skillsIt.next());
		}
		
		
	}

	private static Staff createDummyObject() {

		Staff staff = new Staff();

		staff.setName("Alonso");
		staff.setAge(35);
		staff.setPosition("Founder");
		staff.setSalary(new BigDecimal("10000"));

		List<String> skills = new ArrayList<String>();
		skills.add("java");
		skills.add("python");
		skills.add("shell");

		staff.setSkills(skills);

		return staff;

	}
}
