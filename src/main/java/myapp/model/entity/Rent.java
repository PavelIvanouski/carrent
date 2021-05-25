package myapp.model.entity;

import java.time.Instant;

public class Rent {
    private int id;
    private int carId;
    private int customerId;
    private int statusId;
    private Instant rentBegin;
    private Instant rentEnd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public Instant getRentBegin() {
        return rentBegin;
    }

    public void setRentBegin(Instant rentBegin) {
        this.rentBegin = rentBegin;
    }

    public Instant getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(Instant rentEnd) {
        this.rentEnd = rentEnd;
    }
}
