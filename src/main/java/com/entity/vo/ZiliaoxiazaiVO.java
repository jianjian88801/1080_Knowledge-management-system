package com.entity.vo;

import com.entity.ZiliaoxiazaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资料下载
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public class ZiliaoxiazaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资料分类
	 */
	
	private String ziliaofenlei;
		
	/**
	 * 封面图
	 */
	
	private String fengmiantu;
		
	/**
	 * 内容简介
	 */
	
	private String neirongjianjie;
		
	/**
	 * 资料
	 */
	
	private String ziliao;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
				
	
	/**
	 * 设置：资料分类
	 */
	 
	public void setZiliaofenlei(String ziliaofenlei) {
		this.ziliaofenlei = ziliaofenlei;
	}
	
	/**
	 * 获取：资料分类
	 */
	public String getZiliaofenlei() {
		return ziliaofenlei;
	}
				
	
	/**
	 * 设置：封面图
	 */
	 
	public void setFengmiantu(String fengmiantu) {
		this.fengmiantu = fengmiantu;
	}
	
	/**
	 * 获取：封面图
	 */
	public String getFengmiantu() {
		return fengmiantu;
	}
				
	
	/**
	 * 设置：内容简介
	 */
	 
	public void setNeirongjianjie(String neirongjianjie) {
		this.neirongjianjie = neirongjianjie;
	}
	
	/**
	 * 获取：内容简介
	 */
	public String getNeirongjianjie() {
		return neirongjianjie;
	}
				
	
	/**
	 * 设置：资料
	 */
	 
	public void setZiliao(String ziliao) {
		this.ziliao = ziliao;
	}
	
	/**
	 * 获取：资料
	 */
	public String getZiliao() {
		return ziliao;
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
			
}
