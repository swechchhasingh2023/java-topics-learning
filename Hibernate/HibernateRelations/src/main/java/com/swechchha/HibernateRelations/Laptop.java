//one to one 
//package com.swechchha.HibernateRelations;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//@Entity
//public class Laptop {
//	@Id
//	private int lid;
//	private String lname;
//	
//	
//	public int getLid() {
//		return lid;
//	}
//	public void setLid(int lid) {
//		this.lid = lid;
//	}
//	public String getLname() {
//		return lname;
//	}
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
//	
//}


////one to many 
//package com.swechchha.HibernateRelations;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//@Entity
//public class Laptop {
//	@Id
//	private int lid;
//	private String lname;
//	
//	
//	public int getLid() {
//		return lid;
//	}
//	public void setLid(int lid) {
//		this.lid = lid;
//	}
//	public String getLname() {
//		return lname;
//	}
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
//	
//}

// many to one
//package com.swechchha.HibernateRelations;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class Laptop {
//	@Id
//	private int lid;
//	private String lname;
//	@ManyToOne
//	private Student student;
//	
//	public int getLid() {
//		return lid;
//	}
//	public void setLid(int lid) {
//		this.lid = lid;
//	}
//	public String getLname() {
//		return lname;
//	}
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//	
//}

// many to many
package com.swechchha.HibernateRelations;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Student> student = new ArrayList<>() ;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
