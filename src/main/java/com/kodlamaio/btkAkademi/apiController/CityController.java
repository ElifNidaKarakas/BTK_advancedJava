package com.kodlamaio.btkAkademi.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.btkAkademi.business.ICityService;
import com.kodlamaio.btkAkademi.entities.City;

import lombok.AllArgsConstructor;

@RestController //api controller old. belirtir
@RequestMapping("/api") //localhost adresi 
@AllArgsConstructor
public class CityController {
	private ICityService cityService;
	

	@GetMapping("/cities")
	public List<City> get(){
		return cityService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody  City city) {
		cityService.add(city);
	}

	@PutMapping("/update")
	public void update(@RequestBody City city) {
		cityService.update(city);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		cityService.delete(city);
	}
	
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id){
		//@PathVariable:bu yoldan id yi oku
		return cityService.getById(id);
	}
	
	
}
