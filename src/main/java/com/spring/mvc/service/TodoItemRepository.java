package com.spring.mvc.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mvc.domain.TodoItem;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}