package com.wgc.petstore.entity;

import org.apache.ibatis.type.Alias;

import java.util.List;

/*标签类*/
@Alias("tag")
public class Tag {
    private Integer tagId;

    private String tagName;

    //宠物信息
    private List<Pet> pet;

    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }
}