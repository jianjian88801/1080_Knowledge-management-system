package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswendaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswendaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswendaView;


/**
 * 问答评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public interface DiscusswendaService extends IService<DiscusswendaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswendaVO> selectListVO(Wrapper<DiscusswendaEntity> wrapper);
   	
   	DiscusswendaVO selectVO(@Param("ew") Wrapper<DiscusswendaEntity> wrapper);
   	
   	List<DiscusswendaView> selectListView(Wrapper<DiscusswendaEntity> wrapper);
   	
   	DiscusswendaView selectView(@Param("ew") Wrapper<DiscusswendaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswendaEntity> wrapper);
   	
}

