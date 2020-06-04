package com.gemography.repos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	private List<Repository> items;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Repository> getItems() {
		return items;
	}
	public void setItems(List<Repository> items) {
		this.items = items;
	}
	
	
	
	

}
