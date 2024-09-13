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


import com.dao.XiaofeishuipingDao;
import com.entity.XiaofeishuipingEntity;
import com.service.XiaofeishuipingService;
import com.entity.vo.XiaofeishuipingVO;
import com.entity.view.XiaofeishuipingView;

@Service("xiaofeishuipingService")
public class XiaofeishuipingServiceImpl extends ServiceImpl<XiaofeishuipingDao, XiaofeishuipingEntity> implements XiaofeishuipingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofeishuipingEntity> page = this.selectPage(
                new Query<XiaofeishuipingEntity>(params).getPage(),
                new EntityWrapper<XiaofeishuipingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofeishuipingEntity> wrapper) {
		  Page<XiaofeishuipingView> page =new Query<XiaofeishuipingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofeishuipingVO> selectListVO(Wrapper<XiaofeishuipingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofeishuipingVO selectVO(Wrapper<XiaofeishuipingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofeishuipingView> selectListView(Wrapper<XiaofeishuipingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofeishuipingView selectView(Wrapper<XiaofeishuipingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
