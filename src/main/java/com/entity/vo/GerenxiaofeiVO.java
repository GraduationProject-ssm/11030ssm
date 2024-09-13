package com.entity.vo;

import com.entity.GerenxiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 个人消费
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-06 10:30:46
 */
public class GerenxiaofeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 消费类型
	 */
	
	private String xiaofeileixing;
		
	/**
	 * 消费金额
	 */
	
	private Integer xiaofeijine;
		
	/**
	 * 内容
	 */
	
	private String neirong;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：消费金额
	 */
	 
	public void setXiaofeijine(Integer xiaofeijine) {
		this.xiaofeijine = xiaofeijine;
	}
	
	/**
	 * 获取：消费金额
	 */
	public Integer getXiaofeijine() {
		return xiaofeijine;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
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
			
}
