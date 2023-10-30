package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MarketEntity;
import com.example.demo.repository.MarketRepo;

@RestController
public class MarketController {
@Autowired
public MarketRepo repo;


@PostMapping("addgrocery")
public MarketEntity addgrocery (@RequestBody MarketEntity grocery) {
	try{
		repo.save(grocery);
		return grocery;
		
	}catch(Exception e) {
		e.printStackTrace();
	}
return null;

}


@PutMapping("/updategrocery")
public MarketEntity updategrocery(@RequestBody MarketEntity grocery ) {
try {	
	repo.save(grocery);
	return grocery;
}catch(Exception e) {
	e.printStackTrace();
}
	return null;
}

@GetMapping("/addgrocery")
public List<MarketEntity>addgrocery(){
	try {
		return repo.findAll();
		
}catch(Exception e){
	
	e.printStackTrace();
}return null;
}


@SuppressWarnings("deprecation")
@DeleteMapping("/deletepro/{Id}")
public String delpro(@PathVariable int Id) {
	try {
		MarketEntity pro=repo.getOne(Id);
		repo.delete(pro);
		return "product deleted";
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;

	
}





}