package myapp.model.dao;

import myapp.model.entity.Engine;
import myapp.model.entity.Model;

import java.util.List;

public interface EngineDao {
     void delete(Engine engine);

     void createOrUpdate(Engine engine) ;

     Model getEngineById(int id);

     List<Engine> getAll();
}
