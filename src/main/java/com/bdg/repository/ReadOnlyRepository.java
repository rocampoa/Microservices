package com.bdg.repository;

import com.bdg.model.Entity;

import java.util.Collection;

/**
 * Created by Rafael on 3/07/2017.
 */
public interface ReadOnlyRepository <TE, T> {

  boolean contains(T id);

  Entity<TE> get(T id);

  Collection<TE> getAll();

}
