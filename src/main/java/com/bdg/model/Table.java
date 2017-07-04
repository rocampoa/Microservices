package com.bdg.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

/**
 * Created by Rafael on 3/07/2017.
 */
public class Table extends BaseEntity<BigInteger> {

  private int capacity;

  public Table(@JsonProperty("name") String name, @JsonProperty("id") BigInteger id, @JsonProperty("capacity") int capacity) {
    super(id, name);
    this.capacity = capacity;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return new StringBuilder("{id: ").append(id).append(", name: ")
            .append(name).append(", capacity: ").append(capacity).append("}").toString();
  }

}
