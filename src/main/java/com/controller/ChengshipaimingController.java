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

import com.entity.ChengshipaimingEntity;
import com.entity.view.ChengshipaimingView;

import com.service.ChengshipaimingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 城市排名
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
@RestController
@RequestMapping("/chengshipaiming")
public class ChengshipaimingController {
    @Autowired
    private ChengshipaimingService chengshipaimingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChengshipaimingEntity chengshipaiming, HttpServletRequest request){

        EntityWrapper<ChengshipaimingEntity> ew = new EntityWrapper<ChengshipaimingEntity>();
    	PageUtils page = chengshipaimingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chengshipaiming), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChengshipaimingEntity chengshipaiming, HttpServletRequest request){
        EntityWrapper<ChengshipaimingEntity> ew = new EntityWrapper<ChengshipaimingEntity>();
    	PageUtils page = chengshipaimingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chengshipaiming), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChengshipaimingEntity chengshipaiming){
       	EntityWrapper<ChengshipaimingEntity> ew = new EntityWrapper<ChengshipaimingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chengshipaiming, "chengshipaiming")); 
        return R.ok().put("data", chengshipaimingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChengshipaimingEntity chengshipaiming){
        EntityWrapper< ChengshipaimingEntity> ew = new EntityWrapper< ChengshipaimingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chengshipaiming, "chengshipaiming")); 
		ChengshipaimingView chengshipaimingView =  chengshipaimingService.selectView(ew);
		return R.ok("查询城市排名成功").put("data", chengshipaimingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChengshipaimingEntity chengshipaiming = chengshipaimingService.selectById(id);
        return R.ok().put("data", chengshipaiming);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChengshipaimingEntity chengshipaiming = chengshipaimingService.selectById(id);
        return R.ok().put("data", chengshipaiming);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChengshipaimingEntity chengshipaiming, HttpServletRequest request){
    	chengshipaiming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chengshipaiming);

        chengshipaimingService.insert(chengshipaiming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChengshipaimingEntity chengshipaiming, HttpServletRequest request){
    	chengshipaiming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chengshipaiming);

        chengshipaimingService.insert(chengshipaiming);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChengshipaimingEntity chengshipaiming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chengshipaiming);
        chengshipaimingService.updateById(chengshipaiming);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chengshipaimingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ChengshipaimingEntity> wrapper = new EntityWrapper<ChengshipaimingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = chengshipaimingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
