import React, { useState, useEffect } from "react";
import { Header } from "./Components/Header";
import Footer from "./Components/Footer";
import Todos from "./Components/Todos";
import AddTodo from "./Components/AddTodo";

function App() {
  let initTodo;
  if (localStorage.getItem("todos") === null) {
    initTodo = [];
  } else {
    initTodo = JSON.parse(localStorage.getItem("todos"));
  }
  const onDelete = (todo) => {
    console.log("I am deleted", todo);
    setTodos(todos.filter((e) => e !== todo));
    localStorage.setItem("todos", JSON.stringify(todos));
  };

  const addTodo = (title, description) => {
    console.log("I am adding todo", title, description);
    let sno = 0;
    if (todos.length === 0) {
      sno = 0;
    } else {
      sno = todos[todos.length - 1].sno + 1;
    }

    const MyTodo = {
      sno: sno,
      title: title,
      description: description,
    };
    console.log(MyTodo);
    setTodos([...todos, MyTodo]);
  };

  const [todos, setTodos] = useState(initTodo);
  useEffect(() => {
    localStorage.setItem("todos", JSON.stringify(todos));
  }, [todos]);
  return (
    <>
      <Header />
      <AddTodo addTodo={addTodo} />
      <Todos todos={todos} title="To List" onDelete={onDelete} />
      <Footer />
    </>
  );
}

export default App;

// import React, { useState } from "react";
// import { Header } from "./Components/Header";
// import Footer from "./Components/Footer";
// import Todos from "./Components/Todos";
// import AddTodo from "./Components/AddTodo";

// function App() {
//   const onDelete = (todo) => {
//     console.log("I am deleted", todo);

//     setTodos(todos.filter((e) => e !== todo));
//   };

//   const addTodo = (title, description) => {
//     console.log("I am adding todo", title, description);
//     let sno = 0;
//     if (todos.length === 0) {
//       sno = 0;
//     } else {
//       sno = todos[todos.length - 1].sno + 1;
//     }

//     const MyTodo = {
//       sno: sno,
//       title: title,
//       description: description,
//     };
//     console.log(MyTodo);
//     setTodos([...todos, MyTodo]);
//   };

//   const [todos, setTodos] = useState([
//     {
//       sno: 1,
//       title: "React Basics",
//       description:
//         "Learn the fundamentals of React including components, props, and state.",
//     },
//     {
//       sno: 2,
//       title: "Advanced Java",
//       description:
//         "Deep dive into Java concepts like multithreading, collections, and streams.",
//     },
//     {
//       sno: 3,
//       title: "Spring Boot REST API",
//       description:
//         "Build RESTful APIs using Spring Boot with real-world examples.",
//     },
//   ]);
//   return (
//     <>
//       <Header />
//       <AddTodo addTodo={addTodo} />
//       <Todos todos={todos} title="To List" onDelete={onDelete} />
//       <Footer />
//     </>
//   );
// }

// export default App;
