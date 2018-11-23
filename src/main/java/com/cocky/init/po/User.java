package com.cocky.init.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class User {

    @Id
    private Integer id;

    @Column
    private String userName;
    
    @Column
    private String password;

    @Column
    private Integer age;

}