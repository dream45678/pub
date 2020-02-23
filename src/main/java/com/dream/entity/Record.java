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
public class Record implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String username;
    private String card;
    private Date checkin;
    private Date checkout;
    private int money;


    public Record(){
    }

    public void setId (int id) {this.id = id;} 
    public int getId(){ return id;} 
    public void setUsername (String username) {this.username = username;} 
    public String getUsername(){ return username;} 
    public void setCard (String card) {this.card = card;} 
    public String getCard(){ return card;} 
    public void setCheckin (Date checkin) {this.checkin = checkin;} 
    public Date getCheckin(){ return checkin;} 
    public void setCheckout (Date checkout) {this.checkout = checkout;} 
    public Date getCheckout(){ return checkout;} 
    public void setMoney (int money) {this.money = money;} 
    public int getMoney(){ return money;} 

}