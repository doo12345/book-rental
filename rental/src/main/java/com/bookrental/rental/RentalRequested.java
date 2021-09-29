package com.bookrental.rental;

import java.util.Date;

public class RentalRequested extends AbstractEvent {
    
    private Long id;
    private String customerId;
    private String bookId;
    private Date date;
    private String phonenumber;
    private String status;
    
    public RentalRequested(){
        super();
    }

    public RentalRequested(Rental rental){
        this();
        this.setId(rental.getId());
        this.setPhonenumber(rental.getPhonenumber());
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBookId() {
        return this.bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
