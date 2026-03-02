package com.example.q8;

import java.util.Date;

public class BaseballDomain {
	private Integer id;
	private String name;
	private Date establishedDate;
	private StadiumDomain stadiumDomain;

	public BaseballDomain() {
	}

	public BaseballDomain(Integer id, String name, Date establishedDate, StadiumDomain stadiumDomain) {
		super();
		this.id = id;
		this.name = name;
		this.establishedDate = establishedDate;
		this.stadiumDomain = stadiumDomain;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public StadiumDomain getStadiumDomain() {
		return stadiumDomain;
	}

	public void setStadiumDomain(StadiumDomain stadiumDomain) {
		this.stadiumDomain = stadiumDomain;
	}

}
