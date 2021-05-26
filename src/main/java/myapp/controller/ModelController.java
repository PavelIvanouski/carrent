package myapp.controller;

import myapp.model.entity.Model;
import myapp.model.service.ModelService;

import java.awt.print.Book;

public class ModelController {
    private ModelService modelService;

    void create() {
        Model model = new Model();
        //from request
        //book.setId(req.getParameter("id"));
        modelService.update(model);
    }

}
