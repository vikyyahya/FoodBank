package com.example.bappy.foodbank.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseReadFood{

	@SerializedName("Server_response")
	private List<ServerResponseItem> serverResponse;

	public void setServerResponse(List<ServerResponseItem> serverResponse){
		this.serverResponse = serverResponse;
	}

	public List<ServerResponseItem> getServerResponse(){
		return serverResponse;
	}

	@Override
 	public String toString(){
		return 
			"ResponseReadFood{" + 
			"server_response = '" + serverResponse + '\'' + 
			"}";
		}
}