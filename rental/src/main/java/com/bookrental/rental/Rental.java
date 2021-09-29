package com.bookrental.rental;
import java.util.Date;
import java.util.Optional;

import javax.persistence.*;

import com.bookrental.rental.external.Pay;

@Entity
@Table(name="rental_table")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerId;
    private String bookId;
    private Date date;
    private String phonenumber;
    private String status;


    @PostPersist
    private void publishRentalRequested(){

            Pay pay = new Pay();

            pay.setOrderId(String.valueOf(getId()));
    
            Application.applicationContext.getBean(com.bookrental.rental.external.PayService.class).pay(pay);
            
            RentalRequested rentalRequested = new RentalRequested(this);
            rentalRequested.publish();
    }

    @PostUpdate
    private void publishRentalCancelled(){
        if( "결제취소".equals(this.getStatus())){
            // 이벤트를 발송하기 위하여 주문의 상세 정보를 조회

            RentalRepository rentalRepository = Application.applicationContext.getBean(RentalRepository.class);
            Optional<Rental> rentalOptional = rentalRepository.findById(this.getId());
            Rental rental = rentalOptional.get();

            RentalCanceled rentalCancelled = new RentalCanceled(rental);
            rentalCancelled.publish();
        }
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
