package com.forest.demo.Mapper;

import com.forest.demo.Entity.Forest_HistoryRecordEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Forest_HistoryRecordMapper {
    /**
     * 新增记录
     * @param forest_historyRecordEntity
     * @return
     */
    int ForestUserPetsEntityAdd(Forest_HistoryRecordEntity forest_historyRecordEntity);

    /**
     * 首页加载数据
     * @param forest_historyRecordEntity
     * @return
     */
    List<Forest_HistoryRecordEntity> ForestUserPetsEntitySelect(Forest_HistoryRecordEntity forest_historyRecordEntity);

    /**
     * 总行数
     * @return
     */
    int ForestUserPetsEntityRow();

    /**
     * 搜索数据
     * @param forest_historyRecordEntity
     * @return
     */
    List<Forest_HistoryRecordEntity> ForestUserPetsEntitySearch(Forest_HistoryRecordEntity forest_historyRecordEntity);
    /**
     * 搜索总行数
     * @return
     */
    int ForestUserPetsEntitySearchRow(Forest_HistoryRecordEntity forest_historyRecordEntity);

}
