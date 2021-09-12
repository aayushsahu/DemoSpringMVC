package com.solinvictus.DemoSpringMVC.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.solinvictus.DemoSpringMVC.Entity.Note;
import com.solinvictus.DemoSpringMVC.Entity.Todo;
import com.solinvictus.DemoSpringMVC.Entity.User;
import com.solinvictus.DemoSpringMVC.Repos.TodoRepository;
import com.solinvictus.DemoSpringMVC.Repos.UserRepository;

import net.bytebuddy.asm.Advice.This;

@Service
public class TodoService {
	private final TodoRepository todoRepository;
	
	public TodoService(TodoRepository todoRepository, User user) {
		this.todoRepository = todoRepository;
	}
	
	public void createTodoItem(Todo todoItem){
		todoRepository.save(todoItem);
	}
	
	public List<Todo> fetchAllTodoItemForUser(User user){
		Iterable<Todo> it = todoRepository.findAll();
		List<Todo> allTodoItems = new ArrayList<>();
		List<Todo> allTodoItemForUser = new ArrayList<>();

		it.forEach(e -> {
			allTodoItems.add(e);
		});
		
		for (Todo todoItem : allTodoItems) {
			System.out.println(todoItem.getUser().getId());
			System.out.println(user.getId());
			if ( todoItem.getUser().getId() ==user.getId())
				allTodoItemForUser.add(todoItem); 
		}
		return allTodoItemForUser;
	}
}
