package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChengshipaimingDao;
import com.entity.ChengshipaimingEntity;
import com.service.ChengshipaimingService;
import com.entity.vo.ChengshipaimingVO;
import com.entity.view.ChengshipaimingView;

@Service("chengshipaimingService")
public class ChengshipaimingServiceImpl extends ServiceImpl<ChengshipaimingDao, ChengshipaimingEntity> implements ChengshipaimingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengshipaimingEntity> page = this.selectPage(
                new Query<ChengshipaimingEntity>(params).getPage(),
                new EntityWrapper<ChengshipaimingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengshipaimingEntity> wrapper) {
		  Page<ChengshipaimingView> page =new Query<ChengshipaimingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengshipaimingVO> selectListVO(Wrapper<ChengshipaimingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengshipaimingVO selectVO(Wrapper<ChengshipaimingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengshipaimingView> selectListView(Wrapper<ChengshipaimingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengshipaimingView selectView(Wrapper<ChengshipaimingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
