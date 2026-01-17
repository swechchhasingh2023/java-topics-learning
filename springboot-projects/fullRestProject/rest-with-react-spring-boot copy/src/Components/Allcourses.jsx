import React, { useState } from "react";
import Course from "./Course";

const Allcourses = () => {
  const [courses, setCourses] = useState([
    { title: "Java Course", description: "This is demo Course" },
    { title: "ReactJs Course", description: "This is demo Course" },
    { title: "Django Course", description: "This is demo Course" },
    { title: "Python Course", description: "This is demo Course" },
  ]);
  return (
    <div>
      <h1>All Courses</h1>
      <p>List of courses are as follows</p>
      {courses.length > 0
        ? courses.map((item) => <Course course={item} />)
        : "No Course"}
    </div>
  );
};

export default Allcourses;
