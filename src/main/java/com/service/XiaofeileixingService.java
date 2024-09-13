package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofeileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofeileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofeileixingView;


/**
 * 消费类型
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface XiaofeileixingService extends IService<XiaofeileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofeileixingVO> selectListVO(Wrapper<XiaofeileixingEntity> wrapper);
   	
   	XiaofeileixingVO selectVO(@Param("ew") Wrapper<XiaofeileixingEntity> wrapper);
   	
   	List<XiaofeileixingView> selectListView(Wrapper<XiaofeileixingEntity> wrapper);
   	
   	XiaofeileixingView selectView(@Param("ew") Wrapper<XiaofeileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofeileixingEntity> wrapper);
   	
}

