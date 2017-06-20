package com.fisi.gson_example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Staff staff = createDummyObject();
		
		Gson gson = new Gson();
		String json = gson.toJson(staff);
		System.out.println(json);
		
		Staff staff2 = gson.fromJson(json, Staff.class);
		
		System.out.println(staff2);
	}
	
	private static Staff createDummyObject(){
		
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
