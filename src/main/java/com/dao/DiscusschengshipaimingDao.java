package com.dao;

import com.entity.DiscusschengshipaimingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschengshipaimingVO;
import com.entity.view.DiscusschengshipaimingView;


/**
 * 城市排名评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:30:47
 */
public interface DiscusschengshipaimingDao extends BaseMapper<DiscusschengshipaimingEntity> {
	
	List<DiscusschengshipaimingVO> selectListVO(@Param("ew") Wrapper<DiscusschengshipaimingEntity> wrapper);
	
	DiscusschengshipaimingVO selectVO(@Param("ew") Wrapper<DiscusschengshipaimingEntity> wrapper);
	
	List<DiscusschengshipaimingView> selectListView(@Param("ew") Wrapper<DiscusschengshipaimingEntity> wrapper);

	List<DiscusschengshipaimingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschengshipaimingEntity> wrapper);
	
	DiscusschengshipaimingView selectView(@Param("ew") Wrapper<DiscusschengshipaimingEntity> wrapper);
	
}
