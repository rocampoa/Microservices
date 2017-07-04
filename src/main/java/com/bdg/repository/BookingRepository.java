package com.bdg.repository;

import java.util.Collection;

/**
 * Created by Rafael on 3/07/2017.
 */
public interface BookingRepository<Booking, String> extends Repository<Booking, String> {


  boolean containsName(String name);

  Collection<Booking> findByName(String name) throws Exception;
}