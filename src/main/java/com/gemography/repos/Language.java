package com.gemography.repos;

import java.util.List;

public class Language {
	private String name;
	private List<Repository> repositories;
	private Integer num_repos;
	public Language(String name, List<Repository> repositories, Integer num_repos) {
		super();
		this.name = name;
		this.repositories = repositories;
		this.num_repos = num_repos;
	}
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Repository> getRepositories() {
		return repositories;
	}
	public void setRepositories(List<Repository> repositories) {
		this.repositories = repositories;
	}
	public Integer getNum_repos() {
		return num_repos;
	}
	public void setNum_repos(Integer num_repos) {
		this.num_repos = num_repos;
	}
	
	

}
