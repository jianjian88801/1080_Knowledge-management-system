package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 资料下载
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
@TableName("ziliaoxiazai")
public class ZiliaoxiazaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZiliaoxiazaiEntity() {
		
	}
	
	public ZiliaoxiazaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 资料标题
	 */
					
	private String ziliaobiaoti;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：资料标题
	 */
	public void setZiliaobiaoti(String ziliaobiaoti) {
		this.ziliaobiaoti = ziliaobiaoti;
	}
	/**
	 * 获取：资料标题
	 */
	public String getZiliaobiaoti() {
		return ziliaobiaoti;
	}
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
