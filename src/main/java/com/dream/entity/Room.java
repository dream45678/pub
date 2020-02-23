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
public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int status;
    private String details;
    private int num;
    private int money;
    private Timestamp checkin;
    private int userid;


    public Room(){
    }

    public void setId (int id) {this.id = id;} 
    public int getId(){ return id;} 
    public void setStatus (int status) {this.status = status;} 
    public int getStatus(){ return status;} 
    public void setDetails (String details) {this.details = details;} 
    public String getDetails(){ return details;} 
    public void setNum (int num) {this.num = num;} 
    public int getNum(){ return num;} 
    public void setMoney (int money) {this.money = money;} 
    public int getMoney(){ return money;} 
    public void setCheckin (Timestamp checkin) {this.checkin = checkin;} 
    public Timestamp getCheckin(){ return checkin;} 
    public void setUserid (int userid) {this.userid = userid;} 
    public int getUserid(){ return userid;} 

}