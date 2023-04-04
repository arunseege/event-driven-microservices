package com.javaguides.basedomainsservice.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class OrderEvent {

    private String message;
    private String status;
    private Order order;

}
