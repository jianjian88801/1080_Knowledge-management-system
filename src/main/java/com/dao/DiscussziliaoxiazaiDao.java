package com.dao;

import com.entity.DiscussziliaoxiazaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussziliaoxiazaiVO;
import com.entity.view.DiscussziliaoxiazaiView;


/**
 * 资料下载评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public interface DiscussziliaoxiazaiDao extends BaseMapper<DiscussziliaoxiazaiEntity> {
	
	List<DiscussziliaoxiazaiVO> selectListVO(@Param("ew") Wrapper<DiscussziliaoxiazaiEntity> wrapper);
	
	DiscussziliaoxiazaiVO selectVO(@Param("ew") Wrapper<DiscussziliaoxiazaiEntity> wrapper);
	
	List<DiscussziliaoxiazaiView> selectListView(@Param("ew") Wrapper<DiscussziliaoxiazaiEntity> wrapper);

	List<DiscussziliaoxiazaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussziliaoxiazaiEntity> wrapper);
	
	DiscussziliaoxiazaiView selectView(@Param("ew") Wrapper<DiscussziliaoxiazaiEntity> wrapper);
	
}
