package com.forest.demo.Service;

import com.forest.demo.Entity.Forest_HistoryRecordEntity;
import com.forest.demo.Mapper.Forest_HistoryRecordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Forest_HistoryRecordService {
    @Resource
    private Forest_HistoryRecordMapper forest_historyRecordMapper;
    /**
     * 新增记录
     * @param forest_historyRecordEntity
     * @return
     */
    public int ForestUserPetsEntityAdd(Forest_HistoryRecordEntity forest_historyRecordEntity){
        return forest_historyRecordMapper.ForestUserPetsEntityAdd(forest_historyRecordEntity);
    }

    /**
     * 首页加载数据
     * @param forest_historyRecordEntity
     * @return
     */
    public List<Forest_HistoryRecordEntity> ForestUserPetsEntitySelect(Forest_HistoryRecordEntity forest_historyRecordEntity){
        return forest_historyRecordMapper.ForestUserPetsEntitySelect(forest_historyRecordEntity);
    }

    /**
     * 总行数
     * @return
     */
    public int ForestUserPetsEntityRow(){
        return forest_historyRecordMapper.ForestUserPetsEntityRow();
    }

    /**
     * 搜索数据
     * @param forest_historyRecordEntity
     * @return
     */
    public  List<Forest_HistoryRecordEntity> ForestUserPetsEntitySearch(Forest_HistoryRecordEntity forest_historyRecordEntity){
        return forest_historyRecordMapper.ForestUserPetsEntitySearch(forest_historyRecordEntity);
    }
    /**
     * 搜索总行数
     * @return
     */
    public int ForestUserPetsEntitySearchRow(Forest_HistoryRecordEntity forest_historyRecordEntity){
        return forest_historyRecordMapper.ForestUserPetsEntitySearchRow(forest_historyRecordEntity);
    }

}
