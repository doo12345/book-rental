package com.bookrental.book;

public class BookAdded extends AbstractEvent{

    Long id;
    String name;
    Long rentalId;
    String Status;
    int 가격;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRentalId() {
        return this.rentalId;
    }

    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int get가격() {
        return this.가격;
    }

    public void set가격(int 가격) {
        this.가격 = 가격;
    }

    
}
