package com.gemography.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {

@Autowired
Github git;

@GetMapping("/")
public List<Repository> getRepos() {
    return git.getRepositories();
}

@GetMapping("/{language}")
public Language getLanguageRepos(@PathVariable(value = "language") String language){
	return git.getLanguageRepos(language);
}
}
