package com.javaguides.basedomainsservice.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Order {

    private String orderId;
    private String orderName;
    private int qty;
    private double price;

}
