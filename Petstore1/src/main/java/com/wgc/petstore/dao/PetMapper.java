package com.wgc.petstore.dao;

import com.wgc.petstore.entity.Pet;
import java.util.List;

public interface PetMapper {
    int deleteByPrimaryKey(Integer petId);

    int insert(Pet record);

    Pet selectByPrimaryKey(Integer petId);

    List<Pet> selectAll();

    int updateByPrimaryKey(Pet record);

    int batchAdd(Pet pets);

    List<Pet> selectTagName(String name);

    Pet selectName(String name);
}