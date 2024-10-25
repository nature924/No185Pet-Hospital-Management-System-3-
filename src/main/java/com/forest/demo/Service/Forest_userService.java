package com.forest.demo.Service;

import com.forest.demo.Entity.Forest_userEntity;
import com.forest.demo.Mapper.Forest_userMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Forest_userService {
    @Resource
    private Forest_userMapper forest_userMapper;
    /**
     *     登录
     */
    public List<Forest_userEntity> ForestUserEntityLogin(Forest_userEntity forest_userEntity){
        return forest_userMapper.ForestUserEntityLogin(forest_userEntity);
    }
    /**
     *用户名是否存在
     */
    public List<Forest_userEntity> ForestUserEntityIfExitLogin(Forest_userEntity forest_userEntity){
        return forest_userMapper.ForestUserEntityIfExitLogin(forest_userEntity);
    }
    /**
     *身份证是否存在
     */
    public List<Forest_userEntity> ForestUserEntityIfExitCard(Forest_userEntity forest_userEntity){
        return forest_userMapper.ForestUserEntityIfExitCard(forest_userEntity);
    }
    /**
     * 注册
     */
    public int ForestUserEntityRegister(Forest_userEntity forest_userEntity){
        return  forest_userMapper.ForestUserEntityRegister(forest_userEntity);
    }
    /**
     * 分页查询
     * @return
     */
    public List<Forest_userEntity> ForestUserEntitySelect(Forest_userEntity forest_userEntity){
        return  forest_userMapper.ForestUserEntitySelect(forest_userEntity);
    }
    /**
     * ForestVetDoctorEntityRow
     * 总行数
     */
    public int ForestUserEntityRow(){
        return  forest_userMapper.ForestUserEntityRow();
    }


    /**
     * 搜索数据
     * @param forest_userEntity
     * @return
     */
    public List<Forest_userEntity> ForestUserEntitySearch(Forest_userEntity forest_userEntity){
        return  forest_userMapper.ForestUserEntitySearch(forest_userEntity);
    }
    /**
     * ForestVetDoctorEntitySearchRow
     * 搜索总行数
     */
    public int ForestUserEntitySearchRow(Forest_userEntity forest_userEntity){
        return  forest_userMapper.ForestUserEntitySearchRow(forest_userEntity);
    }
    /**
     * 更改数据状态
     * @param model
     * @return
     */
    public int ForestUserEntityState(Forest_userEntity model){
        return  forest_userMapper.ForestUserEntityState(model);
    }
}
