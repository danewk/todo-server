package com.kdanwoo.todoserver.service;

import com.kdanwoo.todoserver.model.TodoEntity;
import com.kdanwoo.todoserver.model.TodoRequest;
import com.kdanwoo.todoserver.model.TodoResponse;
import com.kdanwoo.todoserver.repository.TodoRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TodoService {

  private final TodoRepository todoRepository;

  /**
   * todo 리스트 목록에 아이템을 추가
   * todo 리스트 목록중 특정 아이템을 조회
   * todo 리스트 전체 목록을 조회
   * todo 리스트 목록 중 특정 아이템을 수정
   * todo 리스트 목록 중 특정 아이템을 삭제
   * todo 리스트 전체 목록을 삭제
   */
  @Transactional
  public TodoEntity add(TodoRequest request){
    return todoRepository.save(TodoRequest.toEntity(request));
  }

  public TodoResponse searchById(Long id){
    return null;
  }

  public List<TodoResponse> searchAll(){
    return null;
  }

  public TodoEntity udpateById(Long id){
    return null;
  }

  public void deleteById(Long id){

  }

  public void deleteAll(){

  }


}