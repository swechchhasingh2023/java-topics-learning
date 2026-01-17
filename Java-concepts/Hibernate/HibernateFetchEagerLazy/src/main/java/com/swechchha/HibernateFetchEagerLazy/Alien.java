package com.swechchha.HibernateFetchEagerLazy;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	
	@OneToMany(mappedBy="alien", fetch= FetchType.EAGER)
	private Collection<Laptop> lap = new ArrayList<>();
	
	public Collection<Laptop> getLap() {
		return lap;
	}
	public void setLap(Collection<Laptop> lap) {
		this.lap = lap;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
}
