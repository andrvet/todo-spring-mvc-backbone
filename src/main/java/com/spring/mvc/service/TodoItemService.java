package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.domain.TodoItem;

@Service
@Transactional
public class TodoItemService {
	@Autowired
	private TodoItemRepository todoItemRepository;

	public List<TodoItem> list() {
		return todoItemRepository.findAll();
	}

	public TodoItem create(TodoItem todoItem) {
		return todoItemRepository.save(todoItem);
	}

	// vet
	public TodoItem put(TodoItem todoItem) {
		return todoItemRepository.save(todoItem);
	}

}
