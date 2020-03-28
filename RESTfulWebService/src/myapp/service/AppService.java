package myapp.service;

import myapp.domain.Config;
import myapp.domain.Product;

public interface AppService {
	public Product getProductById(int id);

	public Config getConfigById(int id);

}
