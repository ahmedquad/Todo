package com.todo;
import java.util.HashMap;
import java.util.Map;

import com.todo.Todo;

public enum TodoDao {
  instance;
  
  private Map<String, Todo> contentProvider = new HashMap<String, Todo>();
  
  private TodoDao() {
    
    Todo todo = new Todo("1", "Ahmed");
    todo.setDescription("hi Ahmed how are things going");
    contentProvider.put("1", todo);
    
    todo = new Todo("2", "Roshan");
    todo.setDescription("hi Roshan whats going on in Home..");
    contentProvider.put("2", todo);

    todo = new Todo("3", "Balu");
    todo.setDescription("hi Balu whats up buddy how is friend Rajesh now.....");
    contentProvider.put("3", todo);

    todo = new Todo("4", "Mahesh");
    todo.setDescription("hi Mahesh how is ur Project going now.....");
    contentProvider.put("4", todo);

    todo = new Todo("5", "Dhana");
    todo.setDescription("hi Dhana whats up buddy wts the rating of iPhone now.....");
    contentProvider.put("5", todo);

    
  }
  public Map<String, Todo> getModel(){
    return contentProvider;
  }
  
} 