package com.entity.vo;

import com.entity.XiaofeijianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 消费建议
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public class XiaofeijianyiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 消费类型
	 */
	
	private String xiaofeileixing;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 建议消费
	 */
	
	private String jianyixiaofei;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
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
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：建议消费
	 */
	 
	public void setJianyixiaofei(String jianyixiaofei) {
		this.jianyixiaofei = jianyixiaofei;
	}
	
	/**
	 * 获取：建议消费
	 */
	public String getJianyixiaofei() {
		return jianyixiaofei;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
