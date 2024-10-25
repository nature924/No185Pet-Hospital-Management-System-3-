package com.forest.demo.Service;

import com.forest.demo.Entity.Forest_VetDoctorEntity;
import com.forest.demo.Mapper.Forest_VetDoctorMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Forest_VetDoctorService {
    @Resource
    private Forest_VetDoctorMapper forest_vetDoctorMapper;
      /** 分页查询
     * @return
       */
    public List<Forest_VetDoctorEntity> ForestVetDoctorEntitySelect(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.ForestVetDoctorEntitySelect(forest_vetDoctorEntity);
    }
    /**
     * ForestVetDoctorEntityRow
     * 总行数
     */
    public int ForestVetDoctorEntityRow(){
        return forest_vetDoctorMapper.ForestVetDoctorEntityRow();
    }
    /**
     * 搜索数据
     * @param forest_vetDoctorEntity
     * @return
     */
    public List<Forest_VetDoctorEntity> ForestVetDoctorEntitySearch(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.ForestVetDoctorEntitySearch(forest_vetDoctorEntity);
    }
    /**
     * ForestVetDoctorEntitySearchRow
     * 搜索总行数
     */
    public int ForestVetDoctorEntitySearchRow(Forest_VetDoctorEntity model){
        return forest_vetDoctorMapper.ForestVetDoctorEntitySearchRow(model);
    }
    /**
     * 兽医详情
     * @param forest_vetDoctorEntity
     * @return
     */
    public  List<Forest_VetDoctorEntity> Forest_VetDoctorEntityDetails(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.Forest_VetDoctorEntityDetails(forest_vetDoctorEntity);
    }
    public int ForestVetDoctorEntityRegister(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.ForestVetDoctorEntityRegister(forest_vetDoctorEntity);
    }

    public List<Forest_VetDoctorEntity> ForestVetDoctorEntityID(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.ForestVetDoctorEntityID(forest_vetDoctorEntity);
    }

    public int ForestVetDoctorEntityUpdate(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.ForestVetDoctorEntityUpdate(forest_vetDoctorEntity);
    }

    public int ForestVetDoctorEntityUpdateAll(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.ForestVetDoctorEntityUpdateAll(forest_vetDoctorEntity);
    }
    /**
     * 更改数据状态
     * @param forest_vetDoctorEntity
     * @return
     */
    public int ForestVetDoctorEntityState(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.ForestVetDoctorEntityState(forest_vetDoctorEntity);
    }
    /** 分页查询
     * @return
     */
    public List<Forest_VetDoctorEntity> ForestVetDoctorEntitySelect1(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.ForestVetDoctorEntitySelect1(forest_vetDoctorEntity);
    }
    /**
     * ForestVetDoctorEntityRow
     * 总行数
     */
    public int ForestVetDoctorEntityRow1(){
        return forest_vetDoctorMapper.ForestVetDoctorEntityRow1();
    }
    /**
     * 搜索数据
     * @param forest_vetDoctorEntity
     * @return
     */
    public List<Forest_VetDoctorEntity> ForestVetDoctorEntitySearch1(Forest_VetDoctorEntity forest_vetDoctorEntity){
        return forest_vetDoctorMapper.ForestVetDoctorEntitySearch1(forest_vetDoctorEntity);
    }
    /**
     * ForestVetDoctorEntitySearchRow
     * 搜索总行数
     */
    public int ForestVetDoctorEntitySearchRow1(Forest_VetDoctorEntity model){
        return forest_vetDoctorMapper.ForestVetDoctorEntitySearchRow1(model);
    }
}
