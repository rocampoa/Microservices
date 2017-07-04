package com.bdg.service;

import com.bdg.model.Booking;
import com.bdg.model.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * Created by Rafael on 3/07/2017.
 */
public interface BookingService {

  void add(Booking booking) throws Exception;

  void update(Booking booking) throws Exception;

  void delete(String id) throws Exception;

  Entity findById(String id) throws Exception;

  Collection<Booking> findByName(String name) throws Exception;

  Collection<Booking> findByCriteria(Map<String, ArrayList<String>> name) throws Exception;
}
