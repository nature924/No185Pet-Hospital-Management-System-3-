package com.forest.demo.Service;

import com.forest.demo.Entity.Forest_PetsEntity;
import com.forest.demo.Mapper.Forest_PetsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Forest_PetsService {
    @Resource
    private Forest_PetsMapper forest_petsMapper;
    /**
     * 分页查询
     * @return
     */
    public  List<Forest_PetsEntity> ForestPetsEntitySelect(Forest_PetsEntity forest_PetsEntity){
        return forest_petsMapper.ForestPetsEntitySelect(forest_PetsEntity);
    }
    /**
     * ForestPetsEntityRow
     * 总行数
     */
    public int ForestPetsEntityRow(){
        return forest_petsMapper.ForestPetsEntityRow();
    }

    /**
     * 搜索数据
     * @return
     */
    public List<Forest_PetsEntity> ForestPetsEntitySearch(Forest_PetsEntity forest_PetsEntity){
        return forest_petsMapper.ForestPetsEntitySearch(forest_PetsEntity);
    }
    /**
     * ForestPetsEntitySearchRow
     * 搜索总行数
     */
    public int ForestPetsEntitySearchRow(Forest_PetsEntity model){
        return forest_petsMapper.ForestPetsEntitySearchRow(model);
    }
    /**
     *客户详情
     * @return
     */
    public List<Forest_PetsEntity> ForestPetsEntityDetails(Forest_PetsEntity forest_PetsEntity){
        return forest_petsMapper.ForestPetsEntityDetails(forest_PetsEntity);
    }

    /**
     * 新增数据
     * @param forest_PetsEntity
     * @return
     */
    public int ForestPetsEntityRegister(Forest_PetsEntity forest_PetsEntity){
        return forest_petsMapper.ForestPetsEntityRegister(forest_PetsEntity);
    }
    /**
     *编号详情
     * @return
     */
    public List<Forest_PetsEntity> ForestPetsEntityID(Forest_PetsEntity forest_PetsEntity){
        return  forest_petsMapper.ForestPetsEntityID(forest_PetsEntity);
    }

    /**
     * 上传图片
     * @param forest_PetsEntity
     * @return
     */
    public int ForestPetsEntityUpdate(Forest_PetsEntity forest_PetsEntity){
        return forest_petsMapper.ForestPetsEntityUpdate(forest_PetsEntity);
    }
    /**
     * 更改数据
     * @param forest_PetsEntity
     * @return
     */
    public int ForestPetsEntityUpdateAll(Forest_PetsEntity forest_PetsEntity) {
        return forest_petsMapper.ForestPetsEntityUpdateAll(forest_PetsEntity);
    }
}
