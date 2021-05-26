package myapp.model.dao;

import myapp.model.entity.Model;

import java.util.List;

public interface ModelDao {
     void delete(Model model);

     void createOrUpdate(Model model);

     Model getModelById(int id);

     List<Model> getAll();
}
