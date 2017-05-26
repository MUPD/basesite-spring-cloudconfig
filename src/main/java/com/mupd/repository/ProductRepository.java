package com.mupd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mupd.model.Product;

/**
 * 
 * @author Vassil Vassilev
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
