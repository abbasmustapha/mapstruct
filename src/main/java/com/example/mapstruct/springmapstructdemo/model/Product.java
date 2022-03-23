package com.example.mapstruct.springmapstructdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Product {

    // 14:34
    // https://www.youtube.com/watch?v=EVCrLp-k494&ab_channel=TechnoTownTechie
    @Id
    private int id;
    private String name;
    private String desc;
    private int quantity;
    private long price;
    private String itemId;
    // private String strCivilité;

    private List<Item> items;

}
