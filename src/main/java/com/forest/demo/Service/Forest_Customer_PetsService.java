package com.forest.demo.Service;

import com.forest.demo.Entity.Forest_Customer_PetsEntity;
import com.forest.demo.Mapper.Forest_Customer_PetsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Forest_Customer_PetsService {
    @Resource
    private Forest_Customer_PetsMapper forest_customer_petsMapper;
    /**
     * 新增记录
     * @param forest_customer_petsEntity
     * @return
     */
    public int ForestCustomerPetsEntityAdd(Forest_Customer_PetsEntity forest_customer_petsEntity){
        return forest_customer_petsMapper.ForestCustomerPetsEntityAdd(forest_customer_petsEntity);
    }

    /**
     * 首页加载数据
     * @param forest_customer_petsEntity
     * @return
     */
    public List<Forest_Customer_PetsEntity> ForestCustomerPetsEntitySelect(Forest_Customer_PetsEntity forest_customer_petsEntity){
        return forest_customer_petsMapper.ForestCustomerPetsEntitySelect(forest_customer_petsEntity);
    }

    /**
     * 总行数
     * @return
     */
    public int ForestCustomerPetsEntityRow(){
        return forest_customer_petsMapper.ForestCustomerPetsEntityRow();
    }

    /**
     * 搜索数据
     * @param forest_customer_petsEntity
     * @return
     */
    public  List<Forest_Customer_PetsEntity> ForestCustomerPetsEntitySearch(Forest_Customer_PetsEntity forest_customer_petsEntity){
        return forest_customer_petsMapper.ForestCustomerPetsEntitySearch(forest_customer_petsEntity);
    }
    /**
     * 搜索总行数
     * @return
     */
    public int ForestCustomerPetsEntitySearchRow(Forest_Customer_PetsEntity forest_customer_petsEntity){
        return forest_customer_petsMapper.ForestCustomerPetsEntitySearchRow(forest_customer_petsEntity);
    }
    /**
     * 客户详情
     * @param forest_customer_petsEntity
     * @return
     */
    public List<Forest_Customer_PetsEntity> ForestCustomerPetsEntitySearchCustomerAll(Forest_Customer_PetsEntity forest_customer_petsEntity){
        return forest_customer_petsMapper.ForestCustomerPetsEntitySearchCustomerAll(forest_customer_petsEntity);
    }
    /**
     * 宠物详情
     * @param forest_customer_petsEntity
     * @return
     */
    public List<Forest_Customer_PetsEntity> ForestCustomerPetsEntitySearchPetsAll(Forest_Customer_PetsEntity forest_customer_petsEntity){
        return forest_customer_petsMapper.ForestCustomerPetsEntitySearchPetsAll(forest_customer_petsEntity);
    }
}
