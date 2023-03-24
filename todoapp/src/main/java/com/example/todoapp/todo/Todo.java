package com.example.todoapp.todo;

import java.time.LocalDate;

//database
//

public class Todo {

	private int id;
	private String username;
	private String description;
	private LocalDate targetDate;
	private boolean done;

	public Todo(int id, String username, String description, LocalDate date, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = date;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return targetDate;
	}

	public void setDate(LocalDate date) {
		this.targetDate = date;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public LocalDate getTargeDate() {
		return targetDate;
	}

	public void setTargeDate(LocalDate targeDate) {
		this.targetDate = targeDate;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targeDate=" + targetDate
				+ ", done=" + done + "]";
	}

}
