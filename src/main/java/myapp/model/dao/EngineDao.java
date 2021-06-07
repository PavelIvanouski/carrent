package myapp.model.dao;

import myapp.model.entity.Engine;


import java.util.List;

public interface EngineDao extends GenericDao<Engine>{


     Engine getEngineById(int id);

     List<Engine> getAll();
}
