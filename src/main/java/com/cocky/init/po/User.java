package com.cocky.init.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "User")
public class User {

    @Id
    private Integer id;

    @Column(name = "username")
    private String userName;
    
    @Column(name = "password")
    private String password;

    @Column
    private Integer age;

}