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
public class TodoResponse {

  private static final String URL = "http://localhost:8080/";

  private Long id;
  private String title;
  private Long order;
  private Boolean completed;
  private String url;

  public static TodoResponse toDto(TodoEntity todoEntity) {
    return TodoResponse.builder()
        .id(todoEntity.getId())
        .title(todoEntity.getTitle())
        .order(todoEntity.getOrder())
        .completed(todoEntity.getCompleted())
        .url(URL + todoEntity.getId())
        .build();
  }
}
