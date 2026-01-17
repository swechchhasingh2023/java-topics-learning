import React from "react";
import { Button, Container, Form, FormGroup, Input } from "reactstrap";

const AddCourse = () => {
  return (
    <>
      <h1 className="text-center my-3">Fill Course Details</h1>
      <Form>
        <FormGroup>
          <label for="userId">Course Id</label>
          <Input
            type="text"
            placeholder="Enter here"
            name="userId"
            id="userId"
          />
        </FormGroup>
        <FormGroup>
          <label for="title">Course Title</label>
          <Input type="text" placeholder="Enter Title here" id="title" />
        </FormGroup>
        <FormGroup>
          <label for="description">Course description</label>
          <Input
            type="textarea"
            placeholder="enter description here"
            id="description"
            style={{ height: 100 }}
          />
        </FormGroup>
        <Container className="text-center">
          <Button color="success">Add Course</Button>
          <Button color="warning" className="ms-2">
            Clear
          </Button>
        </Container>
      </Form>
    </>
  );
};
export default AddCourse;
