package com.wgc.petstore.entity;

import org.apache.ibatis.type.Alias;

import java.util.List;
/*宠物类*/
@Alias("pet")
public class Pet {
    private Integer petId;

    //private Integer categoryId;

    private String petName;

    private Integer tasId;

    //@Enumerated(EnumType.STRING)
    private String petStatus;

    //标签信息
    private List<Tag> tag;

    //类型信息
    private Category category;

    //订单信息
    private List<Order> order;

    //库存信息
    private Inventory inventory;

    //图片
    private List<Photo> photo;

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    public Integer getTasId() {
        return tasId;
    }

    public void setTasId(Integer tasId) {
        this.tasId = tasId;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }


    public String getPetStatus() {
        return petStatus;
    }

    public void setPetStatus(String petStatus) {
        this.petStatus = petStatus == null ? null : petStatus.trim();
    }
}