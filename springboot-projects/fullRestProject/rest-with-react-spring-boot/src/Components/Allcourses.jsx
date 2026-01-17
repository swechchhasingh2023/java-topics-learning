import React, { useEffect, useState } from "react";
import Course from "./Course";
import base_url from "../api/bootapi";
import axios from "axios";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

const Allcourses = () => {
  useEffect(() => {
    document.title = "All Courses || Coding";
  }, []);

  // function to call Server
  const getAllCoursesFromServer = () => {
    axios
      .get(`${base_url}/courses`)
      .then((response) => {
        console.log(response.data);
        toast.success("Courses has been loaded", {
          position: "bottom-center",
        });
        setCourses(response.data);
      })
      .catch((error) => {
        console.error(error);
        toast.error("Something went wrong");
      });
  };

  // calling loading course function
  useEffect(() => {
    getAllCoursesFromServer();
  }, []);

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
        ? courses.map((item) => <Course key={item.id} course={item} />)
        : "No Course"}
    </div>
  );
};

export default Allcourses;
