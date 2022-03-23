package com.example.mapstruct.springmapstructdemo.dto;

import com.example.mapstruct.springmapstructdemo.model.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.util.List;

@Setter
@Getter
public class ProductDto {

    @Id
    private int id;
    private String name;
    private String description;
    private String quantity;
    private long price;
    private String itemId;
    // private int intCivilite;
    private List<Item> itemsList;

}
