package com.bookrental.book;

import java.util.Date;

public class BookPaid extends AbstractEvent{

    Long id;
    String name;
    String 저자;
    String 출판사;
    Date 등록일;
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

    public String get저자() {
        return this.저자;
    }

    public void set저자(String 저자) {
        this.저자 = 저자;
    }

    public String get출판사() {
        return this.출판사;
    }

    public void set출판사(String 출판사) {
        this.출판사 = 출판사;
    }

    public Date get등록일() {
        return this.등록일;
    }

    public void set등록일(Date 등록일) {
        this.등록일 = 등록일;
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
