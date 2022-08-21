package com.kdanwoo.todoserver.service;

import static org.junit.jupiter.api.Assertions.*;

import com.kdanwoo.todoserver.model.TodoEntity;
import com.kdanwoo.todoserver.model.TodoRequest;
import com.kdanwoo.todoserver.model.TodoResponse;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
class TodoServiceTest {

  @Autowired
  TodoService todoService;

  @Test
  public void add() {
    TodoRequest request = TodoRequest.builder()
        .title("제목")
        .order(1L)
        .completed(false)
        .build();

    TodoEntity savedEntity = todoService.add(request);

    Assertions.assertThat(savedEntity.getTitle()).isEqualTo("제목");

  }

  @Test
  public void searchTest(){
    TodoRequest request = TodoRequest.builder()
        .title("제목")
        .order(1L)
        .completed(false)
        .build();

    TodoEntity savedEntity = todoService.add(request);
    TodoEntity findEntity = todoService.searchById(savedEntity.getId());


    Assertions.assertThat(savedEntity.getId()).isEqualTo(findEntity.getId());

  }
}