package myapp.model.service;

import myapp.model.dao.EngineDao;
import myapp.model.entity.Engine;
import myapp.model.entity.Model;

import java.sql.SQLException;
import java.util.List;

public class EngineService {

    private EngineDao dao;

    public void delete(Engine engine) {

        dao.delete(engine);
    }

    public void createOrUpdate(Engine engine) {

        dao.createOrUpdate(engine);
    }

    public Engine getModelById(int id) throws SQLException {
        if (id > 0) {
            return dao.getEngineById(id);
        }
        return null;
    }

    public List<Engine> getAll() {

        return dao.getAll();
    }

    public void update(Engine engine) {
        dao.createOrUpdate(engine);

    }
}
