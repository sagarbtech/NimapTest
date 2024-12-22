package com.demo.dto;

import com.demo.entity.Category;
import com.demo.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductResponseDto {
    private Product product;
    private Category category;
	
	public ProductResponseDto(Product product, Category category) {
		super();
		this.product = product;
		this.category = category;
	}
	
}
