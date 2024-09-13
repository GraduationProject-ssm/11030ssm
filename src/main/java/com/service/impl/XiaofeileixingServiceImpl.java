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


import com.dao.XiaofeileixingDao;
import com.entity.XiaofeileixingEntity;
import com.service.XiaofeileixingService;
import com.entity.vo.XiaofeileixingVO;
import com.entity.view.XiaofeileixingView;

@Service("xiaofeileixingService")
public class XiaofeileixingServiceImpl extends ServiceImpl<XiaofeileixingDao, XiaofeileixingEntity> implements XiaofeileixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofeileixingEntity> page = this.selectPage(
                new Query<XiaofeileixingEntity>(params).getPage(),
                new EntityWrapper<XiaofeileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofeileixingEntity> wrapper) {
		  Page<XiaofeileixingView> page =new Query<XiaofeileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofeileixingVO> selectListVO(Wrapper<XiaofeileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofeileixingVO selectVO(Wrapper<XiaofeileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofeileixingView> selectListView(Wrapper<XiaofeileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofeileixingView selectView(Wrapper<XiaofeileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
