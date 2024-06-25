package com.dao;

import com.entity.ZiliaoxiazaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiliaoxiazaiVO;
import com.entity.view.ZiliaoxiazaiView;


/**
 * 资料下载
 * 
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public interface ZiliaoxiazaiDao extends BaseMapper<ZiliaoxiazaiEntity> {
	
	List<ZiliaoxiazaiVO> selectListVO(@Param("ew") Wrapper<ZiliaoxiazaiEntity> wrapper);
	
	ZiliaoxiazaiVO selectVO(@Param("ew") Wrapper<ZiliaoxiazaiEntity> wrapper);
	
	List<ZiliaoxiazaiView> selectListView(@Param("ew") Wrapper<ZiliaoxiazaiEntity> wrapper);

	List<ZiliaoxiazaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZiliaoxiazaiEntity> wrapper);
	
	ZiliaoxiazaiView selectView(@Param("ew") Wrapper<ZiliaoxiazaiEntity> wrapper);
	
}
