package com.dao;

import com.entity.GerenxiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerenxiaofeiVO;
import com.entity.view.GerenxiaofeiView;


/**
 * 个人消费
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface GerenxiaofeiDao extends BaseMapper<GerenxiaofeiEntity> {
	
	List<GerenxiaofeiVO> selectListVO(@Param("ew") Wrapper<GerenxiaofeiEntity> wrapper);
	
	GerenxiaofeiVO selectVO(@Param("ew") Wrapper<GerenxiaofeiEntity> wrapper);
	
	List<GerenxiaofeiView> selectListView(@Param("ew") Wrapper<GerenxiaofeiEntity> wrapper);

	List<GerenxiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<GerenxiaofeiEntity> wrapper);
	
	GerenxiaofeiView selectView(@Param("ew") Wrapper<GerenxiaofeiEntity> wrapper);
	
}
