package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WendaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WendaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WendaView;


/**
 * 问答
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public interface WendaService extends IService<WendaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WendaVO> selectListVO(Wrapper<WendaEntity> wrapper);
   	
   	WendaVO selectVO(@Param("ew") Wrapper<WendaEntity> wrapper);
   	
   	List<WendaView> selectListView(Wrapper<WendaEntity> wrapper);
   	
   	WendaView selectView(@Param("ew") Wrapper<WendaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WendaEntity> wrapper);
   	
}

