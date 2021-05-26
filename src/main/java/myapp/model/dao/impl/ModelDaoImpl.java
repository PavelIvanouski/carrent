package myapp.model.dao.impl;

import myapp.model.dao.ModelDao;
import myapp.model.entity.Model;

import java.util.List;

public class ModelDaoImpl implements ModelDao {
    public void delete(Model model) {

    }

    public void createOrUpdate(Model model) {

    }

    public Model getModelById(int id) {
        Model model = new Model();
        //connection...
        //model.setId();
        return model;
    }

    public List<Model> getAll() {

        return null;
    }
}
