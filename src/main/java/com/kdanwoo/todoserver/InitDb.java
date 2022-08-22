package com.kdanwoo.todoserver;

import com.kdanwoo.todoserver.model.Home;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class InitDb {

  private final InitService initService;

  @PostConstruct
  @Transactional
  public void init() {
    createHome();
  }

  private void createHome() {
    initService.init();

  }

}
