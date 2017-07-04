package com.bdg.repository;

import com.bdg.model.Booking;
import com.bdg.model.Entity;
import org.springframework.stereotype.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rafael on 3/07/2017.
 */
@org.springframework.stereotype.Repository("bookingRepository")
public class InMemBookingRepository  implements BookingRepository<Booking, String> {

  private Map<String, Booking> entities;

  public InMemBookingRepository() {
    entities = new HashMap();
    Booking booking = new Booking("1", "Booking 1", "1", "1", "1", LocalDate.now(), LocalTime.now());
    entities.put("1", booking);
    Booking booking2 = new Booking("2", "Booking 2", "2", "2", "2", LocalDate.now(), LocalTime.now());
    entities.put("2", booking2);
  }

  @Override
  public boolean containsName(String name) {
    try {
      return this.findByName(name).size() > 0;
    } catch (Exception ex) {
      //Exception Handler
    }
    return false;
  }

  @Override
  public void add(Booking entity) {
    entities.put(entity.getId(), entity);
  }

  @Override
  public void remove(String id) {
    if (entities.containsKey(id)) {
      entities.remove(id);
    }
  }

  @Override
  public void update(Booking entity) {
    if (entities.containsKey(entity.getId())) {
      entities.put(entity.getId(), entity);
    }
  }

  @Override
  public boolean contains(String id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Entity get(String id) {
    return entities.get(id);
  }

  @Override
  public Collection<Booking> getAll() {
    return entities.values();
  }


  @Override
  public Collection<Booking> findByName(String name) throws Exception {
    Collection<Booking> bookings = new ArrayList();
    int noOfChars = name.length();
    entities.forEach((k, v) -> {
      if (v.getName().toLowerCase().contains(name.toLowerCase().subSequence(0, noOfChars))) {
        bookings.add(v);
      }
    });
    return bookings;
  }

}
