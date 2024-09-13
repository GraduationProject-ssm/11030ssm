package com.entity.view;

import com.entity.GerenxiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 个人消费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
@TableName("gerenxiaofei")
public class GerenxiaofeiView  extends GerenxiaofeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GerenxiaofeiView(){
	}
 
 	public GerenxiaofeiView(GerenxiaofeiEntity gerenxiaofeiEntity){
 	try {
			BeanUtils.copyProperties(this, gerenxiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
