package com.boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Product;
import com.boot.service.ProductService;

/**
 * A controller implementing the main CRUD operations
 * @author Vassil Vassilev
 *
 */
@RestController
@RequestMapping("api/v1/")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "products", method = RequestMethod.GET)
	public List<Product> list() {
		return productService.list();
	}

	@RequestMapping(value = "products", method = RequestMethod.POST)
	public Product create(@RequestBody Product product) {
		return productService.create(product);
	}

	@RequestMapping(value = "products/{id}", method = RequestMethod.GET)
	public Product get(@PathVariable Long id) {
		return productService.get(id);
	}

	@RequestMapping(value = "products/{id}", method = RequestMethod.PUT)
	public Product update(@PathVariable Long id, @RequestBody Product product) {
		return productService.update(id, product);
	}

	@RequestMapping(value = "products/{id}", method = RequestMethod.DELETE)
	public Product delete(@PathVariable Long id) {
		return productService.delete(id);
	}
	
}
