package com.entity.model;

import com.entity.ChengshipaimingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 城市排名
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public class ChengshipaimingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 消费类型
	 */
	
	private String xiaofeileixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 平均消费额
	 */
	
	private Integer pingjunxiaofeie;
		
	/**
	 * 城市
	 */
	
	private String chengshi;
		
	/**
	 * 排名
	 */
	
	private String paiming;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 简述
	 */
	
	private String jianshu;
				
	
	/**
	 * 设置：消费类型
	 */
	 
	public void setXiaofeileixing(String xiaofeileixing) {
		this.xiaofeileixing = xiaofeileixing;
	}
	
	/**
	 * 获取：消费类型
	 */
	public String getXiaofeileixing() {
		return xiaofeileixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：平均消费额
	 */
	 
	public void setPingjunxiaofeie(Integer pingjunxiaofeie) {
		this.pingjunxiaofeie = pingjunxiaofeie;
	}
	
	/**
	 * 获取：平均消费额
	 */
	public Integer getPingjunxiaofeie() {
		return pingjunxiaofeie;
	}
				
	
	/**
	 * 设置：城市
	 */
	 
	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}
	
	/**
	 * 获取：城市
	 */
	public String getChengshi() {
		return chengshi;
	}
				
	
	/**
	 * 设置：排名
	 */
	 
	public void setPaiming(String paiming) {
		this.paiming = paiming;
	}
	
	/**
	 * 获取：排名
	 */
	public String getPaiming() {
		return paiming;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：简述
	 */
	 
	public void setJianshu(String jianshu) {
		this.jianshu = jianshu;
	}
	
	/**
	 * 获取：简述
	 */
	public String getJianshu() {
		return jianshu;
	}
			
}
