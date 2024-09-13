package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschengshipaimingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschengshipaimingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschengshipaimingView;


/**
 * 城市排名评论表
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:30:47
 */
public interface DiscusschengshipaimingService extends IService<DiscusschengshipaimingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschengshipaimingVO> selectListVO(Wrapper<DiscusschengshipaimingEntity> wrapper);
   	
   	DiscusschengshipaimingVO selectVO(@Param("ew") Wrapper<DiscusschengshipaimingEntity> wrapper);
   	
   	List<DiscusschengshipaimingView> selectListView(Wrapper<DiscusschengshipaimingEntity> wrapper);
   	
   	DiscusschengshipaimingView selectView(@Param("ew") Wrapper<DiscusschengshipaimingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschengshipaimingEntity> wrapper);
   	
}

