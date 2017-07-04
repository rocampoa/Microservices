package com.bdg.repository;

/**
 * Created by Rafael on 3/07/2017.
 */
public interface Repository<TE, T> extends ReadOnlyRepository<TE, T> {

  void add(TE entity);

  void remove(T id);

  void update(TE entity);

}
