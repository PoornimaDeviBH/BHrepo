package myapp.service;

import org.springframework.stereotype.Service;

import myapp.domain.Config;
import myapp.domain.Product;

@Service
public class AppServiceImpl implements AppService{
	public Product getProductById(int id) {
		Product product=null;
		if(id>0)
		{
			product=new Product();
			product.setId(id);
			product.setName("Software");
		}
		return product;
	}
	
	public Config getConfigById(int id) {
		Config config=null;
		if(id>0)
		{
			config=new Config();
			config.setConfigId(id);
			config.setConfigCode("C100");
			config.setConfigItem("Software");
		}
		return config;
	}
}
