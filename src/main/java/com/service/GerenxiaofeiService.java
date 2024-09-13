package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GerenxiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GerenxiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenxiaofeiView;


/**
 * 个人消费
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface GerenxiaofeiService extends IService<GerenxiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GerenxiaofeiVO> selectListVO(Wrapper<GerenxiaofeiEntity> wrapper);
   	
   	GerenxiaofeiVO selectVO(@Param("ew") Wrapper<GerenxiaofeiEntity> wrapper);
   	
   	List<GerenxiaofeiView> selectListView(Wrapper<GerenxiaofeiEntity> wrapper);
   	
   	GerenxiaofeiView selectView(@Param("ew") Wrapper<GerenxiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GerenxiaofeiEntity> wrapper);
   	
}

