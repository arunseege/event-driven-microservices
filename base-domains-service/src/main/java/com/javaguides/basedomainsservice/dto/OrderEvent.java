package com.javaguides.basedomainsservice.dto;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
public class OrderEvent {

    private String message;
    private String status;
    private Order order;

}
