package com.wgc.petstore.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/*库存类*/
public class Inventory {
    private Integer inventoryId;

    //private Integer petId;

    private Integer inventoryQuantity;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date inventoryDepositDate;

    private BigDecimal inventoryPrice;

    //宠物类
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }


    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public Date getInventoryDepositDate() {
        return inventoryDepositDate;
    }

    public void setInventoryDepositDate(Date inventoryDepositDate) {
        this.inventoryDepositDate = inventoryDepositDate;
    }

    public BigDecimal getInventoryPrice() {
        return inventoryPrice;
    }

    public void setInventoryPrice(BigDecimal inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }
}