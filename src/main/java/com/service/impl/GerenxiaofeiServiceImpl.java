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


import com.dao.GerenxiaofeiDao;
import com.entity.GerenxiaofeiEntity;
import com.service.GerenxiaofeiService;
import com.entity.vo.GerenxiaofeiVO;
import com.entity.view.GerenxiaofeiView;

@Service("gerenxiaofeiService")
public class GerenxiaofeiServiceImpl extends ServiceImpl<GerenxiaofeiDao, GerenxiaofeiEntity> implements GerenxiaofeiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GerenxiaofeiEntity> page = this.selectPage(
                new Query<GerenxiaofeiEntity>(params).getPage(),
                new EntityWrapper<GerenxiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GerenxiaofeiEntity> wrapper) {
		  Page<GerenxiaofeiView> page =new Query<GerenxiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GerenxiaofeiVO> selectListVO(Wrapper<GerenxiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GerenxiaofeiVO selectVO(Wrapper<GerenxiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GerenxiaofeiView> selectListView(Wrapper<GerenxiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GerenxiaofeiView selectView(Wrapper<GerenxiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
