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


import com.dao.DiscussxiaofeishuipingDao;
import com.entity.DiscussxiaofeishuipingEntity;
import com.service.DiscussxiaofeishuipingService;
import com.entity.vo.DiscussxiaofeishuipingVO;
import com.entity.view.DiscussxiaofeishuipingView;

@Service("discussxiaofeishuipingService")
public class DiscussxiaofeishuipingServiceImpl extends ServiceImpl<DiscussxiaofeishuipingDao, DiscussxiaofeishuipingEntity> implements DiscussxiaofeishuipingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiaofeishuipingEntity> page = this.selectPage(
                new Query<DiscussxiaofeishuipingEntity>(params).getPage(),
                new EntityWrapper<DiscussxiaofeishuipingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiaofeishuipingEntity> wrapper) {
		  Page<DiscussxiaofeishuipingView> page =new Query<DiscussxiaofeishuipingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxiaofeishuipingVO> selectListVO(Wrapper<DiscussxiaofeishuipingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxiaofeishuipingVO selectVO(Wrapper<DiscussxiaofeishuipingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxiaofeishuipingView> selectListView(Wrapper<DiscussxiaofeishuipingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiaofeishuipingView selectView(Wrapper<DiscussxiaofeishuipingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
