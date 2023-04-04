package com.javaguides.basedomainsservice.dto;

import lombok.*;


@Setter
@Getter
public class Order {

    private String orderId;
    private String orderName;
    private int qty;
    private double price;

}
