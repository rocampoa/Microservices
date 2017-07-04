package com.bdg.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafael on 3/07/2017.
 */
public class Restaurant extends BaseEntity<String> {

  private List<Table> tables = new ArrayList<>();
  private String address;

  public Restaurant(String name, String id, String address, List<Table> tables) {
    super(id, name);
    this.tables = tables;
    this.address = address;
  }

  public List<Table> getTables() {
    return tables;
  }

  public void setTables(List<Table> tables) {
    this.tables = tables;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
