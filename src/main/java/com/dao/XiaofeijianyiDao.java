package com.dao;

import com.entity.XiaofeijianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofeijianyiVO;
import com.entity.view.XiaofeijianyiView;


/**
 * 消费建议
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public interface XiaofeijianyiDao extends BaseMapper<XiaofeijianyiEntity> {
	
	List<XiaofeijianyiVO> selectListVO(@Param("ew") Wrapper<XiaofeijianyiEntity> wrapper);
	
	XiaofeijianyiVO selectVO(@Param("ew") Wrapper<XiaofeijianyiEntity> wrapper);
	
	List<XiaofeijianyiView> selectListView(@Param("ew") Wrapper<XiaofeijianyiEntity> wrapper);

	List<XiaofeijianyiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofeijianyiEntity> wrapper);
	
	XiaofeijianyiView selectView(@Param("ew") Wrapper<XiaofeijianyiEntity> wrapper);
	
}
