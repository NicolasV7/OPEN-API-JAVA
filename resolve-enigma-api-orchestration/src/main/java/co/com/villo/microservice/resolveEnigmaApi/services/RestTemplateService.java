package co.com.villo.microservice.resolveEnigmaApi.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class RestTemplateService {
	private final RestTemplate restTemplate;

	public RestTemplateService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}	
	
	public ResponseEntity<String> getStep(String url) {
		return restTemplate.getForEntity(url, String.class);
	}
}
