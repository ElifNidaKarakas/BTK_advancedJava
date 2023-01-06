package com.kodlamaio.btkAkademi.dataAccess;

import java.util.List;

import com.kodlamaio.btkAkademi.entities.City;

public interface ICityDal {
	List<City> getAll();
	void add (City city);
	void update  (City city);
	void delete (City city);

}
