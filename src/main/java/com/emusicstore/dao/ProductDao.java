package com.emusicstore.dao;

import java.util.ArrayList;
import java.util.List;

import com.emusicstore.model.Product;

public class ProductDao {

	private List<Product> productList;

	public List<Product> getProductList() {
		
		Product product1 = new Product();
		product1.setProductName("Guitar");
		product1.setProductCategory("Insturment");
		product1.setProductDescription("This is a guitar");
		product1.setProductPrice(1800);
		product1.setProductCondition("New");
		product1.setProductStatus("Active");
		product1.setUnitStock(9);
		product1.setProductManufacturer("Frenda");
		
		productList = new ArrayList<Product>();
		productList.add(product1);
		return productList;
		
	}

}
