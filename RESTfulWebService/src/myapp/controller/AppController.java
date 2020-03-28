package myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import myapp.domain.Config;
import myapp.domain.Product;
import myapp.service.AppService;

@RestController
public class AppController {

	@Autowired
	AppService appService;

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to My Application.";
	}

	@RequestMapping(value = AppConstants.GET_PRODUCT_DETAILS, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProductDetails(@RequestHeader("Authorization") String authString) {
		Product product = null;
		try {
			if (!AppAuthenticator.isGetProductUser(authString)) {
				System.out.println("Get Product Service - Not Authorized");
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(product);
			}
			product = appService.getProductById(1);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		return ResponseEntity.status(HttpStatus.OK).body(product);
	}

	@RequestMapping(value = AppConstants.GET_CONFIG_DETAILS, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Config> getConfigDetails(@RequestHeader("Authorization") String authString) {
		Config config = null;
		try {
			if (!AppAuthenticator.isGetConfigUser(authString)) {
				System.out.println("Get Config Service - Not Authorized");
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(config);
			}
			config = appService.getConfigById(1);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(config);
	}
}
