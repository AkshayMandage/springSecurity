package com.Ak.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/all")
	public ResponseEntity<Map<Object, Object>> getProducts(){
		Map<Object, Object> map = new HashMap<>();
		map.put("Data", "this is product data");
		map.put("success", true);
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Map<Object, Object>> getProductsById(@PathVariable Integer id){
		Map<Object, Object> map = new HashMap<>();
		map.put("Data", "this is product data"+id);
		map.put("success", true);
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
}
