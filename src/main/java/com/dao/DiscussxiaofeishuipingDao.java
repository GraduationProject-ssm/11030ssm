package com.dao;

import com.entity.DiscussxiaofeishuipingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxiaofeishuipingVO;
import com.entity.view.DiscussxiaofeishuipingView;


/**
 * 消费水平评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:30:47
 */
public interface DiscussxiaofeishuipingDao extends BaseMapper<DiscussxiaofeishuipingEntity> {
	
	List<DiscussxiaofeishuipingVO> selectListVO(@Param("ew") Wrapper<DiscussxiaofeishuipingEntity> wrapper);
	
	DiscussxiaofeishuipingVO selectVO(@Param("ew") Wrapper<DiscussxiaofeishuipingEntity> wrapper);
	
	List<DiscussxiaofeishuipingView> selectListView(@Param("ew") Wrapper<DiscussxiaofeishuipingEntity> wrapper);

	List<DiscussxiaofeishuipingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxiaofeishuipingEntity> wrapper);
	
	DiscussxiaofeishuipingView selectView(@Param("ew") Wrapper<DiscussxiaofeishuipingEntity> wrapper);
	
}
