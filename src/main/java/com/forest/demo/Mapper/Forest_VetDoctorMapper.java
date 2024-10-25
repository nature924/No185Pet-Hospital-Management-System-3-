package com.forest.demo.Mapper;

import com.forest.demo.Entity.Forest_VetDoctorEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Forest_VetDoctorMapper {
    /**
     * 分页查询
     * @return
     */
    List<Forest_VetDoctorEntity> ForestVetDoctorEntitySelect(Forest_VetDoctorEntity forest_vetDoctorEntity);
    /**
     * ForestVetDoctorEntityRow
     * 总行数
     */
    int ForestVetDoctorEntityRow();

    /**
     * 搜索数据
     * @param forest_vetDoctorEntity
     * @return
     */
    List<Forest_VetDoctorEntity> ForestVetDoctorEntitySearch(Forest_VetDoctorEntity forest_vetDoctorEntity);
    /**
     * ForestVetDoctorEntitySearchRow
     * 搜索总行数
     */
    int ForestVetDoctorEntitySearchRow(Forest_VetDoctorEntity model);
    /**
     * 分页查询
     * @return
     */
    List<Forest_VetDoctorEntity> ForestVetDoctorEntitySelect1(Forest_VetDoctorEntity forest_vetDoctorEntity);
    /**
     * ForestVetDoctorEntityRow
     * 总行数
     */
    int ForestVetDoctorEntityRow1();

    /**ForestVetDoctorEntityRow1
     * 搜索数据
     * @param forest_vetDoctorEntity
     * @return
     */
    List<Forest_VetDoctorEntity> ForestVetDoctorEntitySearch1(Forest_VetDoctorEntity forest_vetDoctorEntity);
    /**
     * ForestVetDoctorEntitySearchRow
     * 搜索总行数
     */
    int ForestVetDoctorEntitySearchRow1(Forest_VetDoctorEntity model);
    /**
     * 兽医详情
     * @param forest_vetDoctorEntity
     * @return
     */
    List<Forest_VetDoctorEntity> Forest_VetDoctorEntityDetails(Forest_VetDoctorEntity forest_vetDoctorEntity);
    /**
     * 兽医增加
     * @param forest_vetDoctorEntity
     * @return
     */
    int ForestVetDoctorEntityRegister(Forest_VetDoctorEntity forest_vetDoctorEntity);
    /**
     * 兽医查询编号
     * @return
     */
    List<Forest_VetDoctorEntity> ForestVetDoctorEntityID(Forest_VetDoctorEntity forest_vetDoctorEntity);
    /**
     * 新增图片
     * @param forest_vetDoctorEntity
     * @return
     */
    int ForestVetDoctorEntityUpdate(Forest_VetDoctorEntity forest_vetDoctorEntity);
    /**
     * 更改数据
     * @param forest_vetDoctorEntity
     * @return
     */
    int ForestVetDoctorEntityUpdateAll(Forest_VetDoctorEntity forest_vetDoctorEntity);
    /**
     * 更改数据状态
     * @param forest_vetDoctorEntity
     * @return
     */
    int ForestVetDoctorEntityState(Forest_VetDoctorEntity forest_vetDoctorEntity);
}
