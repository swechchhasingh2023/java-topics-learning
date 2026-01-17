//package com.swechchha.HibernateDemo;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.Transient;
//
//@Entity
//@Table(name="alien_table")
//public class Alienn {
//	@Id
//	private int aid;
//	@Transient
//	private String name;
//	@Column(name="alien_color")
//	private String color;
//	public int getAid() {
//		return aid;
//	}
//	public void setAid(int aid) {
//		this.aid = aid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}	
//}

//Fetching Data using Hibernate 
//package com.swechchha.HibernateDemo;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="alien_G")
//public class Alienn {
//	@Id
//	private int aid;
//	private String name;
//	private String color;
//	public int getAid() {
//		return aid;
//	}
//	public void setAid(int aid) {
//		this.aid = aid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	@Override
//	public String toString() {
//		return "Alienn [aid=" + aid + ", name=" + name + ", color=" + color + "]";
//	}
//}

//how to use embeddable object
package com.swechchha.HibernateDemo;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alien_G")
public class Alienn {
	@Id
	private int aid;
	@Embedded
	private AlienName aname; // Kumari Swechchha Singh
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}

	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alienn [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

	
}

