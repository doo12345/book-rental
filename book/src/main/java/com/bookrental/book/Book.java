package com.bookrental.book;

import java.util.Date;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "Book_table")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String 저자;
    String 출판사;
    Date 등록일;
    Long rentalId;
    String Status;
    int 가격;

    @PostPersist
    public void onPostPersist(){
        BookAdded 책이등록됨 = new BookAdded();
        책이등록됨.setId(Long.valueOf(getId()));
        BeanUtils.copyProperties(this, 책이등록됨);
        책이등록됨.publish();
    }

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

    public Date getDate() {
        return this.등록일;
    }

    public void setDate(Date date) {
        this.등록일 = date;
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
