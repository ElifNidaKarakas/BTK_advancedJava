package com.kodlamaio.btkAkademi.entities;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //veri tabanı nesnesi oldugunu anlatır
@Table(name="city")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//otomatik arttığını söylemek için value ayarlıyoruz
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="countryCode")
	private String countryCode;
	@Column(name="distrinct")
	private String distrinct;
	@Column(name="population")
	private int population;

	
}
