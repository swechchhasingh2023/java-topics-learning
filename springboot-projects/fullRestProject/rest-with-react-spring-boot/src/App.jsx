import React from "react";
import Home from "./Components/Home";
import Course from "./Components/Course";
import Allcourses from "./Components/Allcourses";
import AddCourse from "./Components/AddCourse";
import { Col, Container, Row } from "reactstrap";
import Header from "./Components/Header";
import Menus from "./Components/Menus";
import { ToastContainer } from "react-toastify";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

function App() {
  return (
    <div>
      <ToastContainer />
      <Router>
        <Container>
          <Header />
          <Row>
            <Col md={4}>
              <Menus />
            </Col>
            <Col md={8}>
              <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/add-course" element={<AddCourse />} />
                <Route path="/view-courses" element={<Allcourses />} />
              </Routes>

              {/* <Route path="/" Component={Home} exact />
              <Route path="/add-course" Component={AddCourse} exact />
              <Route path="/view-courses" Component={AddCourse} exact /> */}
            </Col>
          </Row>
        </Container>
      </Router>
    </div>
  );
}

export default App;
