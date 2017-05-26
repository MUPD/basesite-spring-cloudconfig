package com.mupd.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.mupd.model.Product;

/**
 * The service implementing the main CRUD operations
 * @author Vassil Vassilev
 *
 */

public interface ProductService {
	
	public List<Product> list() ;

	public Product create(@RequestBody Product product) ;

	public Product get(@PathVariable Long id) ;

	public Product update(@PathVariable Long id, @RequestBody Product product);

	public Product delete(@PathVariable Long id);
	
}
