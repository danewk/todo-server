package com.kdanwoo.todoserver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Home {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idx;
  private String name;
  private String address;
  private int price;

  public Home(String name, String address, int price) {
    this.name = name;
    this.address = address;
    this.price = price;
  }

  public int decreasePrice(int price) {
    if (this.price - price < 0) {
      throw new IllegalArgumentException("가격이 부족해");
    }
    return this.price -= price;
  }

}
