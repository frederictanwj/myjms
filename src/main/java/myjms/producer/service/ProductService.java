package myjms.producer.service;

import myjms.model.Product;

public interface ProductService {

	public void sendProduct(Product product);

}
