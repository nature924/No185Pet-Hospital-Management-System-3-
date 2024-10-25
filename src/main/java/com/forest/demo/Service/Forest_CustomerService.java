package com.forest.demo.Service;

import com.forest.demo.Entity.Forest_CustomerEntity;
import com.forest.demo.Mapper.Forest_CustomerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Forest_CustomerService {
    @Resource
            private Forest_CustomerMapper forest_customerMapper;
    /**
     * 分页查询
     * @return
     */
    public List<Forest_CustomerEntity> ForestCustomerEntitySelect(Forest_CustomerEntity forest_customerEntity){
        return forest_customerMapper.ForestCustomerEntitySelect(forest_customerEntity);
    }
    /**
     * ForestCustomerEntityRow
     * 总行数
     */
    public int ForestCustomerEntityRow(){
        return forest_customerMapper.ForestCustomerEntityRow();
    }

    /**
     * 搜索数据
     * @return
     */
    public List<Forest_CustomerEntity> ForestCustomerEntitySearch(Forest_CustomerEntity forest_customerEntity){
        return forest_customerMapper.ForestCustomerEntitySearch(forest_customerEntity);
    }
    /**
     * ForestCustomerEntitySearchRow
     * 搜索总行数
     */
    public int ForestCustomerEntitySearchRow(Forest_CustomerEntity forest_customerEntity){
        return forest_customerMapper.ForestCustomerEntitySearchRow(forest_customerEntity);
    }
    /**
     * 客户详情
     * @return
     */
    public List<Forest_CustomerEntity> ForestCustomerEntityDetails(Forest_CustomerEntity forest_customerEntity){
        return forest_customerMapper.ForestCustomerEntityDetails(forest_customerEntity);
    }
    /**
     * 新增客户数据
     * @param forest_customerEntity
     * @return
     */
    public int ForestCustomerEntityRegister(Forest_CustomerEntity forest_customerEntity){
        return forest_customerMapper.ForestCustomerEntityRegister(forest_customerEntity);
    }
    /**
     *编号详情
     * @return
     */
    public List<Forest_CustomerEntity> ForestCustomerEntityID(Forest_CustomerEntity forest_customerEntity){
        return forest_customerMapper.ForestCustomerEntityID(forest_customerEntity);
    }
    /**
     * 更改数据
     * @param forest_customerEntity
     * @return
     */
    public int ForestCustomerEntityUpdate(Forest_CustomerEntity forest_customerEntity){
        return forest_customerMapper.ForestCustomerEntityUpdate(forest_customerEntity);
    }
}
