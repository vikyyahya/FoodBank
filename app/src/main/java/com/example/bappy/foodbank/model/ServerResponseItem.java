package com.example.bappy.foodbank.model;

import com.google.gson.annotations.SerializedName;

public class ServerResponseItem{

	@SerializedName("name")
	private String name;

	@SerializedName("type")
	private String type;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"ServerResponseItem{" + 
			"name = '" + name + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}