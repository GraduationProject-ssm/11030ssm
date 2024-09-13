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


import com.dao.DiscusschengshipaimingDao;
import com.entity.DiscusschengshipaimingEntity;
import com.service.DiscusschengshipaimingService;
import com.entity.vo.DiscusschengshipaimingVO;
import com.entity.view.DiscusschengshipaimingView;

@Service("discusschengshipaimingService")
public class DiscusschengshipaimingServiceImpl extends ServiceImpl<DiscusschengshipaimingDao, DiscusschengshipaimingEntity> implements DiscusschengshipaimingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschengshipaimingEntity> page = this.selectPage(
                new Query<DiscusschengshipaimingEntity>(params).getPage(),
                new EntityWrapper<DiscusschengshipaimingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschengshipaimingEntity> wrapper) {
		  Page<DiscusschengshipaimingView> page =new Query<DiscusschengshipaimingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschengshipaimingVO> selectListVO(Wrapper<DiscusschengshipaimingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschengshipaimingVO selectVO(Wrapper<DiscusschengshipaimingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschengshipaimingView> selectListView(Wrapper<DiscusschengshipaimingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschengshipaimingView selectView(Wrapper<DiscusschengshipaimingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
