package com.forest.demo.Mapper;

import com.forest.demo.Entity.Forest_DiagnosisEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Forest_DiagnosisMapper {
    /**
     * 分页查询
     * @return
     */
    List<Forest_DiagnosisEntity> ForestDiagnosisEntitySelect(Forest_DiagnosisEntity forestDiagnosisEntity);
    /**
     * ForestCustomerEntityRow
     * 总行数
     */
    int ForestDiagnosisEntityRow();

    /**
     * 搜索数据
     * @return
     */
    List<Forest_DiagnosisEntity> ForestDiagnosisEntitySearch(Forest_DiagnosisEntity forestDiagnosisEntity);
    /**
     * ForestCustomerEntitySearchRow
     * 搜索总行数
     */
    int ForestDiagnosisEntitySearchRow(Forest_DiagnosisEntity model);
    /**
     *客户详情
     * @return
     */
    List<Forest_DiagnosisEntity> ForestDiagnosisEntityDetails(Forest_DiagnosisEntity forestDiagnosisEntity);

    /**
     * 新增客户数据
     * @param forestDiagnosisEntity
     * @return
     */
    int ForestDiagnosisEntityRegister(Forest_DiagnosisEntity forestDiagnosisEntity);
    /**
     *编号详情
     * @return
     */
    List<Forest_DiagnosisEntity> ForestDiagnosisEntityID(Forest_DiagnosisEntity forestDiagnosisEntity);

    /**
     * 更改数据
     * @param forestDiagnosisEntity
     * @return
     */
    int ForestDiagnosisEntityUpdate(Forest_DiagnosisEntity forestDiagnosisEntity);
}
