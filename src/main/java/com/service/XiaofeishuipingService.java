package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofeishuipingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofeishuipingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofeishuipingView;


/**
 * 消费水平
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface XiaofeishuipingService extends IService<XiaofeishuipingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofeishuipingVO> selectListVO(Wrapper<XiaofeishuipingEntity> wrapper);
   	
   	XiaofeishuipingVO selectVO(@Param("ew") Wrapper<XiaofeishuipingEntity> wrapper);
   	
   	List<XiaofeishuipingView> selectListView(Wrapper<XiaofeishuipingEntity> wrapper);
   	
   	XiaofeishuipingView selectView(@Param("ew") Wrapper<XiaofeishuipingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofeishuipingEntity> wrapper);
   	
}

