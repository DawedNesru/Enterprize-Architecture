package assignment.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
private CountryService countryService;
	@GetMapping("/home")
	public String home() {
		return "Helo";
	}
	

}
