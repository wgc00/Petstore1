package com.wgc.petstore.dao;

import com.wgc.petstore.entity.Photo;
import java.util.List;

public interface PhotoMapper {
    int deleteByPrimaryKey(Integer photoId);

    int insert(Photo record);

    Photo selectByPrimaryKey(Integer photoId);

    List<Photo> selectAll();

    int updateByPrimaryKey(Photo record);
}