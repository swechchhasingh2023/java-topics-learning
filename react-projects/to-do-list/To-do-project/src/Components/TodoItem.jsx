import React from "react";

const TodoItem = ({ todo, onDelete }) => {
  return (
    <div>
      {/* <h4>{todo.srno}</h4> */}
      <h4>{todo.title}</h4>
      <p>{todo.description}</p>
      <button className="btn btn-success btn-sm" onClick={() => onDelete(todo)}>
        Delete
      </button>
      <hr />
    </div>
  );
};

export default TodoItem;
