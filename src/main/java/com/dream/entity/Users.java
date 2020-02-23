package com.dream.entity;

import java.io.Serializable;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Author dream
 * Date  2020-02-23
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String phone;
    private String name;
    private String card;
    private int power;
    private String password;


    public Users(){
    }

    public void setId (int id) {this.id = id;} 
    public int getId(){ return id;} 
    public void setPhone (String phone) {this.phone = phone;} 
    public String getPhone(){ return phone;} 
    public void setName (String name) {this.name = name;} 
    public String getName(){ return name;} 
    public void setCard (String card) {this.card = card;} 
    public String getCard(){ return card;} 
    public void setPower (int power) {this.power = power;} 
    public int getPower(){ return power;} 
    public void setPassword (String password) {this.password = password;} 
    public String getPassword(){ return password;} 

}