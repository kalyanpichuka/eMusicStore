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
		
		Product product2 = new Product();
		product2.setProductName("Record");
		product2.setProductCategory("Record");
		product2.setProductDescription("This is an awesome mix of 30th century");
		product2.setProductPrice(900);
		product2.setProductCondition("New");
		product2.setProductStatus("Active");
		product2.setUnitStock(18);
		product2.setProductManufacturer("Logo");
		
		Product product3 = new Product();
		product3.setProductName("Speaker");
		product3.setProductCategory("Accessory");
		product3.setProductDescription("This is well designed speaker");
		product3.setProductPrice(1800);
		product3.setProductCondition("New");
		product3.setProductStatus("Active");
		product3.setUnitStock(9);
		product3.setProductManufacturer("Frenda");
		
		productList = new ArrayList<Product>();
		productList.add(product1);
		return productList;
		
	}

}
