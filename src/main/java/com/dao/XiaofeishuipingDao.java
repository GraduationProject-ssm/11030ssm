package com.dao;

import com.entity.XiaofeishuipingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofeishuipingVO;
import com.entity.view.XiaofeishuipingView;


/**
 * 消费水平
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface XiaofeishuipingDao extends BaseMapper<XiaofeishuipingEntity> {
	
	List<XiaofeishuipingVO> selectListVO(@Param("ew") Wrapper<XiaofeishuipingEntity> wrapper);
	
	XiaofeishuipingVO selectVO(@Param("ew") Wrapper<XiaofeishuipingEntity> wrapper);
	
	List<XiaofeishuipingView> selectListView(@Param("ew") Wrapper<XiaofeishuipingEntity> wrapper);

	List<XiaofeishuipingView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofeishuipingEntity> wrapper);
	
	XiaofeishuipingView selectView(@Param("ew") Wrapper<XiaofeishuipingEntity> wrapper);
	
}
