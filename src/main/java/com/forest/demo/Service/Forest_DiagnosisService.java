package com.forest.demo.Service;

import com.forest.demo.Entity.Forest_DiagnosisEntity;
import com.forest.demo.Mapper.Forest_DiagnosisMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Forest_DiagnosisService {
    @Resource
    private Forest_DiagnosisMapper forest_diagnosisMapper;
    /**
     * 分页查询
     * @return
     */
   public List<Forest_DiagnosisEntity> ForestDiagnosisEntitySelect(Forest_DiagnosisEntity forestDiagnosisEntity){
       return forest_diagnosisMapper.ForestDiagnosisEntitySelect(forestDiagnosisEntity);
   }
    /**
     * ForestCustomerEntityRow
     * 总行数
     */
    public int ForestDiagnosisEntityRow(){
        return forest_diagnosisMapper.ForestDiagnosisEntityRow();
    }

    /**
     * 搜索数据
     * @return
     */
    public List<Forest_DiagnosisEntity> ForestDiagnosisEntitySearch(Forest_DiagnosisEntity forestDiagnosisEntity){
        return forest_diagnosisMapper.ForestDiagnosisEntitySearch(forestDiagnosisEntity);
    }
    /**
     * ForestCustomerEntitySearchRow
     * 搜索总行数
     */
    public int ForestDiagnosisEntitySearchRow(Forest_DiagnosisEntity forestDiagnosisEntity){
        return forest_diagnosisMapper.ForestDiagnosisEntitySearchRow(forestDiagnosisEntity);
    }
    /**
     *客户详情
     * @return
     */
    public List<Forest_DiagnosisEntity> ForestDiagnosisEntityDetails(Forest_DiagnosisEntity forestDiagnosisEntity){
        return forest_diagnosisMapper.ForestDiagnosisEntityDetails(forestDiagnosisEntity);
    }

    /**
     * 新增客户数据
     * @param forestDiagnosisEntity
     * @return
     */
    public int ForestDiagnosisEntityRegister(Forest_DiagnosisEntity forestDiagnosisEntity){
        return forest_diagnosisMapper.ForestDiagnosisEntityRegister(forestDiagnosisEntity);
    }
    /**
     *编号详情
     * @return
     */
    public List<Forest_DiagnosisEntity> ForestDiagnosisEntityID(Forest_DiagnosisEntity forestDiagnosisEntity){
        return forest_diagnosisMapper.ForestDiagnosisEntityID(forestDiagnosisEntity);
    }

    /**
     * 更改数据
     * @param forestDiagnosisEntity
     * @return
     */
    public int ForestDiagnosisEntityUpdate(Forest_DiagnosisEntity forestDiagnosisEntity){
        return forest_diagnosisMapper.ForestDiagnosisEntityUpdate(forestDiagnosisEntity);
    }
}
