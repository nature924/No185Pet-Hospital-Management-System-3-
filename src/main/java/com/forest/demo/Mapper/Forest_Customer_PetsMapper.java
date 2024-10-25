package com.forest.demo.Mapper;

import com.forest.demo.Entity.Forest_Customer_PetsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Forest_Customer_PetsMapper {
    /**
     * 新增记录
     * @param forest_customer_petsEntity
     * @return
     */
    int ForestCustomerPetsEntityAdd(Forest_Customer_PetsEntity forest_customer_petsEntity);

    /**
     * 首页加载数据
     * @param forest_customer_petsEntity
     * @return
     */
    List<Forest_Customer_PetsEntity> ForestCustomerPetsEntitySelect(Forest_Customer_PetsEntity forest_customer_petsEntity);

    /**
     * 总行数
     * @return
     */
    int ForestCustomerPetsEntityRow();

    /**
     * 搜索数据
     * @param forest_customer_petsEntity
     * @return
     */
    List<Forest_Customer_PetsEntity> ForestCustomerPetsEntitySearch(Forest_Customer_PetsEntity forest_customer_petsEntity);
    /**
     * 搜索总行数
     * @return
     */
    int ForestCustomerPetsEntitySearchRow(Forest_Customer_PetsEntity forest_customer_petsEntity);

    /**
     * 客户详情
     * @param forest_customer_petsEntity
     * @return
     */
    List<Forest_Customer_PetsEntity> ForestCustomerPetsEntitySearchCustomerAll(Forest_Customer_PetsEntity forest_customer_petsEntity);
    /**
     * 宠物详情
     * @param forest_customer_petsEntity
     * @return
     */
    List<Forest_Customer_PetsEntity> ForestCustomerPetsEntitySearchPetsAll(Forest_Customer_PetsEntity forest_customer_petsEntity);

}
