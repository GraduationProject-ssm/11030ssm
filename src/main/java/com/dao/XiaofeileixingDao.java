package com.dao;

import com.entity.XiaofeileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofeileixingVO;
import com.entity.view.XiaofeileixingView;


/**
 * 消费类型
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface XiaofeileixingDao extends BaseMapper<XiaofeileixingEntity> {
	
	List<XiaofeileixingVO> selectListVO(@Param("ew") Wrapper<XiaofeileixingEntity> wrapper);
	
	XiaofeileixingVO selectVO(@Param("ew") Wrapper<XiaofeileixingEntity> wrapper);
	
	List<XiaofeileixingView> selectListView(@Param("ew") Wrapper<XiaofeileixingEntity> wrapper);

	List<XiaofeileixingView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofeileixingEntity> wrapper);
	
	XiaofeileixingView selectView(@Param("ew") Wrapper<XiaofeileixingEntity> wrapper);
	
}
