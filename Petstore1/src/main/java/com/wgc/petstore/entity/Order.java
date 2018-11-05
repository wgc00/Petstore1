package com.wgc.petstore.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;
import java.util.List;

/*订单类*/
public class Order {
    private Integer orderId;

    private String orderNumber;

    private Integer petId;

    private Integer orderQuantity;

    private Date orderShipDate;

    //@Enumerated(EnumType.STRING)
    private String orderStatus;

    private byte[] orderComplete;

    //有宠物信息
    private List<Pet> pet;

    private List<Tag> tags;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Pet> getPet() {
        return pet;
    }

    public Integer getPetId() {
        return petId;
    }


    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Date getOrderShipDate() {
        return orderShipDate;
    }

    public void setOrderShipDate(Date orderShipDate) {
        this.orderShipDate = orderShipDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public byte[] getOrderComplete() {
        return orderComplete;
    }

    public void setOrderComplete(byte[] orderComplete) {
        this.orderComplete = orderComplete;
    }
}