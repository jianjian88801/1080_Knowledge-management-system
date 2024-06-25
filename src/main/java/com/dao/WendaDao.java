package com.dao;

import com.entity.WendaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WendaVO;
import com.entity.view.WendaView;


/**
 * 问答
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public interface WendaDao extends BaseMapper<WendaEntity> {
	
	List<WendaVO> selectListVO(@Param("ew") Wrapper<WendaEntity> wrapper);
	
	WendaVO selectVO(@Param("ew") Wrapper<WendaEntity> wrapper);
	
	List<WendaView> selectListView(@Param("ew") Wrapper<WendaEntity> wrapper);

	List<WendaView> selectListView(Pagination page,@Param("ew") Wrapper<WendaEntity> wrapper);
	
	WendaView selectView(@Param("ew") Wrapper<WendaEntity> wrapper);
	
}
