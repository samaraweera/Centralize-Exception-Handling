package com.commonexception.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="customer")
public class Customer extends BaseResponse{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private Date birthDay;

}
