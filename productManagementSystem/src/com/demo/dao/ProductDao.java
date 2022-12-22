package com.demo.dao;

import java.util.Set;

import com.demo.dto.Product;

public interface ProductDao {
	
	public boolean addProduct(Product product);
	public boolean updateProductCost(int productId, double productCost);
	public boolean deleteProduct(int productId);
	public Set<Product> getAllProducts();
	public Product searchProductById(int productId);
	public Product searchProductByName(String productName);

}
