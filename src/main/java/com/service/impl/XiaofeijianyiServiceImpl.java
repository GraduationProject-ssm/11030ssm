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


import com.dao.XiaofeijianyiDao;
import com.entity.XiaofeijianyiEntity;
import com.service.XiaofeijianyiService;
import com.entity.vo.XiaofeijianyiVO;
import com.entity.view.XiaofeijianyiView;

@Service("xiaofeijianyiService")
public class XiaofeijianyiServiceImpl extends ServiceImpl<XiaofeijianyiDao, XiaofeijianyiEntity> implements XiaofeijianyiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofeijianyiEntity> page = this.selectPage(
                new Query<XiaofeijianyiEntity>(params).getPage(),
                new EntityWrapper<XiaofeijianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofeijianyiEntity> wrapper) {
		  Page<XiaofeijianyiView> page =new Query<XiaofeijianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofeijianyiVO> selectListVO(Wrapper<XiaofeijianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofeijianyiVO selectVO(Wrapper<XiaofeijianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofeijianyiView> selectListView(Wrapper<XiaofeijianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofeijianyiView selectView(Wrapper<XiaofeijianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
