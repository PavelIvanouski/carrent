package myapp.model.dao;

import myapp.model.entity.Engine;

public interface GenericDao<T> {
    void delete(T engine);

    void createOrUpdate(T engine) ;

}
