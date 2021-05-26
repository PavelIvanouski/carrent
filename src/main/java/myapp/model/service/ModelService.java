package myapp.model.service;

import myapp.model.dao.ModelDao;
import myapp.model.entity.Model;

import java.awt.print.Book;
import java.util.List;

public class ModelService {
    private ModelDao dao;

    public void delete(Model model) {

        dao.delete(model);
    }

    public void createOrUpdate(Model model) {

        dao.createOrUpdate(model);
    }

    public Model getModelById(int id) {
        if (id > 0) {
            return dao.getModelById(id);
        }
        return null;
    }

    public List<Model> getAll() {

        return dao.getAll();
    }

    public void update(Model model) {
        dao.createOrUpdate(model);
    }
}
