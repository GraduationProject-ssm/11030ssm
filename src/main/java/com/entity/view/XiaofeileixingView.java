package com.entity.view;

import com.entity.XiaofeileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消费类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
@TableName("xiaofeileixing")
public class XiaofeileixingView  extends XiaofeileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaofeileixingView(){
	}
 
 	public XiaofeileixingView(XiaofeileixingEntity xiaofeileixingEntity){
 	try {
			BeanUtils.copyProperties(this, xiaofeileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
