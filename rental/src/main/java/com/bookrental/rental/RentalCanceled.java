package com.bookrental.rental;

public class RentalCanceled extends AbstractEvent {

    private Long id;

    public RentalCanceled(){
        super();
    }

    public RentalCanceled(Rental rental){
        this();
        this.setId(rental.getId());
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
