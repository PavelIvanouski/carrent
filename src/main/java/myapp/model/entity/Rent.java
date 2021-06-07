package myapp.model.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

public class Rent {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private int carId;
    @Getter
    @Setter
    private int customerId;
    @Getter
    @Setter
    private int statusId;
    @Getter
    @Setter
    private Instant rentBegin;
    @Getter
    @Setter
    private Instant rentEnd;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getCarId() {
//        return carId;
//    }
//
//    public void setCarId(int carId) {
//        this.carId = carId;
//    }
//
//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    public int getStatusId() {
//        return statusId;
//    }
//
//    public void setStatusId(int statusId) {
//        this.statusId = statusId;
//    }
//
//    public Instant getRentBegin() {
//        return rentBegin;
//    }
//
//    public void setRentBegin(Instant rentBegin) {
//        this.rentBegin = rentBegin;
//    }
//
//    public Instant getRentEnd() {
//        return rentEnd;
//    }
//
//    public void setRentEnd(Instant rentEnd) {
//        this.rentEnd = rentEnd;
//    }
}
