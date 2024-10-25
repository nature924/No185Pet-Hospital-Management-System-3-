package com.forest.demo.Mapper;

import com.forest.demo.Entity.Forest_userEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Forest_userMapper {
    /**
     *     登录
     */
    List<Forest_userEntity> ForestUserEntityLogin(Forest_userEntity forest_userEntity);
    /**
     *用户名是否存在
     */
    List<Forest_userEntity> ForestUserEntityIfExitLogin(Forest_userEntity forest_userEntity);
    /**
     *身份证是否存在
     */
    List<Forest_userEntity> ForestUserEntityIfExitCard(Forest_userEntity forest_userEntity);
    /**
     * 注册
     */
    int ForestUserEntityRegister(Forest_userEntity forest_userEntity);


    /**
     * 分页查询
     * @return
     */
    List<Forest_userEntity> ForestUserEntitySelect(Forest_userEntity forest_vetDoctorEntity);
    /**
     * ForestVetDoctorEntityRow
     * 总行数
     */
    int ForestUserEntityRow();

    /**
     * 搜索数据
     * @param forest_vetDoctorEntity
     * @return
     */
    List<Forest_userEntity> ForestUserEntitySearch(Forest_userEntity forest_vetDoctorEntity);
    /**
     * ForestVetDoctorEntitySearchRow
     * 搜索总行数
     */
    int ForestUserEntitySearchRow(Forest_userEntity model);

    /**
     * 更改数据状态
     * @param model
     * @return
     */
    int ForestUserEntityState(Forest_userEntity model);
}
