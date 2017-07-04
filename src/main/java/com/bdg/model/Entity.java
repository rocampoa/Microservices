package com.bdg.model;

/**
 * Created by Rafael on 3/07/2017.
 */
public abstract class Entity<T> {

  T id;
  String name;

  public T getId() {
    return id;
  }

  public void setId(T id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
