package com.gemography.repos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {
	private Long id;
	private String name;
	private String language;
	
	public Repository() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Repository(String name, String language) {
		super();
		this.name = name;
		this.language = language;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	

}
