package com.bdg.model;

/**
 * Created by Rafael on 3/07/2017.
 */
public abstract class BaseEntity<T> extends Entity<T> {

  private boolean isModified;

  public BaseEntity(T id, String name) {
    super.id = id;
    super.name = name;
  }

  public boolean isModified() {
    return isModified;
  }
}
