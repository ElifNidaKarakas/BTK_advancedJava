package com.kodlamaio.btkAkademi.dataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kodlamaio.btkAkademi.entities.City;

//JPA-ORM
@Repository
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
		Session session= entityManager.unwrap(Session.class); //hibarnete ile igili sessionları getir 
	    session.saveOrUpdate(city);		
	}

	@Override
	public void update(City city) {
		Session session= entityManager.unwrap(Session.class); //hibarnete ile igili sessionları getir 
	    session.saveOrUpdate(city);
	}

	@Override
	public void delete(City city) {
		Session session= entityManager.unwrap(Session.class); //hibarnete ile igili sessionları getir 
		 City cityDelete= session.get(City.class, city.getId());
		session.delete(cityDelete);
		
		
	}

	@Override
	public City getById(int id) {
		Session session= entityManager.unwrap(Session.class); //hibarnete ile igili sessionları getir 
	    City city= session.get(City.class, id);
	    return city;
	}

}
