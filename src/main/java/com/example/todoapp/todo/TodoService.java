package com.example.todoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount,"in28minutes" , "learn AWS" , LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todosCount,"in28minutes" , "learn devops" ,LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++todosCount,"in28minutes" , "learn learn full stack" , LocalDate.now().plusYears(3),false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username , String description , LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
	
	
	public void deleteById(int id){
		
		//todo.getId() == id
		//todo -> todo.getId() == id;
		Predicate<? super Todo> Predicate = todo -> todo.getId() == id;
		todos.removeIf(Predicate);
		
	}

	public Todo findById(int id) {
		Predicate<? super Todo> Predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(Predicate).findFirst().get();
		return todo;
	}
}
