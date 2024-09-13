package com.entity.view;

import com.entity.DiscusschengshipaimingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 城市排名评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 10:30:47
 */
@TableName("discusschengshipaiming")
public class DiscusschengshipaimingView  extends DiscusschengshipaimingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschengshipaimingView(){
	}
 
 	public DiscusschengshipaimingView(DiscusschengshipaimingEntity discusschengshipaimingEntity){
 	try {
			BeanUtils.copyProperties(this, discusschengshipaimingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
