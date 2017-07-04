package com.bdg.service;

import com.bdg.repository.Repository;

/**
 * Created by Rafael on 3/07/2017.
 */
public abstract class ReadOnlyBaseService <TE, T> {

  private Repository<TE, T> repository;

  public ReadOnlyBaseService(Repository<TE, T> repository) {
    this.repository = repository;
  }
}
