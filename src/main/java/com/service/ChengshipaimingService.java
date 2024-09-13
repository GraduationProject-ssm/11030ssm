package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengshipaimingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengshipaimingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengshipaimingView;


/**
 * 城市排名
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface ChengshipaimingService extends IService<ChengshipaimingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengshipaimingVO> selectListVO(Wrapper<ChengshipaimingEntity> wrapper);
   	
   	ChengshipaimingVO selectVO(@Param("ew") Wrapper<ChengshipaimingEntity> wrapper);
   	
   	List<ChengshipaimingView> selectListView(Wrapper<ChengshipaimingEntity> wrapper);
   	
   	ChengshipaimingView selectView(@Param("ew") Wrapper<ChengshipaimingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengshipaimingEntity> wrapper);
   	
}

