package com.forest.demo.Mapper;

import com.forest.demo.Entity.Forest_CustomerEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Forest_CustomerMapper {
    /**
     * 分页查询
     * @return
     */
    List<Forest_CustomerEntity> ForestCustomerEntitySelect(Forest_CustomerEntity forest_customerEntity);
    /**
     * ForestCustomerEntityRow
     * 总行数
     */
    int ForestCustomerEntityRow();

    /**
     * 搜索数据
     * @return
     */
    List<Forest_CustomerEntity> ForestCustomerEntitySearch(Forest_CustomerEntity forest_customerEntity);
    /**
     * ForestCustomerEntitySearchRow
     * 搜索总行数
     */
    int ForestCustomerEntitySearchRow(Forest_CustomerEntity model);
    /**
     *客户详情
     * @return
     */
    List<Forest_CustomerEntity> ForestCustomerEntityDetails(Forest_CustomerEntity forest_customerEntity);

    /**
     * 新增客户数据
     * @param forest_customerEntity
     * @return
     */
    int ForestCustomerEntityRegister(Forest_CustomerEntity forest_customerEntity);
    /**
     *编号详情
     * @return
     */
    List<Forest_CustomerEntity> ForestCustomerEntityID(Forest_CustomerEntity forest_customerEntity);

    /**
     * 更改数据
     * @param forest_customerEntity
     * @return
     */
    int ForestCustomerEntityUpdate(Forest_CustomerEntity forest_customerEntity);
}
