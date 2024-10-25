package com.forest.demo.Mapper;

import com.forest.demo.Entity.Forest_PetsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Forest_PetsMapper {
    /**
     * 分页查询
     * @return
     */
    List<Forest_PetsEntity> ForestPetsEntitySelect(Forest_PetsEntity forest_PetsEntity);
    /**
     * ForestPetsEntityRow
     * 总行数
     */
    int ForestPetsEntityRow();

    /**
     * 搜索数据
     * @return
     */
    List<Forest_PetsEntity> ForestPetsEntitySearch(Forest_PetsEntity forest_PetsEntity);
    /**
     * ForestPetsEntitySearchRow
     * 搜索总行数
     */
    int ForestPetsEntitySearchRow(Forest_PetsEntity model);
    /**
     *客户详情
     * @return
     */
    List<Forest_PetsEntity> ForestPetsEntityDetails(Forest_PetsEntity forest_PetsEntity);

    /**
     * 新增数据
     * @param forest_PetsEntity
     * @return
     */
    int ForestPetsEntityRegister(Forest_PetsEntity forest_PetsEntity);
    /**
     *编号详情
     * @return
     */
    List<Forest_PetsEntity> ForestPetsEntityID(Forest_PetsEntity forest_PetsEntity);

    /**
     * 上传图片
     * @param forest_PetsEntity
     * @return
     */
    int ForestPetsEntityUpdate(Forest_PetsEntity forest_PetsEntity);
    /**
     * 更改数据
     * @param forest_PetsEntity
     * @return
     */
    int ForestPetsEntityUpdateAll(Forest_PetsEntity forest_PetsEntity);
}
