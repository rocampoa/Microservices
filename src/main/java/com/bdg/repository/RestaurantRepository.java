package com.bdg.repository;

import com.bdg.repository.Repository;

import java.util.Collection;

/**
 * Created by Rafael on 3/07/2017.
 */
public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {

  boolean containsName(String name);

  Collection<Restaurant> findByName(String name) throws Exception;

}
