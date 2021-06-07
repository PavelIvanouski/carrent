package myapp.model.dao;

import myapp.model.entity.Engine;


import java.sql.SQLException;
import java.util.List;

public interface EngineDao extends GenericDao<Engine>{


     Engine getEngineById(int id) throws SQLException;

     List<Engine> getAll();
}
