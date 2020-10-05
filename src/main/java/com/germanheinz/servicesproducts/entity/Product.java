package com.germanheinz.servicesproducts.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name= "products")
public class Product implements Serializable {

    private static final long serialVersionUID = -6452787960092603450L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;



}
