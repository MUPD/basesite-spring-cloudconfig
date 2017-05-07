package com.boot.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Product;
import com.boot.repository.ProductRepository;

/**
 * The implementation of the main CRUD operations
 * @author Vassil Vassilev
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> list() {
		return productRepository.findAll();
	}

	public Product create(Product product) {
		return productRepository.saveAndFlush(product);
	}

	public Product get(Long id) {
		return productRepository.findOne(id);
	}

	public Product update(Long id, Product product) {
		Product existingProduct = productRepository.findOne(id);
		BeanUtils.copyProperties(product, existingProduct);
		return productRepository.saveAndFlush(existingProduct);
	}

	public Product delete(Long id) {
		Product existingProduct = productRepository.findOne(id);
		productRepository.delete(existingProduct);
		return existingProduct;
	}
	
}
