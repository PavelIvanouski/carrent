package myapp.model.entity;

import lombok.Getter;
import lombok.Setter;

public class Model {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int seatsNum;
    @Getter
    @Setter
    private int engineVolume;
    @Getter
    @Setter
    private int engineId;
    @Getter
    @Setter
    private int typeId;
    @Getter
    @Setter
    private boolean autoTransmission;

//    public int getTypeId() {
//        return typeId;
//    }
//
//    public void setTypeId(int typeId) {
//        this.typeId = typeId;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSeatsNum() {
//        return seatsNum;
//    }
//
//    public void setSeatsNum(int seatsNum) {
//        this.seatsNum = seatsNum;
//    }
//
//    public int getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(int engineVolume) {
//        this.engineVolume = engineVolume;
//    }
//
//    public int getEngineId() {
//        return engineId;
//    }
//
//    public void setEngineId(int engineId) {
//        this.engineId = engineId;
//    }
//
//    public boolean isAutoTransmission() {
//        return autoTransmission;
//    }
//
//    public void setAutoTransmission(boolean autoTransmission) {
//        this.autoTransmission = autoTransmission;
//    }
}
