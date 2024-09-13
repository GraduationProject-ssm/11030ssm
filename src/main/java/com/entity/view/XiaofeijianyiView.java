package com.entity.view;

import com.entity.XiaofeijianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消费建议
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
@TableName("xiaofeijianyi")
public class XiaofeijianyiView  extends XiaofeijianyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaofeijianyiView(){
	}
 
 	public XiaofeijianyiView(XiaofeijianyiEntity xiaofeijianyiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaofeijianyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
