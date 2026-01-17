package com.swechchha.HibernateCaching;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@javax.persistence.Entity
//@Table(name="Alienn")
@javax.persistence.Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alienn {
	@javax.persistence.Id
	private int aid;
	private String name;
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alienn [aid=" + aid + ", name=" + name + ", color=" + color + "]";
	}
	
}
