package com.bdg.service;

import com.bdg.model.Entity;
import com.bdg.model.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * Created by Rafael on 3/07/2017.
 */
public interface UserService {

  void add(User booking) throws Exception;

  void update(User booking) throws Exception;

  void delete(String id) throws Exception;

  Entity findById(String id) throws Exception;

  Collection<User> findByName(String name) throws Exception;

  Collection<User> findByCriteria(Map<String, ArrayList<String>> name) throws Exception;
}
