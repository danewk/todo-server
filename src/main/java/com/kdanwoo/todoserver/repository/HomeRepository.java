package com.kdanwoo.todoserver.repository;

import com.kdanwoo.todoserver.model.Home;
import javax.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
  Home findByName(String name);

  //@Lock(LockModeType.PESSIMISTIC_WRITE)
  @Query("select h from Home h where h.name = :name")
  Home findWithNameForUpdate(@Param("name") String name);
}
