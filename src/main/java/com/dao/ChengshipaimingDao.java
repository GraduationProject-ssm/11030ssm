package com.dao;

import com.entity.ChengshipaimingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengshipaimingVO;
import com.entity.view.ChengshipaimingView;


/**
 * 城市排名
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface ChengshipaimingDao extends BaseMapper<ChengshipaimingEntity> {
	
	List<ChengshipaimingVO> selectListVO(@Param("ew") Wrapper<ChengshipaimingEntity> wrapper);
	
	ChengshipaimingVO selectVO(@Param("ew") Wrapper<ChengshipaimingEntity> wrapper);
	
	List<ChengshipaimingView> selectListView(@Param("ew") Wrapper<ChengshipaimingEntity> wrapper);

	List<ChengshipaimingView> selectListView(Pagination page,@Param("ew") Wrapper<ChengshipaimingEntity> wrapper);
	
	ChengshipaimingView selectView(@Param("ew") Wrapper<ChengshipaimingEntity> wrapper);
	
}
