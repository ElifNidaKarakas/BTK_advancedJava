package com.kodlamaio.btkAkademi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kodlamaio.btkAkademi.dataAccess.ICityDal;
import com.kodlamaio.btkAkademi.entities.City;

@Service //iş katmanı oldugunu belirtir
public class CityManager implements ICityService {

	private ICityDal cityDal; // repository işlemimiz

	@Autowired
	public CityManager(ICityDal cityDal) {
		
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		
		return this.cityDal.getAll(); 
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
	this.cityDal.update(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
	this.cityDal.delete(city);
	}

	@Override
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

}
