package com.gemography.repos;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class Github {
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Repository> getRepositories(){
		String date = LocalDate.now().toString();
		  Response response =  restTemplate.getForObject("https://api.github.com/search/repositories?q=created:>{date}&sort=stars&order=desc",Response.class,date);
		  return response.getItems();
	}
	
	public Language getLanguageRepos(String lang){
		List<Repository> repos = this.filter(this.getRepositories(), lang);
		Language language = new Language(lang,repos,repos.size());
			return language;
			}
	/*
	 * returns a list of repositories using the language "lang"
	 */
	private List<Repository> filter( List<Repository> repos, String lang) {
		List<Repository> result = new ArrayList<Repository>();
		for(int j=0;j<repos.size();j++) {
			if(repos.get(j).getLanguage() != null && repos.get(j).getLanguage().equalsIgnoreCase(lang))
				result.add(repos.get(j));
			}
		return result;
	}
	
   
	
}

