package com.amit.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

import lombok.Data;
//@Table(name= "userdetails")
@Entity(name= "userdetails")

public @Data class UserEntity 
{

@Id
private long id;//primary key
private String name;

private String address;

private String email_id;

private String gender;

private String status;

}
