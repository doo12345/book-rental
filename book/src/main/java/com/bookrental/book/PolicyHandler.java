package com.bookrental.book;

import com.bookrental.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{

    @Autowired BookRepository bookRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void startMenu(@Payload BookPaid bookRentaled){

        if(bookRentaled.isMe()){
            System.out.println("##### listener 책이대여됨 : " + bookRentaled.toJson());

            Book 대출 = new Book();
            대출.setRentalId(Long.valueOf(bookRentaled.getRentalId()));
            bookRepository.save(대출);
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void calcelOrder(@Payload BookReturned bookReturned){

        if(bookReturned.isMe()){
            System.out.println("##### listener 책이반납됨 : " + bookReturned.toJson());

            bookRepository.findById(Long.valueOf(bookReturned.getRentalId())).ifPresent(Book->{
                bookRepository.delete(Book);
            });

        }
    }

}
