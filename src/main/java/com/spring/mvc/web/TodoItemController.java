package com.spring.mvc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.domain.TodoItem;
import com.spring.mvc.service.TodoItemService;

@RestController
public class TodoItemController {
	@Autowired
	private TodoItemService todoItemService;

	@RequestMapping(value = "/api/todo-items", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@Transactional(readOnly = true)
	public List<TodoItem> getTodoItems() {
		return todoItemService.list();
	}

	@RequestMapping(value = "/api/todo-items", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public TodoItem createTodoItem(TodoItem todoItem) {
		return todoItemService.create(todoItem);
	}

	// vet
	@RequestMapping(value = "/api/todo-items", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody TodoItem put(TodoItem todoItem) {
		return todoItemService.put(todoItem);
	}
}