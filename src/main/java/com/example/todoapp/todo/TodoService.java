package com.example.todoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(1,"in28minutes" , "learn AWS" , LocalDate.now().plusYears(1),false));
		todos.add(new Todo(2,"in28minutes" , "learn devops" ,LocalDate.now().plusYears(2),false));
		todos.add(new Todo(3,"in28minutes" , "learn learn full stack" , LocalDate.now().plusYears(3),false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
}
