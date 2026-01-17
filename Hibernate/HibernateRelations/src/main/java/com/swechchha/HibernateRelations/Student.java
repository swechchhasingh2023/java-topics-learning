//one to one 
//package com.swechchha.HibernateRelations;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//
//@Entity
//public class Student {
//	@Id
//	private int rollno;
//	private String name;
//	private int marks;
//	@OneToOne
//	private Laptop laptop;
//	
//	public int getRollno() {
//		return rollno;
//	}
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMarks() {
//		return marks;
//	}
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
//}


//one to many 
//package com.swechchha.HibernateRelations;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Student {
//	@Id
//	private int rollno;
//	private String name;
//	private int marks;
//	@OneToMany
//	private List<Laptop> laptop = new ArrayList<>();
//	
//	public int getRollno() {
//		return rollno;
//	}
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMarks() {
//		return marks;
//	}
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}
//}

// many to one
//package com.swechchha.HibernateRelations;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Student {
//	@Id
//	private int rollno;
//	private String name;
//	private int marks;
//	@OneToMany(mappedBy = "student")
//	private List<Laptop> laptop = new ArrayList<>();
//	
//	public int getRollno() {
//		return rollno;
//	}
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMarks() {
//		return marks;
//	}
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}
//}


// many to many
package com.swechchha.HibernateRelations;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int marks;
	@ManyToMany(mappedBy = "student")
	private List<Laptop> laptop = new ArrayList<>();
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
}
