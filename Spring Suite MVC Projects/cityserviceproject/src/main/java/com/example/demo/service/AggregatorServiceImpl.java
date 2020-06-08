package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.response.CountryResponse;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class AggregatorServiceImpl implements AggregatorService {
@Autowired
private RestTemplate restTemplate;
	
private List<CountryResponse> countryListCache = new ArrayList<>();
@Override
	  @HystrixCommand(fallbackMethod = "defaultGetAllCountries")
	
	public List<CountryResponse> getAllCountries() {
		
		//return restTemplate.getForObject(lookupUrlFor(serviceName)+"/countries", List.class);
		String url = lookupUrlFor(serviceName)+"/countries";
		countryListCache = Arrays.asList(restTemplate.exchange(url, HttpMethod.GET, createHttpEntity(), CountryResponse[].class).getBody());
		return countryListCache;		
	}
	@Override
	public CountryResponse getCountryBiId(Integer id) {
		
		return restTemplate.getForObject(lookupUrlFor(serviceName)+"/countries/{id}", CountryResponse.class);
	}
	
	
	public List<CountryResponse> defaultGetAllCountries(){
		return new ArrayList<>();
	}
	

	@Autowired
    private EurekaClient eurekaClient;

    @Value("${the-main-page}")
    private String serviceName;

 
   private String lookupUrlFor(String appName) {
     InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka(appName, false);
       return instanceInfo.getHomePageUrl();
  }
	
   @Value("${simple-geography-service.username}")
   private String username;
   
   @Value("${simple-geography-service.password}")
   private String password;
   private HttpEntity<Object> createHttpEntity() {
       HttpHeaders headers = new HttpHeaders();
       headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
       headers.setBasicAuth(username, password);
       
       return new HttpEntity<>(headers);
   }
}
