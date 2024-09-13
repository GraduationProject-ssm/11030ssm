package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxiaofeishuipingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxiaofeishuipingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxiaofeishuipingView;


/**
 * 消费水平评论表
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:30:47
 */
public interface DiscussxiaofeishuipingService extends IService<DiscussxiaofeishuipingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxiaofeishuipingVO> selectListVO(Wrapper<DiscussxiaofeishuipingEntity> wrapper);
   	
   	DiscussxiaofeishuipingVO selectVO(@Param("ew") Wrapper<DiscussxiaofeishuipingEntity> wrapper);
   	
   	List<DiscussxiaofeishuipingView> selectListView(Wrapper<DiscussxiaofeishuipingEntity> wrapper);
   	
   	DiscussxiaofeishuipingView selectView(@Param("ew") Wrapper<DiscussxiaofeishuipingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxiaofeishuipingEntity> wrapper);
   	
}

