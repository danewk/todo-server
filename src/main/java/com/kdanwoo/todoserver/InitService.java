package com.kdanwoo.todoserver;

import com.kdanwoo.todoserver.model.Home;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class InitService {

  private final EntityManager em;

  public void init() {
    Home home = new Home("단우","강동",200000);
    em.persist(home);
  }
}
