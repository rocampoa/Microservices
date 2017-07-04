package com.bdg.vo;

/**
 * Created by Rafael on 3/07/2017.
 */
public class UserVO {

  private String id;
  private String name;
  private String address;
  private String city;
  private String phoneNo;

  public UserVO() {
  }

  public UserVO(String id, String name, String address, String city, String phoneNo) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.city = city;
    this.phoneNo = phoneNo;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  @Override
  public String toString() {
    return new StringBuilder("{id: ").append(id).append(", name: ")
            .append(name).append(", address: ").append(address)
            .append(", city: ").append(city)
            .append(", phoneNo: ").append(phoneNo).append("}").toString();
  }
}
