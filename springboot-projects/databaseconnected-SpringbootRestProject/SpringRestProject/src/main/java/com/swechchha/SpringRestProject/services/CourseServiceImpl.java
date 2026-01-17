//  database connected : Mysql

package com.swechchha.SpringRestProject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swechchha.SpringRestProject.dao.CourseDao;
import com.swechchha.SpringRestProject.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
	    return course;
	}


	@Override
	public void deleteCourse(long parseLong) {
		Course entity= courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}



// no database connected
//package com.swechchha.SpringRestProject.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Service;
//
//import com.swechchha.SpringRestProject.entities.Course;
//
//@Service
//public class CourseServiceImpl implements CourseService {
//	
//	List<Course> list;
//	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(1, "Java Core Course", "this course contain basics"));
//		list.add(new Course(2, "Spring Boot Course", "REST api using Spring Boot"));
//	}
//
//	@Override
//	public List<Course> getCourses() {
//		return list;
//	}
//
//	@Override
//	public Course getCourse(long courseId) {
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId()== courseId) {
//				c= course;
//				break;
//			}
//		}
//		return c;
//	}
//
//	@Override
//	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
//	}
//
//	@Override
//	public Course updateCourse(Course course) {
//	    for (Course e : list) {
//	        if (e.getId() == course.getId()) {
//	            e.setTitle(course.getTitle());
//	            e.setDescription(course.getDescription());
//	            return e;   // return updated object from list
//	        }
//	    }
//	    return null;  // if no course found
//	}
//
//
//	@Override
//	public void deleteCourse(long parseLong) {
//		list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
//	}
//	
//
////	 @Override
////	    public Course updateCourse(Long courseId, Course course) {
////	        for (int i = 0; i < list.size(); i++) {
////	            Course c = list.get(i);
////	            if (c.getId() == courseId) {
////	                course.setId(courseId); // ensure id consistency
////	                list.set(i, course);
////	                return course;
////	            }
////	        }
////	        return null;
////	    }
////
////	    @Override
////	    public void deleteCourse(Long courseId) {
////	        list.removeIf(c -> c.getId() == courseId);
////	    }
//	
//	
//
//}
