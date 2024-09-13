package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofeijianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofeijianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofeijianyiView;


/**
 * 消费建议
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface XiaofeijianyiService extends IService<XiaofeijianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofeijianyiVO> selectListVO(Wrapper<XiaofeijianyiEntity> wrapper);
   	
   	XiaofeijianyiVO selectVO(@Param("ew") Wrapper<XiaofeijianyiEntity> wrapper);
   	
   	List<XiaofeijianyiView> selectListView(Wrapper<XiaofeijianyiEntity> wrapper);
   	
   	XiaofeijianyiView selectView(@Param("ew") Wrapper<XiaofeijianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofeijianyiEntity> wrapper);
   	
}

