package myapp.controller;

import myapp.controller.dto.EngineIdDto;
import myapp.model.entity.Engine;
import myapp.model.service.EngineService;

import java.util.ArrayList;
import java.util.List;

public class EngineController {
    private EngineService engineService;

    void create() {

        Engine engine = new Engine();
        engineService.update(engine);
    }

    List<EngineIdDto> getAll() {
        List<EngineIdDto> list = new ArrayList<>();

        engineService.getAll().forEach(engine -> {
            EngineIdDto engineIdDto = new EngineIdDto();

            engineIdDto.setId(engine.getId());

            list.add(engineIdDto);

        });
        return list;
    }
}
