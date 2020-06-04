# Rest-MicroService-RestTemplate
a java rest microservice. It communicates with the github RestAPI using the RestTemplate.
The program is supposed to list the languages used by the 100 trending public repos on GitHub.
I used the RestTemplate.getForObject() method to get the json response as a java object "Response". The attribute items gets the list of repositories and for some reason it only gets the 30 first rows from it. 

for the date parameter in the http request url, I used the localdate.now().toString() in order to get today's date in YYYY-MM-DD format . If the request returns an empty array you can try an older date.
