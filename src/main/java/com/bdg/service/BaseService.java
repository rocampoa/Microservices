package com.bdg.service;

import com.bdg.repository.Repository;

import java.util.Collection;

/**
 * Created by Rafael on 3/07/2017.
 */
public abstract class BaseService<TE, T> extends ReadOnlyBaseService<TE, T> {

  private Repository<TE, T> _repository;

  public BaseService(Repository<TE, T> repository) {
    super(repository);
    this._repository = repository;
  }

  public void add(TE entity) throws Exception {
    _repository.add(entity);
  }

  public Collection<TE> getAll() {
    return _repository.getAll();
  }

}
