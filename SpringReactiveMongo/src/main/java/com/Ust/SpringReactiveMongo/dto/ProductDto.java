package com.Ust.SpringReactiveMongo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    @Id
    private String id;
    private String name;
    private int qty;
    private double price;
}
