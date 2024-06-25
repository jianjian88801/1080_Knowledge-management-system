package com.entity.view;

import com.entity.DiscusswendaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问答评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
@TableName("discusswenda")
public class DiscusswendaView  extends DiscusswendaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswendaView(){
	}
 
 	public DiscusswendaView(DiscusswendaEntity discusswendaEntity){
 	try {
			BeanUtils.copyProperties(this, discusswendaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
