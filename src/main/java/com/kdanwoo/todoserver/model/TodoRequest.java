package com.kdanwoo.todoserver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoRequest {

  private String title;
  private Long order;
  private Boolean completed;

  public static TodoEntity toEntity(TodoRequest request){
    return TodoEntity.builder()
        .title(request.getTitle())
        .completed(request.getCompleted())
        .order(request.getOrder())
        .build();

  }

}
