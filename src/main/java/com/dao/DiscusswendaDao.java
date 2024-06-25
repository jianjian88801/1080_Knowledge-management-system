package com.dao;

import com.entity.DiscusswendaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswendaVO;
import com.entity.view.DiscusswendaView;


/**
 * 问答评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public interface DiscusswendaDao extends BaseMapper<DiscusswendaEntity> {
	
	List<DiscusswendaVO> selectListVO(@Param("ew") Wrapper<DiscusswendaEntity> wrapper);
	
	DiscusswendaVO selectVO(@Param("ew") Wrapper<DiscusswendaEntity> wrapper);
	
	List<DiscusswendaView> selectListView(@Param("ew") Wrapper<DiscusswendaEntity> wrapper);

	List<DiscusswendaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswendaEntity> wrapper);
	
	DiscusswendaView selectView(@Param("ew") Wrapper<DiscusswendaEntity> wrapper);
	
}
