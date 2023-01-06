package com.kodlamaio.btkAkademi.dataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.kodlamaio.btkAkademi.entities.City;

//JPA-ORM
public class HibernateCityDal implements ICityDal {

	@Autowired //gerekli injection işlemini yapar.
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	private EntityManager entityManager;
	
	@Override
	@Transactional   //getall basında ve sonunda bizim için transactional acar (AOP)
	public List<City> getAll() {
		Session session= entityManager.unwrap(Session.class); //hibarnete ile igili sessionları getir 
	    List<City> cities= session.createQuery("from City",City.class).getResultList();
	    return cities;
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
