package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusschengshipaimingEntity;
import com.entity.view.DiscusschengshipaimingView;

import com.service.DiscusschengshipaimingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 城市排名评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-06 10:30:47
 */
@RestController
@RequestMapping("/discusschengshipaiming")
public class DiscusschengshipaimingController {
    @Autowired
    private DiscusschengshipaimingService discusschengshipaimingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschengshipaimingEntity discusschengshipaiming, HttpServletRequest request){

        EntityWrapper<DiscusschengshipaimingEntity> ew = new EntityWrapper<DiscusschengshipaimingEntity>();
    	PageUtils page = discusschengshipaimingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschengshipaiming), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschengshipaimingEntity discusschengshipaiming, HttpServletRequest request){
        EntityWrapper<DiscusschengshipaimingEntity> ew = new EntityWrapper<DiscusschengshipaimingEntity>();
    	PageUtils page = discusschengshipaimingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschengshipaiming), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschengshipaimingEntity discusschengshipaiming){
       	EntityWrapper<DiscusschengshipaimingEntity> ew = new EntityWrapper<DiscusschengshipaimingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschengshipaiming, "discusschengshipaiming")); 
        return R.ok().put("data", discusschengshipaimingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschengshipaimingEntity discusschengshipaiming){
        EntityWrapper< DiscusschengshipaimingEntity> ew = new EntityWrapper< DiscusschengshipaimingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschengshipaiming, "discusschengshipaiming")); 
		DiscusschengshipaimingView discusschengshipaimingView =  discusschengshipaimingService.selectView(ew);
		return R.ok("查询城市排名评论表成功").put("data", discusschengshipaimingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschengshipaimingEntity discusschengshipaiming = discusschengshipaimingService.selectById(id);
        return R.ok().put("data", discusschengshipaiming);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschengshipaimingEntity discusschengshipaiming = discusschengshipaimingService.selectById(id);
        return R.ok().put("data", discusschengshipaiming);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschengshipaimingEntity discusschengshipaiming, HttpServletRequest request){
    	discusschengshipaiming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschengshipaiming);

        discusschengshipaimingService.insert(discusschengshipaiming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschengshipaimingEntity discusschengshipaiming, HttpServletRequest request){
    	discusschengshipaiming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschengshipaiming);

        discusschengshipaimingService.insert(discusschengshipaiming);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusschengshipaimingEntity discusschengshipaiming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschengshipaiming);
        discusschengshipaimingService.updateById(discusschengshipaiming);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschengshipaimingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusschengshipaimingEntity> wrapper = new EntityWrapper<DiscusschengshipaimingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusschengshipaimingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
