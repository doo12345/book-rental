package com.bookrental.rental.external;

public class Pay {

    private Long id;
    private String rentalId;
    private int payAmt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getOrderId() {
        return rentalId
;
    }

    public void setOrderId(String rentalId) {
        this.rentalId
 = rentalId
;
    }
    public int getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(int payAmt) {
        this.payAmt = payAmt;
    }

}

