package myjms.consumer.service;

import myjms.model.Product;

public interface OrderService {

	public void processOrder(Product product);
}
