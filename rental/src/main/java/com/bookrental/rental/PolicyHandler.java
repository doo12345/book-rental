package com.bookrental.rental;

import com.bookrental.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{

    @Autowired
    RentalRepository rentalRepository;

    // @StreamListener(KafkaProcessor.INPUT)
    // public void changeOrderStatus(@Payload DeliveryStarted deleveryStarted){
    //     try {
    //       if(deleveryStarted.isMe() && deleveryStarted.getOrderId()!=null){

    //     //    try {
    //     //        // 원래 데이터가 트랜잭션 커밋되기도 전에 이벤트가 너무 빨리 도달하는 경우를 막기 위함
    //     //        Thread.currentThread().sleep(3000); //  no good. --> pay 가 TX 를 마친 후에만 실행되도록 수정함
    //     //    } catch (InterruptedException e) {
    //     //        e.printStackTrace();
    //     //    }

    //         System.out.println("##### listener : " + deleveryStarted.getOrderId());

    //         Rental rental = new Rental();
    //         rental.setId(deleveryStarted.getOrderId());
    //         rental.setStatus("deleveryStarted");
    //         rentalRepository.save(rental);

    //     }}catch (Exception e){
    //         e.printStackTrace();
    //     }
        
    // }

}
